# 📘 Assignment Operators in Java

---

# 🔥 1. What is an Assignment Operator?

👉 Assignment operators are used to:

> **Assign values to variables**

---

## 🔹 Basic Assignment Operator

```java id="bgad4f"
=
```

### Example

```java id="1h59e0"
int a = 10;
```

👉 Here:

```text id="n9i6vt"
10 assigned to variable a
```

---

# 🧠 2. Types of Assignment Operators

Java provides:

| Operator | Meaning                         |                       |
| -------- | ------------------------------- | --------------------- |
| `=`      | Simple assignment               |                       |
| `+=`     | Add and assign                  |                       |
| `-=`     | Subtract and assign             |                       |
| `*=`     | Multiply and assign             |                       |
| `/=`     | Divide and assign               |                       |
| `%=`     | Modulus and assign              |                       |
| `&=`     | Bitwise AND and assign          |                       |
| `        | =`                              | Bitwise OR and assign |
| `^=`     | Bitwise XOR and assign          |                       |
| `<<=`    | Left shift and assign           |                       |
| `>>=`    | Right shift and assign          |                       |
| `>>>=`   | Unsigned right shift and assign |                       |

---

# 🔥 3. Simple Assignment Operator (`=`)

Used to assign value directly.

---

## 🔹 Example

```java id="c4dgo6"
int a = 5;
System.out.println(a);
```

✔ Output:

```text id="apqwbj"
5
```

---

# 🔥 4. Add and Assign (`+=`)

Shortcut for:

```java id="vsw9pw"
a = a + value;
```

---

## 🔹 Example

```java id="zjlwmm"
int a = 10;

a += 5;

System.out.println(a);
```

### Step

```text id="7lh2z3"
a = 10 + 5
a = 15
```

✔ Output:

```text id="w1p51g"
15
```

---

# 🔥 5. Subtract and Assign (`-=`)

Shortcut for:

```java id="txu4kz"
a = a - value;
```

---

## 🔹 Example

```java id="0l71ca"
int a = 20;

a -= 5;

System.out.println(a);
```

✔ Output:

```text id="cim63d"
15
```

---

# 🔥 6. Multiply and Assign (`*=`)

Shortcut for:

```java id="ls8gn2"
a = a * value;
```

---

## 🔹 Example

```java id="uhhzpd"
int a = 10;

a *= 2;

System.out.println(a);
```

✔ Output:

```text id="3jy8u4"
20
```

---

# 🔥 7. Divide and Assign (`/=`)

Shortcut for:

```java id="vshk9h"
a = a / value;
```

---

## 🔹 Example

```java id="stamzq"
int a = 10;

a /= 2;

System.out.println(a);
```

✔ Output:

```text id="j9tlmb"
5
```

---

# 🔥 8. Modulus and Assign (`%=`)

Shortcut for:

```java id="ew9rzl"
a = a % value;
```

---

## 🔹 Example

```java id="d6t4zq"
int a = 10;

a %= 3;

System.out.println(a);
```

### Step

```text id="b6hyf0"
10 % 3 = 1
```

✔ Output:

```text id="ymvb6w"
1
```

---

# 🔥 9. Bitwise AND and Assign (`&=`)

Shortcut for:

```java id="trv8gc"
a = a & value;
```

---

## 🔹 Example

```java id="epydlt"
int a = 5; // 0101

a &= 3;    // 0011

System.out.println(a);
```

### Binary

```text id="tv81sw"
0101
0011
----
0001
```

✔ Output:

```text id="3wwzde"
1
```

---

# 🔥 10. Bitwise OR and Assign (`|=`)

Shortcut for:

```java id="e5a9v3"
a = a | value;
```

---

## 🔹 Example

```java id="chjlwm"
int a = 5; // 0101

a |= 3;    // 0011

System.out.println(a);
```

### Binary

```text id="70jlwm"
0101
0011
----
0111
```

✔ Output:

```text id="cw1j0o"
7
```

---

# 🔥 11. Bitwise XOR and Assign (`^=`)

Shortcut for:

```java id="sjlwm8"
a = a ^ value;
```

---

## 🔹 Example

```java id="mjlwmw"
int a = 5; // 0101

a ^= 3;    // 0011

System.out.println(a);
```

### Binary

```text id="jlwmf7"
0101
0011
----
0110
```

✔ Output:

```text id="y1t8g1"
6
```

---

# 🔥 12. Left Shift and Assign (`<<=`)

Shortcut for:

```java id="jlwmcb"
a = a << value;
```

---

## 🔹 Example

```java id="jlwm6k"
int a = 5;

a <<= 1;

System.out.println(a);
```

### Binary

```text id="5lh4b5"
0101 << 1 = 1010
```

✔ Output:

```text id="mjlwm0"
10
```

---

# 🔥 13. Right Shift and Assign (`>>=`)

Shortcut for:

```java id="jlwmja"
a = a >> value;
```

---

## 🔹 Example

```java id="jlwmpt"
int a = 8;

a >>= 1;

System.out.println(a);
```

### Binary

```text id="jlwm75"
1000 >> 1 = 0100
```

✔ Output:

```text id="jlwmc8"
4
```

---

# 🔥 14. Unsigned Right Shift and Assign (`>>>=`)

Shortcut for:

```java id="jlwmxv"
a = a >>> value;
```

Used for unsigned right shifting.

---

## 🔹 Example

```java id="jlwm5o"
int a = -8;

a >>>= 1;

System.out.println(a);
```

👉 Used mainly in bit-level programming.

---

# 🧠 15. Important Concept

Compound assignment operators automatically cast result.

---

## 🔹 Example

```java id="jlwm9d"
byte a = 10;

a += 5; // ✅ works
```

But:

```java id="jlwmq3"
byte a = 10;

a = a + 5; // ❌ ERROR
```

---

# ❓ Why?

Because:

```text id="jlwmzt"
a + 5 → becomes int
```

But `+=` automatically converts back to byte.

---

# 💥 16. Quick Summary Table

| Operator | Example    | Meaning              |      |            |
| -------- | ---------- | -------------------- | ---- | ---------- |
| `=`      | `a = 5`    | Assign               |      |            |
| `+=`     | `a += 2`   | Add & assign         |      |            |
| `-=`     | `a -= 2`   | Subtract & assign    |      |            |
| `*=`     | `a *= 2`   | Multiply & assign    |      |            |
| `/=`     | `a /= 2`   | Divide & assign      |      |            |
| `%=`     | `a %= 2`   | Modulus & assign     |      |            |
| `&=`     | `a &= 2`   | Bitwise AND          |      |            |
| `        | =`         | `a                   | = 2` | Bitwise OR |
| `^=`     | `a ^= 2`   | Bitwise XOR          |      |            |
| `<<=`    | `a <<= 1`  | Left shift           |      |            |
| `>>=`    | `a >>= 1`  | Right shift          |      |            |
| `>>>=`   | `a >>>= 1` | Unsigned right shift |      |            |

---

# 🚀 Interview One-Liner

> Assignment operators are used to assign or update variable values, and compound assignment operators combine arithmetic or bitwise operations with assignment in a single step.



