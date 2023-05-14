from SymTableStuff.SymTable import *
import VarType
from WordyParser import WordyParser
class RoutineInfo:
    args = []
    subroutines = []
    context: WordyParser.DefFuncContext
    symTable: SymTable
    outputType: VarType.VarType