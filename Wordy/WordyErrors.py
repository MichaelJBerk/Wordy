
class ERROR_NAME_MUST_BE_PROCEDURE(Exception):
    def __init__(self): super().__init__("Must be a procedure name")

class ERROR_UNDECLARED_ID(Exception):
    def __init__(self): super().__init__("Undeclared Identifier")

class ERROR_REDECLARED_ID(Exception):
    def __init__(self): super().__init__("Redeclared identifier")

class ERROR_INVALID_TYPE(Exception):
    def __init__(self): super().__init__("Invalid type")

class TYPE_MISMATCH(Exception):
    def __init__(self): super().__init__("Type Mismatch")

class ERROR_INVALID_OPERATOR(Exception):
    def __init__(self):super().__init__("Invalid Operator")

class ERROR_INCOMPATIBLE_ASSIGNMENT(Exception):
    def __init__(self):super().__init__("Incompatible assignment")
    
class PARSER_ERROR(Exception):
    def __init__(self):super().__init__("Parser Error")

class ERROR_INVALID_RETURN_TYPE(Exception):
    def __init__(self):super().__init__("Invalid function return type")