Make sentences as code
- Higher-level than Python
- No requirement for indentation
- Strongly typed
	- type inference 
- Autoboxing
- Have to declare everything with a value


# Data Types

Example `if` statement:
```
If \[expression\] is \[value\] then \[statement\] otherwise \[statement\]

If \[expression\] is \[value\] then {
	\[statement list\]
} otherwise {
	\[statement list\]
}
Let value be “hey"
 | Let value be a String “hey"
Let String value be “hey"


//(struct)
Thing MyType {
	//Constant

	Let value2 always be “hello"
	Let value3 be 1
	Let value3 be a list of [“String1”, “String2"]

	
}

```

# Operators and Expressions
- No Oxford comma (for now)
- Operators always need to have the same type 

```
Let value1 be 1
Let value2 be 2
Let value3 be (Add value1, value2, and value3)
Let value3 be value1 + value2 //if we have time
-1
Let concat be (Add string1 and string2)

Let bool be (value1 is value2)
Let bool2 be (value1 is not value2)
| (value1 isn't value2)
Let bool3 be (value1 > value2)
Let bool4 be (value1 < value2)
Let bool5 be (value1 or value2)

```

### Constructs

```
Check value {
	if 1 do
		\[statement\]
	if 2 do
		\[statement\]
}

Loop for each \[variable] in \[array\] {
	\[statement\]
}

To do print(with value1 as String, value2 as Int) output a String {
	\[statement\]
	output value1
}

print(“hey")
```
### Command-Line Input
```
///"Input" is a reserved word, which acts as an always-defined variable.
Let something be Input
``

//comment

```
