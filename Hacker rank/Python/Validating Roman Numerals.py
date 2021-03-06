You are given a string, and you have to validate whether it's a valid Roman numeral. If it is valid, print True. Otherwise, print False. Try to create a regular expression for a valid Roman numeral.

Input Format

A single line of input containing a string of Roman characters.

Output Format

Output a single line containing True or False according to the instructions above.

Constraints

The number will be between  and  (both included).

Sample Input

CDXXI
Sample Output

True
References

Regular expressions are a key concept in any programming language. A quick explanation with Python examples is available here. You could also go through the link below to read more about regular expressions in Python.

https://developers.google.com/edu/python/regular-expressions
  
_______________________________________________________________________________
regex_pattern = r"(MMM|MM|M)?(CM|DCCC|DCC|DC|D|CD|CCC|CC|C)?(XC|LXXX|LXX|LX|L|XL|XXX|XX|X)?(IX|VIII|VI|V|IV|III|II|I)?$"	# Do not delete 'r'.

import re
print(str(bool(re.match(regex_pattern, input()))))
