# Java Relational Operators – Complete Notes

## What are Relational Operators in Java?

Relational operators are used to compare two values.

They always return a:

```java id="5z1y8j"
true
```

or

```java id="u4i9m2"
false
```

value.

These operators are mainly used in:

* `if`
* `if-else`
* `while`
* `for`
* conditions
* loops

---

# Types of Relational Operators

| Operator | Meaning                  |
| -------- | ------------------------ |
| `==`     | Equal to                 |
| `!=`     | Not equal to             |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |

---

# 1. Equal To Operator (`==`)

## Meaning

Checks whether two values are equal or not.

---

# Example

```java id="w5dz6u"
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        System.out.println(a == b);
    }
}
```

---

# Output

```java id="r4o7yn"
true
```

---

# Explanation

```java id="v0x1cl"
10 == 10
```

Both are equal.

So result is:

```java id="f1m2ke"
true
```

---

# Example 2

```java id="w7ha0m"
int a = 10;
int b = 20;

System.out.println(a == b);
```

---

# Output

```java id="ak8d6w"
false
```

Because:

```java id="x2bc9o"
10 != 20
```

---

# 2. Not Equal To Operator (`!=`)

## Meaning

Checks whether two values are NOT equal.

---

# Example

```java id="n3ke5q"
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a != b);
    }
}
```

---

# Output

```java id="p8qy1r"
true
```

---

# Explanation

```java id="p4n2bt"
10 and 20 are different
```

So result is:

```java id="x9mt7z"
true
```

---

# Example 2

```java id="h5f3nr"
int a = 10;
int b = 10;

System.out.println(a != b);
```

---

# Output

```java id="c8u2mv"
false
```

Because both values are same.

---

# 3. Greater Than Operator (`>`)

## Meaning

Checks left value is greater than right value.

---

# Example

```java id="n6z1kc"
public class Main {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println(a > b);
    }
}
```

---

# Output

```java id="v2k1yt"
true
```

---

# Explanation

```java id="u6y8ph"
20 > 10
```

So result is:

```java id="w4bx8j"
true
```

---

# Example 2

```java id="g7k3op"
int a = 5;
int b = 10;

System.out.println(a > b);
```

---

# Output

```java id="t1zc9m"
false
```

Because:

```java id="h9kr3u"
5 is not greater than 10
```

---

# 4. Less Than Operator (`<`)

## Meaning

Checks left value is smaller than right value.

---

# Example

```java id="r6ny1b"
public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println(a < b);
    }
}
```

---

# Output

```java id="k3up8d"
true
```

---

# Explanation

```java id="d8yr4v"
5 < 10
```

---

# Example 2

```java id="w2oc5s"
int a = 20;
int b = 10;

System.out.println(a < b);
```

---

# Output

```java id="j4lx9t"
false
```

---

# 5. Greater Than or Equal To (`>=`)

## Meaning

Checks:

* left value greater than right value
  OR
* both values equal

---

# Example

```java id="m5ka7u"
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        System.out.println(a >= b);
    }
}
```

---

# Output

```java id="v5uy2r"
true
```

---

# Explanation

```java id="d7oe3m"
10 >= 10
```

Equal is allowed.

---

# Example 2

```java id="m7cx2p"
int a = 20;
int b = 10;

System.out.println(a >= b);
```

---

# Output

```java id="r2qo9y"
true
```

Because:

```java id="h5n3uk"
20 is greater than 10
```

---

# Example 3

```java id="z1kt7o"
int a = 5;
int b = 10;

System.out.println(a >= b);
```

---

# Output

```java id="w8pl6r"
false
```

---

# 6. Less Than or Equal To (`<=`)

## Meaning

Checks:

* left value less than right value
  OR
* both equal

---

# Example

```java id="q7ra2x"
public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println(a <= b);
    }
}
```

---

# Output

```java id="o3kt8u"
true
```

---

# Example 2

```java id="f8ux4n"
int a = 10;
int b = 10;

System.out.println(a <= b);
```

---

# Output

```java id="r7qj2m"
true
```

Because equal is also allowed.

---

# Example 3

