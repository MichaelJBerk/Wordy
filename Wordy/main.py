import antlr4
from antlr4 import *
from WordyLexer import WordyLexer

code = open('hellowordy.wordy', 'r').read()
codeStream = InputStream(code)
lexer = WordyLexer(codeStream)

tokens = lexer.getAllTokens()

for t in tokens:
    print(t.text, t.type)

