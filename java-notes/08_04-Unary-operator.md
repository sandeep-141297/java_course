# Java Unary Operators – Complete Notes with Examples

## What is Unary Operator in Java?

Unary operator means:

* **"Uni" = One**
* Operator works on **only one variable/value**

Example:

```java
int a = 10;
a++;
```

Here `++` works only on `a`.

---

# Types of Unary Operators in Java

| Operator | Name               | Meaning         |
| -------- | ------------------ | --------------- |
| `+`      | Unary Plus         | Positive value  |
| `-`      | Unary Minus        | Negative value  |
| `++`     | Increment          | Increase by 1   |
| `--`     | Decrement          | Decrease by 1   |
| `!`      | Logical NOT        | Reverse boolean |
| `~`      | Bitwise Complement | Reverse bits    |

---

# 1. Unary Plus (`+`)

## Meaning

Shows positive value.

## Example

```java
public class Main {
    public static void main(String[] args) {

        int num = 10;

        int result = +num;

        System.out.println(result);
    }
}
```

## Output

```java
10
```

## Explanation

```java
+10 = 10
```

No change happens.

---

# 2. Unary Minus (`-`)

## Meaning

Changes positive to negative.

## Example

```java
public class Main {
    public static void main(String[] args) {

        int num = 10;

        int result = -num;

        System.out.println(result);
    }
}
```

## Output

```java
-10
```

---

# 3. Increment Operator (`++`)

Increment means:

```java
value + 1
```

Example:

```java
int a = 5;
a++;
```

Equivalent to:

```java
a = a + 1;
```

---

# Types of Increment

| Type  | Name              |
| ----- | ----------------- |
| `a++` | Postfix Increment |
| `++a` | Prefix Increment  |

---

# A. Postfix Increment (`a++`)

## Syntax

```java
variable++;
```

## Rule

### FIRST

Current value is used/assigned.

### THEN

Value increases by 1.

---

## Example 1

```java
public class Main {
    public static void main(String[] args) {

        int num1 = 18;

        int result7 = num1++;

        System.out.println(result7);
        System.out.println(num1);
    }
}
```

---

## Step-by-Step Execution

Initial:

```java
num1 = 18
```

Line:

```java
int result7 = num1++;
```

Internally:

```java
result7 = num1;
num1 = num1 + 1;
```

Step-by-step:

```java
result7 = 18
num1 = 19
```

---

## Output

```java
18
19
```

---

# Important Point

Postfix means:

## Use first → Increase later

---

# Memory Flow

```java
Before:
num1 = 18

Assignment:
result7 = 18

Increment:
num1 = 19
```

---

# B. Prefix Increment (`++a`)

## Syntax

```java
++variable;
```

## Rule

### FIRST

Increase value by 1.

### THEN

Use/assign value.

---

## Example

```java
public class Main {
    public static void main(String[] args) {

        int num1 = 18;

        int result8 = ++num1;

        System.out.println(result8);
        System.out.println(num1);
    }
}
```

---

# Step-by-Step Execution

Initial:

```java
num1 = 18
```

Line:

```java
int result8 = ++num1;
```

Internally:

```java
num1 = num1 + 1;
result8 = num1;
```

Step-by-step:

```java
num1 = 19
result8 = 19
```

---

# Output

```java
19
19
```

---

# Important Point

Prefix means:

## Increase first → Use later

---

# Easy Trick to Remember

| Operator | Work              |
| -------- | ----------------- |
| `a++`    | Use then increase |
| `++a`    | Increase then use |

---

# Full Comparison Table

| Code           | Assigned Value  | Final Variable Value |
| -------------- | --------------- | -------------------- |
| `int b = a++;` | Old value       | Increased            |
| `int b = ++a;` | Increased value | Increased            |

---

# Example with Both

```java
public class Main {
    public static void main(String[] args) {

        int x = 5;

        int a = x++;
        System.out.println(a);
        System.out.println(x);

        int b = ++x;
        System.out.println(b);
        System.out.println(x);
    }
}
```

---

# Step-by-Step

## First

```java
x = 5
```

```java
a = x++;
```

Equivalent:

```java
a = 5
x = 6
```

Output:

```java
5
6
```

---

## Second

Now:

```java
x = 6
```

```java
b = ++x;
```

Equivalent:

```java
x = 7
b = 7
```

Output:

```java
7
7
```

---

# 4. Decrement Operator (`--`)

Decrement means:

```java
value - 1
```

Equivalent:

```java
a = a - 1;
```

---

# Types

| Type  | Meaning           |
| ----- | ----------------- |
| `a--` | Postfix decrement |
| `--a` | Prefix decrement  |

---

# Postfix Decrement Example

```java
int x = 10;

int y = x--;

System.out.println(y);
System.out.println(x);
```

---

# Execution

```java
y = 10
x = 9
```

---

# Output

```java
10
9
```

---

# Prefix Decrement Example

```java
int x = 10;

int y = --x;

System.out.println(y);
System.out.println(x);
```

---

# Execution

```java
x = 9
y = 9
```

---

# Output

```java
9
9
```

---

# 5. Logical NOT (`!`)

Used with boolean.

Reverses value.

| Original | Result  |
| -------- | ------- |
| `true`   | `false` |
| `false`  | `true`  |

---

# Example

```java
public class Main {
    public static void main(String[] args) {

        boolean isJavaFun = true;

        System.out.println(!isJavaFun);
    }
}
```

---

# Output

```java
false
```

---

# Explanation

```java
!true = false
```

---

# 6. Bitwise Complement (`~`)

Reverses all bits.

---

# Example

```java
public class Main {
    public static void main(String[] args) {

        int num = 5;

        System.out.println(~num);
    }
}
```

