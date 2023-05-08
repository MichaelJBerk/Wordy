from SymTableStuff import SymTableEntry

# class Cell:
#     value: object
#
#     def __init__(self, value):
#         self.value = value


# class MemoryMap:
#
#     map: {}
#
#     def __init__(self, symTable):
#         entries = symTable.sortedEntries()
#
#         for entry in entries:
#             kind = entry.kind
#             match (kind):
#                 case Kind.VARIABLE | Kind.FUNCTION | Kind.VALUE_PARAMETER | Kind.RECORD_FIELD:
#                     name = entry.name
#                     type = entry.type
#                     map[name] = Cell(type)
#



class SymTableStackFrame:
    routineId: SymTableEntry
    nestingLevel: int

    def __init__(self, routineID):
        symTable = routineID.symTable
        self.routineId = routineID
        self.backlink = None
        self.nestingLevel = symTable.nestingLevel

    def createBacklink(self, frame):
        self.backlink = frame
        return self
