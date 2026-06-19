# Ternary Operator (`?:`) in Java

The **Ternary Operator** is a short form of `if-else`.

It is called **ternary** because it uses **3 operands**:

```text
condition ? value_if_true : value_if_false
```

---

# Syntax

```java
variable = (condition) ? value1 : value2;
```

Meaning:

```java
if(condition) {
    variable = value1;
} else {
    variable = value2;
}
```

---

# Basic Example

## Using if-else

```java
int age = 18;
String result;

if(age >= 18) {
    result = "Adult";
} else {
    result = "Minor";
}

System.out.println(result);
```

Output:

```text
Adult
```

---

## Using Ternary Operator

```java
int age = 18;

String result = (age >= 18) ? "Adult" : "Minor";

System.out.println(result);
```

Output:

```text
Adult
```

---

# How It Works

Example:

```java
int num = 10;

String result = (num > 0) ? "Positive" : "Negative";
```

Step-by-step:

```text
Condition:
10 > 0

True
```

So Java selects:

```text
"Positive"
```

Output:

```text
Positive
```

---

# Example: Even or Odd

```java
int num = 7;

String result = (num % 2 == 0) ? "Even" : "Odd";

System.out.println(result);
```

Output:

```text
Odd
```

---

# Example: Greatest of Two Numbers

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;

System.out.println(max);
```

Output:

```text
20
```

---

# Equivalent if-else

```java
int max;

if(a > b) {
    max = a;
} else {
    max = b;
}
```

---

# Example: Pass or Fail

```java
int marks = 35;

String result = (marks >= 33) ? "Pass" : "Fail";

System.out.println(result);
```

Output:

```text
Pass
```

---

# Nested Ternary Operator

Used when there are multiple conditions.

Example: Find greatest among 3 numbers.

```java
int a = 10;
int b = 30;
int c = 20;

int max = (a > b)
            ? ((a > c) ? a : c)
            : ((b > c) ? b : c);

System.out.println(max);
```

Output:

```text
30
```

---

# How Nested Ternary Works

```text
a > b ?

Yes → compare a and c

No  → compare b and c
```

---

# Ternary Operator Returns a Value

This is important.

```java
int result = (5 > 3) ? 100 : 200;
```

Result:

```text
100
```

Because the expression itself returns a value.

---

# Common Interview Example

### Positive, Negative, or Zero

```java
int num = 0;

String result =
        (num > 0) ? "Positive"
      : (num < 0) ? "Negative"
      : "Zero";

System.out.println(result);
```

Output:

```text
Zero
```

---

# Data Types Can Be Different

```java
int age = 20;

String status = (age >= 18) ? "Eligible" : "Not Eligible";
```

---

# Ternary vs if-else

| Ternary                    | if-else                  |
| -------------------------- | ------------------------ |
| One line                   | Multiple lines           |
| Good for simple conditions | Better for complex logic |
| Returns value              | Executes blocks          |

---

# When to Use

✅ Good

```java
String result = (num % 2 == 0) ? "Even" : "Odd";
```

❌ Avoid

```java
String result =
    (a > b)
        ? ((a > c)
            ? ((a > d) ? "A" : "D")
            : "C")
        : "B";
```

Too difficult to read.

---

# Complete Program

```java
public class TernaryDemo {

    public static void main(String[] args) {

        int age = 20;

        String result =
                (age >= 18)
                ? "Adult"
                : "Minor";

        System.out.println(result);
    }
}
```

Output:

```text
Adult
```

---

# Easy Memory Trick

```text
condition ? trueValue : falseValue
```

Read it as:

```text
If condition is true,
take left value.

Otherwise,
take right value.
```

---

# Quick Revision

| Operator | Meaning |
| -------- | ------- |
| `?`      | If true |
| `:`      | Else    |

Example:

```java
int max = (a > b) ? a : b;
```

Meaning:

```text
If a > b → a
Else → b
```

---


