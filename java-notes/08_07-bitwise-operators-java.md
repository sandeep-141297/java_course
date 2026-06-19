# Bitwise Operators in Java

Bitwise operators work directly on **binary bits (0 and 1)** of numbers.

Java stores integers internally in **binary form**, so bitwise operators manipulate those bits.

---

### Binary uses powers of 2.

| Power | Value |
| ----- | ----- |
| 2⁰    | 1     |
| 2¹    | 2     |
| 2²    | 4     |
| 2³    | 8     |
| 2⁴    | 16    |

0   1   0   1

Each position has a power of 2.

| Binary Bit | Power of 2 | Value   |
| ---------- | ---------- | ------- |
| 0          | 8          | 0×8 = 0 |
| 1          | 4          | 1×4 = 4 |
| 0          | 2          | 0×2 = 0 |
| 1          | 1          | 1×1 = 1 |

4 + 1 = 5 => 0101 = 5


# Real Life Idea

Imagine every switch in a room is either:

* `1` = ON
* `0` = OFF

Bitwise operators compare or modify those switches.

Example:

```text
1010
1100
```

Each digit is a bit.

---

# Binary Basics

Decimal to binary example:

| Decimal | Binary |
| ------- | ------ |
| 5       | 0101   |
| 10      | 1010   |
| 12      | 1100   |

---

# Types of Bitwise Operators in Java

| Operator | Name                 |
| -------- | -------------------- |
| `&`      | Bitwise AND          |
| `\|`     | Bitwise OR           |
| `^`      | Bitwise XOR          |
| `~`      | Bitwise NOT          |
| `<<`     | Left Shift           |
| `>>`     | Right Shift          |
| `>>>`    | Unsigned Right Shift |

---

# 1. Bitwise AND (`&`)

Returns `1` only if BOTH bits are `1`.

---

## Truth Table

| A | B | A & B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 0     |
| 1 | 0 | 0     |
| 1 | 1 | 1     |

---

## Example

```java
int a = 5;   // 0101
int b = 3;   // 0011

int result = a & b;

System.out.println(result);
```

---

## Binary Calculation

```text
0101   (5)
0011   (3)
----
0001   (1)
```

Output:

```text
1
```

---

# Real Life Example

Login permission system:

| Permission | Binary |
| ---------- | ------ |
| Read       | 0001   |
| Write      | 0010   |
| Execute    | 0100   |

Check whether user has permission.

---

# 2. Bitwise OR (`|`)

Returns `1` if ANY bit is `1`.

---

## Truth Table

| A | B | A | B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 1     |
| 1 | 0 | 1     |
| 1 | 1 | 1     |

---

## Example

```java
int a = 5;   // 0101
int b = 3;   // 0011

int result = a | b;

System.out.println(result);
```

---

## Binary Calculation

```text
0101
0011
----
0111
```

Output:

```text
7
```

---

# 3. Bitwise XOR (`^`)

Returns `1` only when bits are DIFFERENT.

---

## Truth Table

| A | B | A ^ B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 1     |
| 1 | 0 | 1     |
| 1 | 1 | 0     |

---

## Example

```java
int a = 5;   // 0101
int b = 3;   // 0011

int result = a ^ b;

System.out.println(result);
```

---

## Binary Calculation

```text
0101
0011
----
0110
```

Output:

```text
6
```

---

# Real Life Use of XOR

Used in:

* Encryption
* Swapping variables
* Detecting differences

---

# 4. Bitwise NOT (`~`)

Reverses all bits.

* `1` becomes `0`
* `0` becomes `1`

---

## Example

```java
int num = 5;

int result = ~num;

System.out.println(result);
```

---

## Binary Calculation

Java integer = 32 bits

```text
5  = 00000000 00000000 00000000 00000101
~5 = 11111111 11111111 11111111 11111010
```

This binary represents `-6`.

Output:

```text
-6
```

---

# Important Formula

```text
~n = -(n + 1)
```

Example:

```text
~5
= -(5 + 1)
= -6
```

---

# Why Negative?

Java uses **2’s Complement** to store negative numbers.

---

# 5. Left Shift (`<<`)

Shifts bits to LEFT.

