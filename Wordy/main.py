import antlr4
from antlr4 import *
from WordyLexer import WordyLexer
from WordyParser import *
from WordyVisitor import *
from SemVisitor import SemVisitor
from SymTableStuff.SymTable import *
def main(args):

    if len(args) < 2:
        file = "samples/visitTest.wordy"
    else:
        file = args[1]

    code = open(file, 'r').read()
    parseAndVisit(code)

def parseAndVisit(code):
    print("Code:" + code)
    codeStream = InputStream(code)
    lexer = WordyLexer(codeStream)
    tokenStream = CommonTokenStream(lexer)

    #TODO: Ask how to handle "Invalid Variable", given that antlr already doesn't allow it

    parser = WordyParser(tokenStream)
    tree = parser.program()
    symTable = SymTable(0)
    programId = SymTableEntry("wordyPrgm", Kind.UNDEFINED, symTable)
    visitor = SemVisitor()
    visitor.visit(tree.statementList())

    print(visitor)

if "pytest" not in sys.argv[0]:
    main(sys.argv)
