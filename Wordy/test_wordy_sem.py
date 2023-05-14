# content of test_sample.py
import pytest
from WordyErrors import *

import main

def runCode(wordy):
    code = f'START prgm \n{wordy}\nEND'
    main.parseAndVisit(code)

def test_concat():
    code = """
    Let tconcat be ('hey' + 'hwy3')
    """
    runCode(code)

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
    with pytest.raises(ERROR_INVALID_RETURN_TYPE):
        runCode(code)


def test_badOutputStmtID():
    code = """
    to do tBOSId() output a String {
        Let bosIdVar be 2
        output bosIdVar
    }
    """
    with pytest.raises(ERROR_INVALID_RETURN_TYPE):
        runCode(code)
