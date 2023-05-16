from WordyParser import WordyParser
from WordyVisitor import *


class ConverterVisitor(WordyVisitor):
    code_header = ""
    main_code = ""
    variable_code = ""
    routine_code = ""
    inner_classes = ""
    variables = {}
    types = {
        str: "String",
        int: "int",
        float: "double",
        bool: "boolean",
        list: None
    }
    main = 1

    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

    def writeCode(self, code):
        if self.main is 1:
            self.main_code += code
        elif self.main is 2:
            self.routine_code += code
        else:
            self.inner_classes += code

    def visitProgram(self, ctx: WordyParser.ProgramContext):
        self.code_header += "import java.util.Scanner;\n"
        self.code_header += "public class " + ctx.IDENTIFIER().symbol.text + " {\n"
        self.code_header += "Scanner input = new Scanner(System.in);\n"
        self.main_code += "public static void main(String[] args){\n"
        self.visitStatementList(ctx.statementList())
        self.main_code += "}\n"
        return self.code_header + self.variable_code + self.main_code + self.routine_code + "\n}\n"

    def visitIntegerConstant(self, ctx: WordyParser.IntegerConstantContext):
        return int(ctx.INTEGER().symbol.text)

    def visitRealConstant(self, ctx: WordyParser.RealConstantContext):
        return float(ctx.REAL().symbol.text)

    def visitVariable(self, ctx: WordyParser.VariableContext):
        return str(ctx.IDENTIFIER().symbol.text)

    def visitPropCall(self, ctx: WordyParser.PropCallContext):
        return ctx.getText()

    def visitFuncCall(self, ctx: WordyParser.FuncCallContext):
        function = ctx.IDENTIFIER().symbol.text + "("
        if ctx.funcCallArg(0) is not None:
            function += self.visitFuncCallArg(ctx.funcCallArg(0))
            i = 1
            while ctx.funcCallArg(i) is not None:
                function += ", " + self.visitFuncCallArg(ctx.funcCallArg(i))
                i += 1
        function += ")"
        return function

    def visitAssignVar(self, ctx: WordyParser.AssignVarContext):
        var_name = self.visitVariable(ctx.variable())
        value = self.visitVarValue(ctx.varValue())
        if var_name in self.variables:
            self.writeCode(var_name + " = " + str(value) + ";\n")
            return
        val_type = ""
        val_str = ""
        if ctx.varValue().INPUT() is not None:
            val_type += self.types.get(str)
            val_str += "input.next()"
        elif type(value) in self.types:
            if isinstance(value, list):
                val_type += self.types.get(type(value[0])) + "[]"
                val_str += "{" + str(value) + "}"
            else:
                val_type += self.types.get(type(value))
            if type(value) is str:
                val_str = "\"" + value + "\""
            else:
                val_str = str(value)
        elif ctx.varValue().newThing() is not None:
            val_type += ctx.varValue().newThing().IDENTIFIER().symbol.text
            val_str += "new " + val_type
        elif ctx.varValue().propCall() is not None:
            val_type += self.types[type(self.variables[value])]
            self.variables[var_name] = val_str
            self.variable_code += "private " + val_type + " " + var_name + ";\n"
        self.variables[var_name] = value
        self.variable_code += "private " + val_type + " " + var_name + " = " + val_str + ";\n"

    def visitAssignVarConst(self, ctx: WordyParser.AssignVarConstContext):
        var_name = self.visitVariable(ctx.variable())
        value = self.visitVarValue(ctx.varValue())
        val_type = ""
        val_str = ""
        if type(value) in self.types:
            if isinstance(value, list):
                val_type = self.types.get(type(value[0])) + "[]"
                val_str += "{" + str(value) + "}"
            else:
                val_type += self.types.get(type(value))
            if type(value) is str:
                val_str = "\"" + value + "\""
            else:
                val_str = str(value)
        elif ctx.varValue().newThing() is not None:
            val_type += ctx.varValue().newThing().IDENTIFIER().symbol.text
            val_str += "new " + val_type
        self.variables[var_name] = value
        self.variable_code += "private final " + val_type + " " + var_name + " = " + str(val_str) + ";\n"

    def visitDefParam(self, ctx: WordyParser.DefParamContext):
        return str(self.types.get(ctx.TYPE()) + " " + str(ctx.IDENTIFIER()))

    def visitOutputStmt(self, ctx: WordyParser.OutputStmtContext):
        statement = ""
        if ctx.IDENTIFIER() is not None:
            statement += ctx.IDENTIFIER().symbol.text
        else:
            statement += self.visitExpression(ctx.expression())
        return statement

    def visitFuncBody(self, ctx: WordyParser.FuncBodyContext):
        self.visitStatementList(ctx.statementList())
        self.routine_code += "return " + self.visitOutputStmt(ctx.outputStmt()) + ";\n"

    def visitDefFunc(self, ctx: WordyParser.DefFuncContext):
        self.main = 2
        return_type = ""
        if ctx.returnType() is not None:
            return_type += self.types.get(ctx.returnType())
        else:
            return_type += "void"
        params = ""
        if ctx.defParam(0) is not None:
            params += self.visitDefParam(ctx.defParam(0))
            i = 1
            while ctx.defParam(i) is not None:
                params += ", " + self.visitDefParam(ctx.defParam(0))
                i += 1
        self.routine_code += "public " + return_type + " " + ctx.IDENTIFIER().symbol.text + " (" + params + "){\n"
        self.routine_code += self.visitFuncBody(ctx.funcBody())
        self.routine_code += "}\n"
        self.main = 1

    def visitArrayQuery(self, ctx: WordyParser.ArrayQueryContext):
        index = ""
        if ctx.IDENTIFIER(1) is not None:
            index = str(self.visitUnsignedNumber(ctx.unsignedNumber()))
        else:
            index = ctx.IDENTIFIER(1).symbol.text
        return ctx.IDENTIFIER(0).symbol.text + "[" + index + "]"

    def visitCastNum(self, ctx: WordyParser.CastNumContext):
        var = ""
        if str(ctx.NUM_TYPE()).lower() is "int":
            if ctx.IDENTIFIER() is not None:
                var = ctx.IDENTIFIER().symbol.text
            else:
                var = str(self.visit(ctx.factor()))
            return "(int) " + var
        if ctx.IDENTIFIER() is not None:
            var = ctx.IDENTIFIER().symbol.text
        else:
            var = str(self.visit(ctx.factor()))
        return "(double) " + var

    def visitCastStr(self, ctx: WordyParser.CastStrContext):
        return "new String(" + ctx.IDENTIFIER().symbol.text + ")"

    def visitArray(self, ctx: WordyParser.ArrayContext):
        array = []
        if ctx.arrayTerm(0) is not None:
            array.append(self.visitArrayTerm(ctx.arrayTerm(0)))
            i = 1
            while ctx.arrayTerm(i) is not None:
                array.append(self.visitArrayTerm(ctx.arrayTerm(i)))
                i += 1
        return array

    def visitSayStmt(self, ctx: WordyParser.SayStmtContext):
        self.writeCode("System.out.println(" + self.visitStringTerm(ctx.stringTerm()) + ");\n")

    def visitIfStmt(self, ctx: WordyParser.IfStmtContext):
        self.writeCode("if (" + self.visitRelOpExpr(ctx.relOpExpr()) + "){\n")
        self.visitCurlyStatementList(ctx.curlyStatementList(0))
        self.writeCode("}\n")
        if ctx.OTHERWISE() is not None:
            self.writeCode("else{\n")
            self.visitCurlyStatementList(ctx.curlyStatementList(1))
            self.writeCode("}\n")

    def visitLoopEachStmt(self, ctx: WordyParser.LoopEachStmtContext):
        self.writeCode("for (")
        if ctx.IDENTIFIER(1) is not None:
            array_val = self.variables.get(ctx.IDENTIFIER(1).symbol.text)
            self.writeCode(self.types.get(type(array_val[0])) + " " + ctx.IDENTIFIER(0).symbol.text + ": " +
                           ctx.IDENTIFIER(1).symbol.text + "){\n")
        else:
            array_val = self.visitArray(ctx.array())
            self.writeCode(self.types.get(type(array_val[0])) + " " + ctx.IDENTIFIER(0).symbol.text + ": {" +
                           str(array_val) + "}){\n")
        self.visitCurlyStatementList(ctx.curlyStatementList())
        self.writeCode("}\n")

    def visitLoopUntilStment(self, ctx: WordyParser.LoopUntilStmentContext):
        self.writeCode("while(!" + self.visitRelOpExpr(ctx.relOpExpr()) + "){\n")
        self.visitCurlyStatementList(ctx.curlyStatementList())
        self.writeCode("}\n")

    def visitDefThing(self, ctx: WordyParser.DefThingContext):
        self.main = 3
        self.writeCode("class " + ctx.IDENTIFIER().symbol.text + "{\n")
        i = 0
        while ctx.assignStmt(i) is not None:
            self.visitAssignStmt(ctx.assignStmt(i))
            i += 1
        self.writeCode("}\n")
        self.main = 1

    def visitConcat(self, ctx: WordyParser.ConcatContext):
        string = ""
        if ctx.IDENTIFIER() is not None:
            string = "(" + ctx.IDENTIFIER().symbol.text + " + "
        else:
            string = "(" + str(ctx.STRING())
        i = 0
        while ctx.stringTerm(i) is not None:
            string += self.visitStringTerm(ctx.stringTerm(i))
            i += 1
        string += ")"
