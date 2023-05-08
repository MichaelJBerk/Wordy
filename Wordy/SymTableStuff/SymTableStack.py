from SymTableStuff import SymTableEntry, SymTable
class SymTableStack:

    stack = []
    programid: SymTableEntry
    def __init__(self):
        self.currentNestingLevel = 0
        self.stack.append(SymTable(self.currentNestingLevel))
        # add(SymTableStuff(self.currentNestingLevel))
    # def add(self, item):
    #     self.stack.append(item)

    def add(self, entry):
        self.stack.append(entry)

    def remove(self, index):
        self.stack.pop(index)

    def push(self):
        symTable = SymTable(++self.currentNestingLevel)
        self.add(symTable)
        return symTable

    def pushEntry(self, entry):
        self.currentNestingLevel += 1
        self.add(entry)
        return entry

    def pop(self):
        symTable = self.stack[self.currentNestingLevel]
        self.remove(self.currentNestingLevel)
        self.currentNestingLevel -= 1
        return symTable

    def enterLocal(self, name, kind):
        self.stack[self.currentNestingLevel].enter(name, kind)

    def lookupLocal(self, name):
        self.stack[self.currentNestingLevel].lookup(name)

    def lookup(self, name):
        foundEntry = None

        i = self.currentNestingLevel
        while (i >= 0) and (foundEntry is None):
            foundEntry = self.stack[i].lookup(name)

        return foundEntry
