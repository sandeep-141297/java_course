# Java Literals

## What are Literals?

**Literals** are **fixed values** assigned to variables in a program.

Example:

```java
int num = 10;     // 10 is a literal
char ch = 'A';    // 'A' is a literal
```

---

# Types of Literals in Java

Java supports several types of literals:

```text
1. Integer Literals
2. Floating-Point Literals
3. Character Literals
4. String Literals
5. Boolean Literals
6. Null Literal
```

---

# 1. Integer Literals

Integer literals are used to represent **whole numbers**.

### Types of Integer Literals

| Type        | Description           | Example           |
| ----------- | --------------------- | ----------------- |
| Decimal     | Base 10 (default)     | `int a = 100;`    |
| Binary      | Base 2 (prefix `0b`)  | `int b = 0b1010;` |
| Octal       | Base 8 (prefix `0`)   | `int c = 012;`    |
| Hexadecimal | Base 16 (prefix `0x`) | `int d = 0x1A;`   |

| Type     | Needs Conversion?        |
| -------- | ------------------------ |
| `100`    | ❌ No (already decimal)   |
| `0b1010` | ✅ Yes (binary → decimal) |
| `012`    | ✅ Yes (octal → decimal)  |
| `0x1A`   | ✅ Yes (hex → decimal)    |


### In Hexadecimal (Base 16)
| Symbol | Value |
| ------ | ----- |
| 0–9    | 0–9   |
| A      | 10    |
| B      | 11    |
| C      | 12    |
| D      | 13    |
| E      | 14    |
| F      | 15    |

| Context         | Value of 'A' |
| --------------- | ------------ |
| Hexadecimal     | 10 ✅         |
| Unicode / ASCII | 65 ✅         |

🔹 Simple Memory Trick
Hex → A = 10
Character → A = 65
---

### Example

```java
int a = 100;     // Decimal
int b = 0b1010;  // Binary (10)
int c = 012;     // Octal (10)
int d = 0x1A;    // Hexadecimal (26)
```

---

# 2. Floating-Point Literals

Used to represent **decimal numbers**.

### Types

* `float` (use `f` or `F`)
* `double` (default)

### Example

```java
float f = 10.5f;
double d = 10.5;
double exp = 12e3; // 12 × 10³ = 12000
```

---

# 3. Character Literals

Used to represent **single characters** inside **single quotes `' '`**.

### Example

```java
char ch1 = 'A';
char ch2 = '1';
char ch3 = '@';
```

---

### Escape Sequences

| Escape | Meaning      |
| ------ | ------------ |
| `\n`   | New line     |
| `\t`   | Tab          |
| `\\`   | Backslash    |
| `\'`   | Single quote |
| `\"`   | Double quote |

Example:

```java
System.out.println("Hello\nWorld");
```

---

# 4. String Literals

A sequence of characters inside **double quotes `" "`**.

### Example

```java
String name = "Sandeep";
String msg = "Hello World";
```

---

# 5. Boolean Literals

Only two values:

```java
true
false
```

### Example

```java
boolean isJavaEasy = true;
boolean isRainy = false;
```

---

# 6. Null Literal

Represents **no value or empty reference**.

```java
String name = null;
```

Used only with **non-primitive types**.

---

# Important Points

* `10` → integer literal
* `10.5` → double literal
* `'A'` → char literal
* `"A"` → string literal ❗
* `true/false` → boolean literals
* `null` → no reference

---

# Interview Questions

### Q1. Difference between `'A'` and `"A"`?

* `'A'` → **char**
* `"A"` → **String**

---

### Q2. What is default type of decimal number?

👉 `double`

---

### Q3. Why do we use `f` in float?

Because decimal values are **double by default**, so we specify:

```java
float f = 10.5f;
```

---

# Summary

* Literals are **fixed values**
* Java supports **6 types of literals**
* Integer literals support **multiple number systems**
* Float requires **`f` suffix**
* String uses **double quotes**


