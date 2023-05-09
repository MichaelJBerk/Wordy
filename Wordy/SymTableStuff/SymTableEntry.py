from enum import Enum


class Kind(Enum):
    CONSTANT = 1
    ENUMERATION_CONSTANT = 2
    TYPE = 3
    VARIABLE = 4
    RECORD_FIELD = 5
    VALUE_PARAMETER = 6
    REFERENCE_PARAMETER = 7
    PROGRAM_PARAMETER = 8
    PROGRAM = 9
    PROCEDURE = 10
    FUNCTION = 11
    UNDEFINED = 12



class SymTableEntry:
    # name: str
    # symTable: SymTableStuff.SymTableStuff
    # lineNumbers = []
    kind: Kind
    value: any

    def __init__(self, name, kind: Kind, symTable):
        self.name = name
        self.kind = kind
        self.symTable = symTable
        self.lineNumbers = []
        match kind:
            case Kind.CONSTANT | Kind.ENUMERATION_CONSTANT | Kind.VARIABLE | Kind.RECORD_FIELD | Kind.VALUE_PARAMETER:
                #ValueInfo
                self.info = ValueInfo()
                return
            case Kind.PROGRAM | Kind.PROCEDURE | Kind.FUNCTION:
                #RoutineInfo
                self.info = RoutineInfo()
                self.info.parameters = []
                self.info.subroutines = []
                return
            case _:
                return

class RoutineInfo:
    def __init__(self):
        return

class ValueInfo:

    def __init__(self):
        return
