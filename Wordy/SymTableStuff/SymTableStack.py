from SymTableStuff.SymTable import *
class SymTableStack:

    stack = []
    programid: SymTableEntry
    def __init__(self):
        self.currentNestingLevel = 0
        self.stack.append(SymTable(self.currentNestingLevel))

    def add(self, entry):
        return self.stack.append(entry)

    def remove(self, index):
        return self.stack.pop(index)

    def push(self):
        nextLevel = self.currentNestingLevel + 1
        symTable = SymTable(nextLevel)
        self.currentNestingLevel = nextLevel
        self.add(symTable)
        return symTable

    def pushEntry(self, entry):
        self.currentNestingLevel += 1
        self.add(entry)
        return entry

    def pop(self):
        lastLevel = self.currentNestingLevel - 1
        symTable = self.stack[self.currentNestingLevel]
        self.remove(self.currentNestingLevel)
        self.currentNestingLevel = lastLevel
        return symTable

    def enterLocal(self, name, kind):
        return self.stack[self.currentNestingLevel].enter(name, kind)

    def lookupLocal(self, name):
        return  self.stack[self.currentNestingLevel].lookup(name)

    def lookup(self, name):
        foundEntry = None

        i = self.currentNestingLevel
        while (i >= 0) and (foundEntry is None):
            foundEntry = self.stack[i].lookup(name)
            i -= 1

        return foundEntry
