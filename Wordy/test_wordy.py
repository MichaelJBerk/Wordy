# content of test_sample.py
import pytest
from WordyErrors import *

import main

def runCode(wordy):
    code = f'START\n{wordy}\nEND'
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
     test_mustBeProcedure1()
     """
    with pytest.raises(ERROR_NAME_MUST_BE_PROCEDURE):
        runCode(code)

def test_funcCall():
    code = """
    to do funcCall() output a String {
        output 'hey'
    }
    Let funcCallVar = funcCall()
    print funcCallVar
    print funcCall()
    """
    runCode(code)