---

# Output

```java
-6
```

---

# Why?

Binary of 5:

```java
00000101
```

After `~`

```java
11111010
```

This becomes `-6` in 2's complement.

---

# Priority / Precedence of Unary Operators

Unary operators have **high priority**.

---

# Unary Operator Precedence Table

| Priority | Operators       |
| -------- | --------------- |
| Highest  | `++ -- + - ! ~` |
| Lower    | `* / %`         |
| Lower    | `+ -`           |
| Lower    | `<< >> >>>`     |
| Lower    | `< > <= >=`     |
| Lower    | `== !=`         |
| Lower    | `&&`            |
| Lower    | `||`            |
| Lowest   | `=`             |

---

# Example of Priority

```java
int a = 5;

int result = ++a * 2;
```

---

# Execution

First:

```java
++a
```

```java
a = 6
```

Then:

```java
6 * 2 = 12
```

---

# Output

```java
12
```

---

# Complex Example

```java
int x = 5;

int y = x++ + ++x;
```

---

# Step-by-Step

Initial:

```java
x = 5
```

---

## Part 1

```java
x++
```

Use first:

```java
5
```

Then:

```java
x = 6
```

---

## Part 2

```java
++x
```

Increase first:

```java
x = 7
```

Use:

```java
7
```

---

# Final

```java
y = 5 + 7
```

```java
y = 12
```

Final values:

```java
x = 7
y = 12
```

---

# Output

```java
12
7
```

---

# Very Important Interview Questions

---

# Q1. Difference Between Prefix and Postfix?

| Prefix                        | Postfix                  |
| ----------------------------- | ------------------------ |
| Increment first               | Use first                |
| `++a`                         | `a++`                    |
| Faster execution conceptually | Uses temporary old value |

---

# Q2. Why Output Different?

Because:

* Prefix changes value BEFORE use
* Postfix changes value AFTER use

---

# Q3. Can We Use `++` on Constants?

❌ No

Wrong:

```java
5++;
```

Because constant cannot change.

---

# Q4. Can We Use Unary Operators with boolean?

| Operator | boolean Allowed? |
| -------- | ---------------- |
| `!`      | ✅ Yes            |
| `++`     | ❌ No             |
| `--`     | ❌ No             |

---

# Q5. `~` (bitwise NOT) operator works only with integer types (`byte`, `short`, `int`, `long`, `char`) — not with `boolean`.

So this line:

```java
int result12 = ~false;
```

will give a compilation error.

## Correct Explanation

`~` flips all bits:

* `0` becomes `1`
* `1` becomes `0`

Example:

```java
int num = 5;
int result = ~num;

System.out.println(result);
```

### Binary Calculation

```text
5  = 00000000 00000000 00000000 00000101
~5 = 11111111 11111111 11111111 11111010
```

* Shortcut Formula 
```text
~n = -(n + 1)
~5
= -(5 + 1)
= -6

This result equals `-6`.

### Output

```text
-6
```

## Boolean NOT Operator

For boolean values, Java uses `!` instead of `~`.

Example:

```java
boolean result = !false;

System.out.println(result);
```

### Output

```text
true
```

## Correct Comment

```java
boolean result = !false; // logical NOT operator, !false becomes true
System.out.println(result);
```

---

# Final Quick Revision

| Operator | Meaning           |
| -------- | ----------------- |
| `+a`     | Positive          |
| `-a`     | Negative          |
| `a++`    | Use then increase |
| `++a`    | Increase then use |
| `a--`    | Use then decrease |
| `--a`    | Decrease then use |
| `!a`     | Reverse boolean   |
| `~a`     | Reverse bits      |


---

# doubt - Binary Calculation How ?

```text
5  = 00000000 00000000 00000000 00000101
~5 = 11111111 11111111 11111111 11111010
```

```java
int num = 5;
int result = ~num;

System.out.println(result); // -6 ?
```

In Java, `int` uses **32 bits** (4 bytes).

So number `5` is stored in binary using 32 bits.

## Step 1: Convert 5 to Binary

Decimal `5` = binary `101`

But Java stores `int` in 32 bits, so leading zeros are added:

```text
5 = 00000000 00000000 00000000 00000101
```

Last 8 bits:

```text
00000101
```

Because:

| Position | 128 | 64 | 32 | 16 | 8 | 4 | 2 | 1 |
| -------- | --- | -- | -- | -- | - | - | - | - |
| Bit      | 0   | 0  | 0  | 0  | 0 | 1 | 0 | 1 |

`4 + 1 = 5`

---

# Step 2: Apply `~` Operator

`~` means:

```text
0 → 1
1 → 0
```

So flip every bit:

```text
00000000 00000000 00000000 00000101
11111111 11111111 11111111 11111010
```

---

# Step 3: Why Result is Negative

In Java, negative numbers use **2's complement**.

If first bit is `1`, number is negative.

```text
11111111 11111111 11111111 11111010
^
first bit = 1 → negative
```

---

# Step 4: Find Actual Value

To get decimal value of negative binary:

## A. Take 2's complement again

Binary:

```text
11111111 11111111 11111111 11111010
```

### Flip bits

```text
00000000 00000000 00000000 00000101
```

### Add 1

```text
00000000 00000000 00000000 00000110
```

This is `6`.

So final value:

```text
-6
```

---

# Shortcut Formula

For any number:

```java
~n = -(n + 1)
```

Example:

```java
~5
= -(5 + 1)
= -6
```

---

# Java Example

```java
public class Main {
    public static void main(String[] args) {

        int num = 5;
        int result = ~num;

        System.out.println(result);
    }
}
```

## Output

```text
-6
```
