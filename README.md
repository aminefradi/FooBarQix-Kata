# FooBarQix-Kata
FooBarQix kata implementation in Java.

# Problem Description

It consists of printing numbers but with a few exceptions :

- If the number is divisible by 3, write “Foo” instead of the number
 
- If the number is divisible by 5, add “Bar”

- If the number is divisible by 7, add “Qix”

- For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.

# Test cases 

```
1  => 1
2  => 2
3  => FooFoo (divisible by 3, contains 3)
4  => 4
5  => BarBar (divisible by 5, contains 5)
6  => Foo (divisible by 3)
7  => QixQix (divisible by 7, contains 7)
8  => 8
9  => Foo
10 => Bar
13 => Foo
15 => FooBarBar (divisible by 3, divisible by 5, contains 5)
21 => FooQix
33 => FooFooFoo (divisible by 3, contains two 3)
51 => FooBar
53 => BarFoo
```