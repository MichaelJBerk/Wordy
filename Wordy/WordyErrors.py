
class ERROR_NAME_MUST_BE_PROCEDURE(Exception):
    def __init__(self): super().__init__("Must be a procedure name")

class ERROR_UNDECLARED_ID(Exception):
    def __init__(self): super().__init__("Undeclared Identifier")

class ERROR_REDECLARED_ID(Exception):
    def __init__(self): super().__init__("Redeclared identifier")

class ERROR_INVALID_TYPE(Exception):
    def __init__(self): super().__init__("Invalid type")