```java id="x3yn9v"
int a = 20;
int b = 10;

System.out.println(a <= b);
```

---

# Output

```java id="t5vr8w"
false
```

---

# Full Example Program

```java id="n6oq4r"
public class Main {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
    }
}
```

---

# Output

```java id="q9lb3w"
false
true
false
true
false
true
```

---

# Step-by-Step Output Explanation

| Expression | Result  | Reason            |
| ---------- | ------- | ----------------- |
| `10 == 20` | `false` | not equal         |
| `10 != 20` | `true`  | different         |
| `10 > 20`  | `false` | smaller           |
| `10 < 20`  | `true`  | smaller           |
| `10 >= 20` | `false` | not greater/equal |
| `10 <= 20` | `true`  | smaller           |

---

# Relational Operators with `if`

## Example

```java id="r4yd8m"
public class Main {

    public static void main(String[] args) {

        int age = 18;

        if(age >= 18) {
            System.out.println("Eligible to vote");
        }
    }
}
```

---

# Output

```java id="m8qk1u"
Eligible to vote
```

---

# Relational Operators with `boolean`

Relational operators return boolean.

Example:

```java id="e7mv3x"
int a = 10;
int b = 20;

boolean result = a < b;

System.out.println(result);
```

---

# Output

```java id="y1pw6o"
true
```

---

# Important Difference

## `=` vs `==`

| Operator | Meaning    |
| -------- | ---------- |
| `=`      | Assignment |
| `==`     | Comparison |

---

# Example

## Assignment

```java id="x7ko3r"
int a = 10;
```

Means:

```java id="w2ut8v"
store 10 in a
```

---

## Comparison

```java id="g4mk1y"
a == 10
```

Means:

```java id="j8nx5u"
check whether a equals 10
```

---

# Common Beginner Mistake

❌ Wrong

```java id="m3pz8r"
if(a = 10)
```

✅ Correct

```java id="n9kt2x"
if(a == 10)
```

---

# Operator Precedence of Relational Operators

| Priority | Operators   |
| -------- | ----------- |
| High     | `> < >= <=` |
| Lower    | `== !=`     |
| Lower    | `&&`        |
| Lower    | `\|\|`      |

---

# Example

```java id="r8mn5v"
System.out.println(10 > 5 && 20 > 15);
```

---

# Execution

First relational operations:

```java id="o2uv7c"
10 > 5 = true
20 > 15 = true
```

Then logical AND:

```java id="h7mx1p"
true && true = true
```

---

# Output

```java id="u5rw8n"
true
```

---

# Relational Operators with Characters

Characters use ASCII/Unicode values.

---

# Example

```java id="f4zc9x"
System.out.println('A' < 'B');
```

---

# Output

```java id="k7mp3v"
true
```

Because:

```java id="y3ut6q"
'A' = 65
'B' = 66
```

So:

```java id="u8nk2m"
65 < 66
```

---

# Relational Operators with Floating Numbers

## Example

```java id="p2lw7o"
double a = 10.5;
double b = 5.5;

System.out.println(a > b);
```

---

# Output

```java id="c9or4u"
true
```

---

# Important Interview Questions

---

# Q1. What is returned by relational operators?

Answer:

```java id="z7nk4x"
boolean
```

---

# Q2. Can relational operators compare strings?

Using `==` compares reference, not actual content.

Use:

```java id="s8ur5n"
equals()
```

for string content comparison.

---

# Wrong Example

```java id="g4kr9m"
String a = "Java";
String b = "Java";

System.out.println(a == b);
```

---

# Better Method

```java id="m7pt2q"
System.out.println(a.equals(b));
```

---

# Final Quick Revision Table

| Operator | Meaning       | Example    | Result |
| -------- | ------------- | ---------- | ------ |
| `==`     | Equal         | `10 == 10` | `true` |
| `!=`     | Not Equal     | `10 != 20` | `true` |
| `>`      | Greater Than  | `20 > 10`  | `true` |
| `<`      | Less Than     | `5 < 10`   | `true` |
| `>=`     | Greater/Equal | `10 >= 10` | `true` |
| `<=`     | Less/Equal    | `5 <= 10`  | `true` |