Every left shift multiplies by `2`.

---

## Example

```java
int num = 5;

int result = num << 1;

System.out.println(result);
```

---

## Binary Calculation

```text
5 = 00000101

5 << 1

00001010 = 10
```

Output:

```text
10
```

---

# More Examples

| Expression | Result |
| ---------- | ------ |
| `5 << 1`   | 10     |
| `5 << 2`   | 20     |
| `5 << 3`   | 40     |

---

# Formula

n \ll k = n \times 2^k

Example:

```text
5 << 2
= 5 × 2²
= 20
```

---

# 6. Right Shift (`>>`)

Shifts bits to RIGHT.

Every right shift divides by `2`.

---

## Example

```java
int num = 20;

int result = num >> 2;

System.out.println(result);
```

---

## Binary Calculation

```text
20 = 00010100

20 >> 2

00000101 = 5
```

Output:

```text
5
```

---

# Formula

n \gg k = \frac{n}{2^k}

---

# More Examples

| Expression | Result |
| ---------- | ------ |
| `20 >> 1`  | 10     |
| `20 >> 2`  | 5      |
| `20 >> 3`  | 2      |

---

# 7. Unsigned Right Shift (`>>>`)

Moves bits right but fills left side with `0`.

Used mainly for negative numbers.

---

## Example

```java
int num = -8;

System.out.println(num >> 2);
System.out.println(num >>> 2);
```

---

## Difference

### `>>`

Keeps sign bit.

### `>>>`

Does NOT keep sign.

Always fills with `0`.

---

# Difference Between `>>` and `>>>`

| Operator | Keeps Sign? |
| -------- | ----------- |
| `>>`     | Yes         |
| `>>>`    | No          |

---

# Complete Example Program

```java
public class BitwiseOperators {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("AND  : " + (a & b));
        System.out.println("OR   : " + (a | b));
        System.out.println("XOR  : " + (a ^ b));
        System.out.println("NOT  : " + (~a));
        System.out.println("LEFT : " + (a << 1));
        System.out.println("RIGHT: " + (a >> 1));
    }
}
```

---

# Output

```text
AND  : 1
OR   : 7
XOR  : 6
NOT  : -6
LEFT : 10
RIGHT: 2
```

---

# Bitwise Assignment Operators

| Operator | Meaning                     |
| -------- | --------------------------- |
| `&=`     | AND assign                  |
| `\|=`    | OR assign                   |
| `^=`     | XOR assign                  | 
| `<<=`    | Left shift assign           |
| `>>=`    | Right shift assign          |
| `>>>=`   | Unsigned right shift assign |

---

## Example

```java
int x = 5;

x <<= 1;

System.out.println(x);
```

Equivalent to:

```java
x = x << 1;
```

Output:

```text
10
```

---

# Where Bitwise Operators Are Used

| Usage                    | Example                      |
| ------------------------ | ---------------------------- |
| Permissions              | Read/Write flags             |
| Encryption               | XOR                          |
| Graphics                 | Pixel operations             |
| Networking               | IP calculations              |
| Embedded systems         | Hardware control             |
| Performance optimization | Fast multiplication/division |

---

# Important Notes

## 1. Works on integers only

Mostly used with:

```java
byte
short
int
long
char
```

---

## 2. Faster than arithmetic in some cases

Example:

```java
num << 1
```

can be faster than:

```java
num * 2
```

---

## 3. Very important for low-level programming

Used in:

* OS
* Drivers
* Game engines
* Embedded systems

---

# Easy Memory Tricks

| Operator | Meaning        |
| -------- | -------------- |
| `&`      | Both must be 1 |
| `\|\|`   | Any one is 1 |
| `^`      | Different bits |
| `~`      | Reverse bits   |
| `<<`     | Multiply by 2  |
| `>>`     | Divide by 2    |

---

# Interview Questions

## Q1. What is XOR used for?

* Encryption
* Swapping
* Finding unique number

---

## Q2. Why does `~5` become `-6`?

Because:

```text
~n = -(n + 1)
```

---

## Q3. Difference between `>>` and `>>>`?

