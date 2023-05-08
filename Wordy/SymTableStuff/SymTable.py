from SymTableStuff.SymTableEntry import *

class SymTable:
    #TODO: Implement dictionary put/get methods

    nestingLevel = 0;
    slotNumber = -1;
    unnamedIndex = 0;

    UNNAMED_PREFIX = "_unnamed_"
    serialVersionUID = 0

    ownerID: SymTableEntry

    dict: {}

    def __init__(self, currentNestingLevel):
        self.nestingLevel = currentNestingLevel

    def generateUnnamedName(self):
        self.unnamedIndex += 1
        return self.UNNAMED_PREFIX + str(self.unnamedIndex)

    def nextSlotNumber(self):
        self.maxSlotNumber = ++self.slotNumber
        return self.slotNumber

    def enter(self, name, kind):
        entry = SymTableEntry(name, kind, self)
        self.dict[name] = entry
        return entry

    def lookup(self, name):
        return self.dict.get(name)

    def sortedEntries(self):
        values = self.dict.values()
        iter = iter(values.iterator())
        list = []

        while x := next(iter, None) is not None:
            list.append(x)
        return list

    def resetVariables(self, kind):
        entries = self.dict.values()

        for entry in entries:
            if entry.kind == SymTableEntry.Kind.VARIABLE:
                entry.kind = kind




