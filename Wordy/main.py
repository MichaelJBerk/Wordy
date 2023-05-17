import antlr4
from antlr4 import *
from antlr4.error.ErrorListener import ConsoleErrorListener

from WordyLexer import WordyLexer
from WordyParser import *
from WordyVisitor import *
from SemVisitor import SemVisitor
from ConverterVisitor import ConverterVisitor
from SymTableStuff.SymTable import *
from WordyErrors import PARSER_ERROR
# import WListener

class WListener(ConsoleErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        super().syntaxError(recognizer, offendingSymbol, line, column, msg, e)
        raise PARSER_ERROR()

def main(args):

    if len(args) < 2:
        file = "hangman.wordy"
    else:
        file = args[1]

    code = open(file, 'r').read()
    # parseAndVisit(code)
    secondPass(code)

def parseAndVisit(code):
    print("Code:" + code)
    codeStream = InputStream(code)
    lexer = WordyLexer(codeStream)
    tokenStream = CommonTokenStream(lexer)

    parser = WordyParser(tokenStream)
    listner = WListener()
    parser.addErrorListener(listner)
    tree = parser.program()
    symTable = SymTable(0)
    programId = SymTableEntry("wordyPrgm", Kind.UNDEFINED, symTable)
    visitor = SemVisitor()

    visitor.visit(tree.statementList())
    print(visitor)
    return visitor, tree

def secondPass(code):
    print("Code:" + code)
    codeStream = InputStream(code)
    lexer = WordyLexer(codeStream)
    tokenStream = CommonTokenStream(lexer)

    parser = WordyParser(tokenStream)
    listner = WListener()
    parser.addErrorListener(listner)
    tree = parser.program()
    symTable = SymTable(0)
    programId = SymTableEntry("wordyPrgm", Kind.UNDEFINED, symTable)
    visitor = ConverterVisitor()

    print(visitor.visit(tree))
    return visitor, tree

if "pytest" not in sys.argv[0]:
    main(sys.argv)