from WordyParser import WordyParser
from WordyVisitor import *


class ConverterVisitor(WordyVisitor):
    code_header = ""
    main_code = ""
    variable_code = ""
    routine_code = ""
    inner_classes = ""
    variables = []
    types = {
        str: "String",
        int: "int",
        float: "double",
        bool: "boolean",
    }
    main = True

    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

    def writeCode(self, code):
        if self.main:
            self.main_code += code
        else:
            self.routine_code += code

    # def getType(self, value):
    #     if type(value) is WordyParser.NumberContext:
    #         if type(value.getChild(0).getChild(0)) is WordyParser.IntegerConstantContext:
    #             return "int"
    #         else: return "double"

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

    def visitAssignVar(self, ctx: WordyParser.AssignVarContext):
        var_name = self.visitVariable(ctx.variable())
        if self.variables.__contains__(var_name):
            self.writeCode(var_name + " = " + str(self.visitVarValue(ctx.varValue())) + ";\n")
            return
        self.variables.append(var_name)
        value = self.visitVarValue(ctx.varValue())

        val_type = ""
        val_str = ""
        if ctx.varValue().INPUT() is not None:
            val_type += self.types.get(str)
            val_str += "input.next()"
        elif self.types.keys().__contains__(type(value)):
            val_type += self.types.get(type(value))
            if type(value) is str:
                val_str = "\"" + value + "\""
            else:
                val_str = value
        elif isinstance(value, list):
            val_type += self.types.get(type(value[0])) + "[]"
            val_str += "{" + ', '.join([str(item) for item in value]) + "}"
        self.variable_code += "private " + val_type + " " + var_name + " = " + val_str + ";\n"

    def visitAssignVarConst(self, ctx: WordyParser.AssignVarConstContext):
        var_name = self.visitVariable(ctx.variable())
        self.variables.append(var_name)
        value = self.visitVarValue(ctx.varValue())

        val_type = ""
        val_str = ""
        if ctx.varValue().INPUT() is not None:
            val_type += self.types.get(str)
            val_str += "input.next()"
        elif self.types.keys().__contains__(type(value)):
            val_type += self.types.get(type(value))
            if type(value) is str:
                val_str = "\"" + value + "\""
            else:
                val_str = value
        elif isinstance(value, list):
            val_type += self.types.get(type(value[0])) + "[]"
            val_str += "{" + ', '.join([str(item) for item in value]) + "}"
        self.variable_code += "private final " + val_type + " " + var_name + " = " + str(val_str) + ";\n"

    def visitDefParam(self, ctx: WordyParser.DefParamContext):
        return str(self.types.get(ctx.TYPE()) + " " + str(ctx.IDENTIFIER()))

    def visitOutputStmt(self, ctx: WordyParser.OutputStmtContext):
        statement = ""
        if ctx.IDENTIFIER() is not None:
            statement = ctx.IDENTIFIER().symbol.text
        else:
            statement = self.visitExpression(ctx.expression())
        return statement

    def visitDefFunc(self, ctx: WordyParser.DefFuncContext):
        self.main = False
        return_type = ""
        if ctx.TYPE() is not None:
            return_type = self.types.get(ctx.TYPE())
        else:
            return_type = "void"
        params = ""
        if ctx.defParam(0) is not None:
            params += self.visitDefParam(ctx.defParam(0))
            i = 1
            while ctx.defParam(i) is not None:
                params += ", " + self.visitDefParam(ctx.defParam(0))
        self.routine_code += "public " + return_type + " " + ctx.IDENTIFIER().symbol.text + " (" + params + "){\n"
        self.visitStatementList(ctx.statementList())
        if return_type is not "void":
            self.routine_code += "return " + self.visitOutputStmt(ctx.outputStmt())
        self.main = True

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

    def visitArray(self, ctx: WordyParser.ArrayContext):
        return "["

    def visitSayStmt(self, ctx: WordyParser.SayStmtContext):
        self.writeCode("System.out.println(" + self.visitStringTerm(ctx.stringTerm()) + ")")
