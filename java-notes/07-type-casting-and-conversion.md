# 📘 04 – Type Casting & Type Conversion in Java

---

# 🔥 1. What is Type Casting / Conversion?

👉 It means:

> Converting one data type into another data type

Example:

```java
int a = 10;
double b = a; // int → double
```

---

# ✅ 2. Types of Conversion

Java has **2 types**:

1. **Implicit (Widening) Casting**
2. **Explicit (Narrowing) Casting**

---

# 🟢 3. Implicit Casting (Automatic)

👉 Done automatically by Java
👉 Small → Big data type

---

## 🔹 Order (Very Important)

```text
byte → short → int → long → float → double
           ↑
         char
```

---

## 🔹 Example

```java
int a = 10;
double b = a;

System.out.println(b);
```

✔ Output:

```text
10.0
```

---

## 🔹 More Examples

```java
byte b = 10;
int i = b;      // OK

int x = 100;
long l = x;     // OK

char ch = 'A';
int num = ch;   // 65
```

---

## 🧠 Why it works?

👉 Because **no data loss**

---

# 🔴 4. Explicit Casting (Manual)

👉 Big → Small data type
👉 Must be written manually

---

## 🔹 Syntax

```java
(targetType) value
```

---

## 🔹 Example

```java
double d = 10.5;
int i = (int) d;

System.out.println(i);
```

✔ Output:

```text
10
```

👉 Decimal part lost ❗

---

## 🔹 More Examples

```java
int x = 130;
byte b = (byte) x;

System.out.println(b);
```

✔ Output:

```text
-126
```

---

# ❗ Why -126? (Important)

```text
byte range = -128 to 127
```

👉 Overflow happens

---

# 🔥 5. Special Cases

---

## 🔹 char ↔ int

```java
char ch = 'A';
int x = ch;

System.out.println(x); // 65
```

---

```java
int x = 66;
char ch = (char) x;

System.out.println(ch); // B
```

---

## 🔹 char increment

```java
char ch = 'a';
ch++;

System.out.println(ch); // b
```

---

## 🔹 Mixing types

```java
int a = 10;
double b = 5.5;

double result = a + b;
System.out.println(result);
```

✔ Output:

```text
15.5
```

👉 int automatically converts to double

---

# ⚡ 6. Type Promotion in Expressions

👉 Java automatically promotes types in expressions

---

## 🔹 Example

```java
byte a = 10;
byte b = 20;

int result = a + b;
```

👉 Result is **int**, not byte ❗

---

## 🔹 Why?

👉 Java converts smaller types to **int** during operations

---

# 🔥 7. Casting in Division

```java
int a = 5;
int b = 2;

System.out.println(a / b); // 2
```

---

## 🔹 Fix

```java
System.out.println((double)a / b); // 2.5
```

---

# 🔥 8. Overflow Example

```java
int x = 130;
byte b = (byte) x;

System.out.println(b); // -126
```

👉 Because:

# ❗ Why -126? (Important)


```text
Java internally does:
value % 256

130 % 256 = 130
130 > 127 → 130 - 256 = -126

130 - 256 = -126
```

```text
byte range = -128 to 127 

1. Negative numbers
-128 to -1  → 128 values

2. Zero
0 → 1 value

3. Positive numbers
1 to 127 → 127 values

Total 
128 (negative) + 1 (zero) + 127 (positive) = 256 ✔
```

```java
int x = 12;
byte b = (byte) x;

System.out.println(b); // 12
```
```text
12 % 256 = 12 ✔
```
# 12 remains 12 because it is already in valid range
# Only adjust (wrap) when value is OUTSIDE byte range

---

# 🧠 9. Important Rules

✔ Small → Big → Automatic
✔ Big → Small → Manual
✔ Possible data loss in narrowing
✔ char behaves like number
✔ Expressions promote to int

---

# 🎯 10. Quick Summary Table

| Type      | Conversion          | Example             |
| --------- | ------------------- | ------------------- |
| Implicit  | Auto                | `int → double`      |
| Explicit  | Manual              | `(int) 10.5`        |
| Promotion | Auto in expressions | `byte + byte → int` |

---

# 💥 Interview One-Liner

> Type casting in Java is the process of converting one data type into another, either automatically (widening) or manually (narrowing), depending on data size.

---

# 🚀 Bonus (Very Important)

```java
int a = 10;
int b = 3;

double result = a / b;
System.out.println(result);
```

👉 Output:

```text
3.0 ❗
```

👉 Fix:

```java
double result = (double) a / b;
```

✔ Output:

```text
3.333...
```

-----------------------------------------------------------------------------

## 🔹 Order (Very Important)

```text
byte → short → int → long → float → double
           ↑
         char
```

This diagram shows the **order of type promotion (automatic type conversion)** in Java — also called **widening casting**.

---

## 🔹 What this order means

```text
byte → short → int → long → float → double
           ↑
         char
```

👉 Java automatically converts a **smaller data type → bigger data type** in this order.

---

## 🔹 Simple Understanding (Hinglish)

* Java says:
  👉 “Agar chhota container hai, to uska data bada container me easily daal sakte ho.”

* Example:

  ```java
  byte a = 10;
  int b = a;   // automatically converted
  ```

✔ No error because **byte → int** is allowed.

---

## 🔹 Why this order exists?

Because of **memory size**:

| Data Type | Size    |
| --------- | ------- |
| byte      | 1 byte  |
| short     | 2 bytes |
| int       | 4 bytes |
| long      | 8 bytes |
| float     | 4 bytes |
| double    | 8 bytes |

👉 Bigger type = can hold more data → safe conversion

---

## 🔹 What about `char`? (IMPORTANT)

👉 `char` is special:

* It is **2 bytes**
* Stores **Unicode values (0 to 65535)**

So:

```java
char ch = 'A';
int x = ch;   // allowed
```

✔ Because `char → int`

But:

```java
short s = ch; // ❌ error
```

❌ Because `char` is **unsigned**, `short` is **signed**

---

## 🔹 Visual Explanation

Think like buckets:

```
byte → small bucket
short → bigger
int → bigger
long → bigger
float → bigger
double → biggest
```

👉 Water (data) can flow **forward**, not backward

---

## 🔹 Important Rule

✔ Allowed (Automatic / Widening)

```java
int a = 10;
double d = a;  // OK
```

❌ Not Allowed (Narrowing)

```java
double d = 10.5;
int a = d;   // ERROR
```

✔ Fix using casting:

```java
int a = (int) d;
```

---

## 🔹 Key Point (Interview Ready)

* This order is called **Type Promotion Hierarchy**
* Used in:

  * Assignments
  * Expressions
  * Arithmetic operations

---

## 🔹 Bonus Example (Expression Promotion)

```java
byte a = 10;
byte b = 20;

int result = a + b;  // NOT byte
```

👉 Why `int`?

Because Java promotes **byte → int** during calculation

---








