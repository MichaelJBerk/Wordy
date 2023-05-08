import antlr4
from antlr4 import *
from WordyLexer import WordyLexer
from WordyParser import *
from WordyVisitor import *
from SemVisitor import SemVisitor
from SymTableStuff.SymTable import *
def main(args):

    code = open('visitTest.wordy', 'r').read()

    codeStream = InputStream(code)
    lexer = WordyLexer(codeStream)
    tokenStream = CommonTokenStream(lexer)

    #TODO: Make sym table entry to start off parser
    #
    # for t in tokens:
    #     print(t.text, t.type)
    parser = WordyParser(tokenStream)
    tree = parser.program()
    symTable = SymTable(0)
    programId = SymTableEntry("wordyPrgm", Kind.UNDEFINED, symTable, None)
    visitor = SemVisitor()
    visitor.visit(tree.statementList())

    print(visitor)

main(sys.argv)
