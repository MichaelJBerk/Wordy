from SymTableEntry import SymTableEntry
class SymTable:
    #TODO: Implement dictionary put/get methods

    nestingLevel = 0;
    slotNumber = -1;
    unnamedIndex = 0;

    UNNAMED_PREFIX = "_unnamed_"
    serialVersionUID = 0;

    ownerID: SymTableEntry

    def generateUnnamedName(self):
        self.unnamedIndex += 1
        return self.UNNAMED_PREFIX + str(self.unnamedIndex)

    def nextSlotNumber(self):
        self.maxSlotNumber = ++self.slotNumber
        return self.slotNumber

    def enter(self, name, kind):
        entry = SymTableEntry(name, kind, self)
        # put(name, entry)
        return entry




