**Operators in Java (full details + examples)**.

---

# 📘 08 – Operators in Java

---

# 🔥 1. What is an Operator?

👉 An **operator** is a symbol that performs an operation on variables or values.

Example:

```java
int a = 10 + 5;
```

👉 `+` is an operator

---

# 🧠 2. Types of Operators in Java

Java has these main types:

1. Arithmetic Operators
2. Unary Operators
3. Assignment Operators
4. Relational (Comparison) Operators
5. Logical Operators
6. Bitwise Operators
7. Shift Operators
8. Ternary Operator
9. instanceof Operator

---

# ➕ 3. Arithmetic Operators

Used for mathematical operations

| Operator | Meaning        | Example |
| -------- | -------------- | ------- |
| `+`      | Addition       | `a + b` |
| `-`      | Subtraction    | `a - b` |
| `*`      | Multiplication | `a * b` |
| `/`      | Division       | `a / b` |
| `%`      | Modulus        | `a % b` |

---

## 🔹 Example

```java
int a = 10, b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3
System.out.println(a % b); // 1
```

---

# 🔁 4. Unary Operators

Operate on **one operand**

| Operator | Meaning   |
| -------- | --------- |
| `+`      | Positive  |
| `-`      | Negative  |
| `++`     | Increment |
| `--`     | Decrement |
| `!`      | NOT       |

---

## 🔹 Example

```java
int a = 5;

System.out.println(++a); // 6 (pre-increment)
System.out.println(a++); // 6 (post-increment)
System.out.println(a);   // 7
```

---

# 🟰 5. Assignment Operators

Used to assign values

| Operator | Example  |
| -------- | -------- |
| `=`      | `a = 10` |
| `+=`     | `a += 5` |
| `-=`     | `a -= 5` |
| `*=`     | `a *= 2` |
| `/=`     | `a /= 2` |
| `%=`     | `a %= 2` |

---

## 🔹 Example

```java
int a = 10;
a += 5; // 15
a *= 2; // 30
```

---

# ⚖️ 6. Relational Operators

Used for comparison (returns boolean)

| Operator | Meaning       |
| -------- | ------------- |
| `==`     | Equal         |
| `!=`     | Not equal     |
| `>`      | Greater       |
| `<`      | Less          |
| `>=`     | Greater equal |
| `<=`     | Less equal    |

---

## 🔹 Example

```java
int a = 10, b = 20;

System.out.println(a == b); // false
System.out.println(a < b);  // true
```

---

# 🔗 7. Logical Operators

Used with boolean values

| Operator | Meaning |
| -------- | ------- |
| `&&`     | AND     |
| `\|\|`   | OR      |
| `!`      | NOT     |

---

## 🔹 Example

```java
int age = 20;

System.out.println(age > 18 && age < 30); // true
```

---

# 🔌 8. Bitwise Operators

Work on binary (bits)

| Operator | Meaning |
| -------- | ------- |
| `&`      | AND     |
| `\|`     | OR      |
| `^`      | XOR     |
| `~`      | NOT     |

---

## 🔹 Example

```java
int a = 5;  // 0101
int b = 3;  // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
```

---

# 🔄 9. Shift Operators

Shift bits left/right

| Operator | Meaning              |
| -------- | -------------------- |
| `<<`     | Left shift           |
| `>>`     | Right shift          |
| `>>>`    | Unsigned right shift |

---

## 🔹 Example

```java
int a = 5; // 0101

System.out.println(a << 1); // 10
System.out.println(a >> 1); // 2
```

---

# ❓ 10. Ternary Operator

Short form of if-else

```java
condition ? value1 : value2;
```

---

## 🔹 Example

```java
int a = 10, b = 20;

int max = (a > b) ? a : b;
System.out.println(max); // 20
```

---

# 🔍 11. instanceof Operator

Checks object type

```java
obj instanceof ClassName
```

---

## 🔹 Example

```java
String str = "Hello";

System.out.println(str instanceof String); // true
```

---

# 🧠 12. Type Promotion in Operators

```java
byte a = 10;
byte b = 20;

int result = a + b; // result is int
```

👉 Java promotes smaller types to `int`

---

# ⚡ 13. Important Rules

✔ `/` with int → integer result
✔ `%` gives remainder
✔ `++a` vs `a++` difference
✔ Logical works on boolean
✔ Bitwise works on bits

---

# 💥 Final Summary

| Type       | Purpose       |
| ---------- | ------------- |
| Arithmetic | Math          |
| Unary      | Single value  |
| Assignment | Store value   |
| Relational | Compare       |
| Logical    | Conditions    |
| Bitwise    | Binary ops    |
| Shift      | Move bits     |
| Ternary    | Short if-else |

---

# 🚀 Interview One-Liner

> Operators in Java are symbols used to perform operations on variables and values, such as arithmetic, logical, relational, and bitwise operations.

---

👉 **operator precedence + tricky interview questions (like ++a + a++)** which confuse many developers.
