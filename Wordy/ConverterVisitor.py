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
        self.code_header += "private static Scanner input = new Scanner(System.in);\n"
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
            if isinstance(value, bool):
                self.writeCode(var_name + " = " + str(value).lower() + ";\n")
                return
            if ctx.varValue().INPUT() is not None:
                value = "input.next()"
            if value is "":
                value = "\"\""
            self.writeCode(var_name + " = " + str(value) + ";\n")
            return
        if ctx.varValue().IDENTIFIER() is not None:
            self.writeCode(var_name + " = " + str(value) + ";\n")
        if ctx.varValue().expression() is not None:
            self.writeCode(var_name + " = " + str(value) + ";\n")
            self.variables[var_name] = 0
            self.variable_code += "private static " + "int" + " " + var_name + ";\n"
            return
        val_type = ""
        val_str = ""
        if type(value) is str and value.startswith("new String("):
            self.writeCode(var_name + " = " + value + ";\n")
        if ctx.varValue().INPUT() is not None:
            self.writeCode(var_name + " = " + "input.next()" + ";\n")
            val_type += self.types.get(str)
            value = ""
        elif type(value) in self.types:
            if isinstance(value, list):
                val_type += self.types.get(type(value[0])) + "[]"
                val_str += "{" + str(value) + "}"
            else:
                val_type += self.types.get(type(value))
            if type(value) is str and not value.startswith("new String("):
                if ctx.varValue().stringTerm().concat() is None:
                    val_str = "\"" + value + "\""
                else:
                    val_str = str(value)
                    self.variables[var_name] = ""
                    self.variable_code += "private static " + val_type + " " + var_name + ";\n"
                    self.writeCode(var_name + " = " + str(value) + ";\n")
                    return
            else:
                val_str = str(value)
                if isinstance(value, bool):
                    val_str = val_str.lower()
        elif ctx.varValue().newThing() is not None:
            val_type += ctx.varValue().newThing().IDENTIFIER().symbol.text
            val_str += "new " + val_type
        elif ctx.varValue().propCall() is not None:
            val_type += self.types[type(self.variables[value])]
            self.variables[var_name] = val_str
            self.variable_code += "private static " + val_type + " " + var_name + ";\n"
        if ctx.varValue().IDENTIFIER() is not None or ctx.varValue().INPUT() is not None:
            self.variables[var_name] = value
            self.variable_code += "private static " + val_type + " " + var_name + ";\n"
            return
        if ctx.varValue().stringTerm() is not None and value.startswith("new String("):
            self.variables[var_name] = self.variables.get(value[11: len(value) - 1])
            self.variable_code += "private static " + val_type + " " + var_name + ";\n"
            return
        self.variables[var_name] = value
        self.variable_code += "private static " + val_type + " " + var_name + " = " + val_str + ";\n"

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
        self.variable_code += "private static final " + val_type + " " + var_name + " = " + str(val_str) + ";\n"

    def visitDefParam(self, ctx: WordyParser.DefParamContext):
        return str(self.types.get(ctx.returnType()) + " " + str(ctx.IDENTIFIER()))

    def visitOutputStmt(self, ctx: WordyParser.OutputStmtContext):
        statement = ""
        if ctx.IDENTIFIER() is not None:
            statement += ctx.IDENTIFIER().symbol.text
        else:
            statement += self.visitExpression(ctx.expression())
        return statement

    def visitStringConstant(self, ctx: WordyParser.StringConstantContext):
        text = ctx.getChild(0).symbol.text
        return text[1: len(text) - 1]

    def visitStringTerm(self, ctx: WordyParser.StringTermContext):
        if ctx.concat() is not None:
            return self.visit(ctx.concat())
        if ctx.stringConstant() is not None:
            return self.visit(ctx.stringConstant())
        if ctx.IDENTIFIER() is not None:
            return ctx.IDENTIFIER().symbol.text
        if ctx.funcCall() is not None:
            return self.visit(ctx.funcCall())
        if ctx.castStr() is not None:
            return self.visit(ctx.castStr())

    def visitFuncBody(self, ctx: WordyParser.FuncBodyContext):
        self.visitStatementList(ctx.statementList())
        self.routine_code += "return " + self.visitOutputStmt(ctx.outputStmt()) + ";\n"

    def visitDefFunc(self, ctx: WordyParser.DefFuncContext):
        self.main = 2
        return_type = ""
        if ctx.returnType() is not None:
            return_type += str(self.types.get(ctx.returnType()))
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
        self.routine_code += str(self.visitFuncBody(ctx.funcBody()))
        self.routine_code += "}\n"
        self.main = 1

    def visitBool(self, ctx: WordyParser.BoolContext):
        if ctx.IDENTIFIER() is not None:
            return ctx.IDENTIFIER().symbol.text
        if ctx.boolConst().TRUE() is not None:
            return True
        return False

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
        if ctx.IDENTIFIER() is not None:
            return "new String(String.valueOf(" + ctx.IDENTIFIER().symbol.text + "))"
        return "new String(String.valueOf(" + str(self.visit(ctx.factor())) + "))"

    def visitArray(self, ctx: WordyParser.ArrayContext):
        array = []
        i = 0
        while ctx.arrayTerm(i) is not None:
            array.append(self.visitArrayTerm(ctx.arrayTerm(i)))
            i += 1
        return array

    def visitSayStmt(self, ctx: WordyParser.SayStmtContext):
        if ctx.stringTerm().stringConstant() is not None:
            string = "\"" + self.visitStringTerm(ctx.stringTerm()) + "\""
        else:
            string = self.visitStringTerm(ctx.stringTerm())
        self.writeCode("System.out.println(" + string + ");\n")

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
            string = ctx.IDENTIFIER().symbol.text + " + "
        else:
            term = str(ctx.getChild(0))
            string = "\"" + term[1: len(term) - 1] + "\" + "
        i = 0
        while ctx.stringTerm(i) is not None:
            if ctx.stringTerm(i).IDENTIFIER() is not None or ctx.stringTerm(i).concat() is not None:
                string += str(self.visitStringTerm(ctx.stringTerm(i)))
            else:
                string += "\"" + str(self.visitStringTerm(ctx.stringTerm(i))) + "\""
            i += 1
        # string += ")"
        return string

    def visitRelOpExpr(self, ctx: WordyParser.RelOpExprContext):
        val1 = self.visit(ctx.getChild(0))
        if isinstance(val1, bool) and ctx.bool_(1) is None:
            return str(val1).lower()
        if ctx.relOp() is None:
            return val1
        op = self.visitRelOp(ctx.relOp())
        val2 = self.visit(ctx.getChild(2))
        if ctx.stringTerm(1) is not None:
            if ctx.getChild(2).IDENTIFIER() is None:
                val2 = "\"" + val2 + "\""
            if op is "==":
                op = ".equals("
                return str(val1) + str(op) + str(val2) + ")"
        if isinstance(val2, bool):
            val2 = str(val2).lower()
        return str(val1) + str(op) + str(val2)

    def visitRelOp(self, ctx: WordyParser.RelOpContext):
        if ctx.eqlOp() is not None:
            return "=="
        if ctx.neqOp() is not None:
            return "!="
        if ctx.ltOp() is not None:
            return "<"
        if ctx.leqOp() is not None:
            return "<="
        if ctx.gtOp() is not None:
            return ">"
        if ctx.geqOp() is not None:
            return ">="

    def visitNumTerm(self, ctx: WordyParser.NumTermContext):
        term = self.visit(ctx.factor(0))
        i = 0
        while ctx.mulOp(i) is not None:
            term += " " + self.visitMulOp(ctx.mulOp(i)) + " " + str(self.visit(ctx.factor(i + 1)))
            i += 1
        return term

    def visitMulOp(self, ctx: WordyParser.MulOpContext):
        return ctx.getText()

    def visitAddOp(self, ctx: WordyParser.AddOpContext):
        return ctx.getText()

    def visitNumExpression(self, ctx: WordyParser.NumExpressionContext):
        if ctx.castNum() is not None:
            return self.visitCastNum(ctx.castNum())
        if ctx.ADD() is not None:
            i = 1
            term = str(self.visitNumTerm(ctx.numTerm(0)))
            while ctx.numTerm(i) is not None:
                term += " + " + str(self.visitNumTerm(ctx.numTerm(i)))
                i += 1
            return term
        term = ""
        if ctx.sign() is not None:
            term += ctx.sign().symbol.text
        term += str(self.visitNumTerm(ctx.numTerm(0)))
        i = 0
        while ctx.addOp(i) is not None:
            term += " " + self.visitAddOp(ctx.addOp(i)) + " " + str(self.visitNumTerm(ctx.numTerm(i + 1)))
            i += 1
        return term
