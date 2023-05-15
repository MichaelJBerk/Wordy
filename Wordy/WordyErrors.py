
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

class ERROR_ARGUMENT_COUNT_MISMATCH(Exception):
    def __init__(self): super().__init__("Invalid number of arguments")

class ERROR_TYPE_MUST_BE_NUMERIC(Exception):
    def __init__(self): super().__init__("Datatype must be integer or real")

class ERROR_TYPE_MUST_BE_STRING(Exception):
    def __init__(self):super().__init__("Datatype must be string")

class ERROR_TYPE_MUST_BE_BOOLEAN(Exception):
    def __init__(self):super().__init__("Datatype must be boolean")
class ERROR_INVALID_FIELD(Exception):
    def __init__(self): super().__init__("Invalid field")

class ERROR_DEFINED_THING_IN_FUNC(Exception):
    def __init__(self): super().__init__("Cannot define a Thing in a function")

class ERROR_DEFINED_FUNC_IN_FUNC(Exception):
    def __init__(self): super().__init__("Cannot define a function in a function")

#These two Classes are unused since it's already a parser error
class ERROR_DEFINED_FUNC_IN_THING(Exception):

    def __init__(self): super().__init__("Cannot define a function in a Thing")
class ERROR_DEFINED_THING_IN_THING(Exception):
    def __init__(self): super().__init__("Cannot define a Thing in a Thing")
class ERROR_INPUT_USED_INCORRECTLY(Exception):
    def __init__(self): super().__init__("Input was used incorrectly")