| `>>`           | `>>>`          |
| -------------- | -------------- |
| Signed shift   | Unsigned shift |
| Keeps sign bit | Fills with 0   |

---

# Note: If int uses 32 bits, why do we show only 0101 and 0011?
# Java int always uses 32 bits internally.
5 = 00000000 00000000 00000000 00000101
3 = 00000000 00000000 00000000 00000011

---



# Real Life Use

This is a very common real-life use of **bitwise operators**.

Systems store permissions using bits:

| Permission | Binary | Decimal |
| ---------- | ------ | ------- |
| Read       | `0001` | 1       |
| Write      | `0010` | 2       |
| Execute    | `0100` | 4       |

Each permission uses one bit.

---

# Why Use Binary Permissions?

Because multiple permissions can be stored in ONE number.

Example:

```text id="j59r1h"
Read   = 0001
Write  = 0010
----------------
Both   = 0011
```

`0011` means:

* Read = YES
* Write = YES
* Execute = NO

---

# Creating User Permissions

## Example

User has:

* Read
* Write

```java id="4yyv2m"
int READ = 1;     // 0001
int WRITE = 2;    // 0010
int EXECUTE = 4;  // 0100

int userPermission = READ | WRITE;
```

---

# How OR (`|`) Combines Permissions

```text id="k8mqyo"
0001   READ
0010   WRITE
----
0011
```

Now:

```java id="4crvxj"
userPermission = 3;
```

Because binary `0011` = decimal `3`.

---

# Checking Permission Using AND (`&`)

We use `&` to check whether a permission exists.

---

# Check Read Permission

```java id="0bqj4s"
if ((userPermission & READ) != 0) {
    System.out.println("Read Permission Granted");
}
```

---

## Binary Calculation

```text id="s2o9rk"
userPermission = 0011
READ           = 0001
--------------------
Result         = 0001
```

Since result is NOT `0`, permission exists.

Output:

```text id="onxsl3"
Read Permission Granted
```

---

# Check Execute Permission

```java id="rfr5h9"
if ((userPermission & EXECUTE) != 0) {
    System.out.println("Execute Permission Granted");
} else {
    System.out.println("Execute Permission Denied");
}
```

---

## Binary Calculation

```text id="fc0w1r"
0011   userPermission
0100   EXECUTE
----
0000
```

Result = `0`

Meaning:

* Execute permission NOT present.

Output:

```text id="jlwmz6"
Execute Permission Denied
```

---

# Full Program

```java id="92qz92"
public class PermissionDemo {

    public static void main(String[] args) {

        int READ = 1;      // 0001
        int WRITE = 2;     // 0010
        int EXECUTE = 4;   // 0100

        // User has READ + WRITE
        int userPermission = READ | WRITE;

        // Check READ
        if ((userPermission & READ) != 0) {
            System.out.println("Read Permission Granted");
        }

        // Check WRITE
        if ((userPermission & WRITE) != 0) {
            System.out.println("Write Permission Granted");
        }

        // Check EXECUTE
        if ((userPermission & EXECUTE) != 0) {
            System.out.println("Execute Permission Granted");
        } else {
            System.out.println("Execute Permission Denied");
        }
    }
}
```

---

# Output

```text id="7lbm5s"
Read Permission Granted
Write Permission Granted
Execute Permission Denied
```

---

# Real Life Usage

Used in:

| System                 | Usage                  |
| ---------------------- | ---------------------- |
| Linux File Permissions | Read/Write/Execute     |
| Role-Based Access      | Admin/User permissions |
| Games                  | Feature unlocks        |
| APIs                   | Access scopes          |
| Databases              | Permission control     |

---

# Easy Logic

| Operation | Meaning          |
| --------- | ---------------- |
| `\|`      | Add permission   |
| `&`       | Check permission |

---

# Important Concept

Suppose:

```text id="rtk3dy"
READ    = 0001
WRITE   = 0010
EXECUTE = 0100
```

User has all permissions:

```text id="1pr6tr"
0001
0010
0100
----
0111
```

Decimal value:

```text id="p8u3lz"
7
```

So:

```java id="ht7w7c"
int allPermissions = 7;
```

means:

* Read = YES
* Write = YES
* Execute = YES
