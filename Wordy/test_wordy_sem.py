# content of test_sample.py
import pytest
from WordyErrors import *
from WordyParser import *
from importlib import reload

import main

def runCode(wordy):
    code = f'START prgm \n{wordy}\nEND'
    return main.parseAndVisit(code)

def test_concat():
    code = """
    Let tconcat be ('hey' + 'hwy3')
    """
    runCode(code)

def test_stringTerm():
    code = """
    Let tStringTerm be 'test String term'
    """
    ran = runCode(code)
    prgm: WordyParser.ProgramContext = ran[1]
    varValue = prgm.statementList().statement(0).assignStmt().assignVar().varValue()
    assert varValue.stringTerm() is not None
    print("hey")

def test_mul():
    code = """
    Let testMul1 be 2 + 2
    Let testMul2 be 3
    Let testMul3 be testMul2 * testMul2
    """
    runCode(code)

def test_print():
    code = """
    Let printName be 'Michael'
print printName
print 'Hello, ' + printName
    """
    runCode(code)
def test_redeclaredConst():
    constCode = """
    Let trc1 be 2
    Let trc1 always be 3
    """
    with pytest.raises(ERROR_REDECLARED_ID):
        runCode(constCode)

def test_redeclaredVar():
    varCode = """
        Let trv1 always be 2
        let trv1 be 3
        """
    with pytest.raises(ERROR_REDECLARED_ID):
        runCode(varCode)

def test_undeclared():
    code = """
    print testUndeclared
    """
    with pytest.raises(ERROR_UNDECLARED_ID):
        runCode(code)
    #TODO: Test with factor/number

def test_mustBeProcedure():
    code = """
     mustBeProcedure1()
     """
    with pytest.raises(ERROR_NAME_MUST_BE_PROCEDURE):
        runCode(code)

def test_funcCall():
    code = """
    to do funcCall() output a String {
        output 'hey'
    }
    Let funcCallVar be funcCall()
    print funcCallVar
    print funcCall()
    """
    runCode(code)

def test_invalidType():
    code = """
    Let itype be 2
    Let itype be 'hey'
    """
    with pytest.raises(ERROR_INCOMPATIBLE_ASSIGNMENT):
        runCode(code)

def test_wrongTypeRoutine():
    code = """
    to do wrongTypeRoutine() output a String {
        output 'wrongTypeRoutine'
    }
    Let wtrVal be 2
    Let wtrVal be wrongTypeRoutine()
    """
    with pytest.raises(ERROR_INCOMPATIBLE_ASSIGNMENT):
        runCode(code)

def test_redeclaredRoutine():
    code = """
    to do redRoutine() output a String {
        output 'blah'
    }
    to do redRoutine() output a String {
        output 'blah2'
    }
    """
    with pytest.raises(ERROR_REDECLARED_ID):
        runCode(code)

def test_invalidOp():
    code = """
    'hey' * 'hey2'
    """
    with pytest.raises(PARSER_ERROR):
        runCode(code)
def test_badVar():
    code = """
    Let string be 'h'
    """
    with pytest.raises(PARSER_ERROR):
        runCode(code)
def test_badComparison():
    code = """
    Let bcStringVar be 'hey'
    Let bcBool be 'hey' > 2
    """
    with pytest.raises(PARSER_ERROR):
        runCode(code)

def test_tooManySubscripts():
    code = """
    Let tmsArr = ['hey']
    Let tmsArrVal = tmsArr[0][1]
    """
    with pytest.raises(PARSER_ERROR):
        runCode(code)

def test_badOutputStmt():
    code = """
    to do tBOS() output a String {
        output 2
    }
    """
    with pytest.raises(ERROR_TYPE_MUST_BE_STRING):
        runCode(code)


def test_badOutputStmtID():
    code = """
    to do tBOSId() output a String {
        Let bosIdVar be 2
        output bosIdVar
    }
    """
    with pytest.raises(ERROR_TYPE_MUST_BE_STRING):
        runCode(code)

def test_idArray():
    code = """
    Let idArray1Val0 = 1
    Let idArray1 be [idArray1Val0, 2]
    Let idArray1Var be idArray1
    """
    runCode(code)

def test_arrayTypeMismatch():
    code = """
    let arrayTypeMismatch = ['hey', 2]
    """
    with pytest.raises(TYPE_MISMATCH):
        runCode(code)

def test_arrayQuery():
    code = """
    Let arrayToQuery = ['hey', 'hey2']
    Let arrayToQueryValue0 = arrayToQuery[0]
    """
    runCode(code)
def test_arrayQueryID():
    code = """
    Let arrayQueryID = 1
    Let arrayToQueryID = ['hey', 'hey2']
    Let arrayToQueryIDValue0 = arrayToQueryID[arrayQueryID]
    """
    runCode(code)

def test_routine_params():
    code = """
    to do testRoutineParams(with trp0 as String, trp1 as Int) output a String {
        output 'hey'
    }
    testRoutineParams('hey2', 1)
    """
    runCode(code)

def test_thing_def():
    code = """
    thing MyThing {
        Let prop1 be 1
        Let prop2 be 'blah'
    }
    """
    runCode(code)

def test_thingRedeclared_def():
    code = """
    thing MyThing {
        Let prop1 be 'blah3'
    }
    thing MyThing {
        Let prop be 'hey'
    }
    """
    with pytest.raises(ERROR_REDECLARED_ID):
        runCode(code)

def test_thing_redeclared_prop():
    code = """
     thing MyThing {
        Let prop1 be 'blah3'
        Let prop1 be 'hey'
    }
    """
    with pytest.raises(ERROR_REDECLARED_ID):
        runCode(code)

def test_assign_to_propCall():
    code = """
        thing MyThing {
            Let prop1 be 'blah3'
        }
        Let thing1 be new MyThing
        Let val be thing1.prop1
    """
    runCode(code)


def test_AssignToPropCallWrongType():
    code = """
    thing MyThing {
        Let prop1 be 'blah3'
    }
    Let val be 1
    Let thing1 be new MyThing
    Let val be thing1.prop1
    """
    with pytest.raises(ERROR_INCOMPATIBLE_ASSIGNMENT):
        runCode(code)
def test_InvalidField():
    code = """
    thing MyThing {
        Let prop1 be 'blah3'
    }
    Let thing1 be new MyThing
    Let val be thing1.prop2
    """
    with pytest.raises(ERROR_INVALID_FIELD):
        runCode(code)

def test_CallNonexistantRoutine():
    code = """
    Let val be myFunc()
    """
    with pytest.raises(ERROR_NAME_MUST_BE_PROCEDURE):
        runCode(code)

def test_defineThingInFunc():
    code = """
    to do myRoutine() output a String {
        thing MyThing {
            Let prop1 be 1
        }
        output 'hey'
    }
    """
    with pytest.raises(ERROR_DEFINED_THING_IN_FUNC):
        runCode(code)
def test_defineFuncInThing():
    code = """
    thing MyThing {
        to do myRoutine() output a String {
            output 'hey'
        }
        Let prop1 be 1
    }
    """
    with pytest.raises(Exception):
        runCode(code)

def test_defineThingInThing():
    code = """
    thing MyThing {
        thing MyThing2 {
            Let prop2 be 'hey'
        }
        Let prop1 be 1
    }
    """
    with pytest.raises(Exception):
        runCode(code)
def test_defineFuncInFunc():
    code = """
    to do myRoutine() output a String {
        to do routine2() output a String {
            output 'hey2'
        }
        output 'hey1'
    }
    """
    with pytest.raises(Exception):
        runCode(code)