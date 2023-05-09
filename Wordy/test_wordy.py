# content of test_sample.py
import pytest

import main

def runCode(wordy):
    code = f'START\n{wordy}\nEND'
    main.parseAndVisit(code)

def test_concat():
    code = """
    Let var be ('hey' + 'hwy3')
    """
    runCode(code)

def test_mul():
    code = """
    Let val1 be 2 + 2
Let val2 be 3
Let val3 be val2 * val2
    """
    runCode(code)

def test_print():
    code = """
    Let name be 'Michael'
print name
print 'Hello, ' + name
    """
    runCode(code)

def test_redeclaredConst():
    constCode = """
    Let var be 2
    Let var always be 3
    """
    with pytest.raises(ValueError) as error:
        runCode(constCode)
        assert "Redeclared identifier" in str(error.value)

def test_redeclaredVar():
    varCode = """
        Let var always be 2
        let var be 3
        """
    with pytest.raises(ValueError) as error:
        runCode(varCode)
        assert "Redeclared identifier" in str(error.value)

def test_undeclared():
    code = """
    print val1
    """
    with pytest.raises(ValueError) as error:
        runCode(code)
        assert "Undeclared identifier" in str(error.value)


