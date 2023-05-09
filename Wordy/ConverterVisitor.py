from WordyParser import WordyParser
from WordyVisitor import *


class ConverterVisitor(WordyVisitor):
    code_header = ""
    main_code = ""
    variable_code = ""
    routine_code = ""

    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)
        self.code_header += "import java.util.Scanner;\n"
        self.code_header += "public class " + args[0] - ".wordy" + "{\n"
        self.code_header += "Scanner input = new Scanner(System.in);\n"

    def visitProgram(self, ctx: WordyParser.ProgramContext):
        self.main_code += "public static void main(String[] args){\n"
        visitStatementList(ctx.statementList())
        self.main_code += "}\n"
        return self.code_header + self.variable_code + self.main_code + self.routine_code + "\n}\n"

    def visitAssignVar(self, ctx:WordyParser.AssignVarContext):
        return None

    def visitAssignVarConst(self, ctx:WordyParser.AssignVarConstContext):
        var_name = WordyVisitor.visitVariable(ctx.variable())
        self.variable_code += "private final " + var_name + " = " + WordyVisitor.visitVarValue(ctx.varValue())
