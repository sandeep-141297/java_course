You’re expecting **1**, but Java gives **0** — and that’s actually correct 👍
# 🔥 Your Code

```java
int num1 = 3;
int num2 = 10;

int result4 = num1 / num2;
System.out.println(result4);
```

---

# ❓ Why Output is `0`?

👉 Because both values are **int**

```text
3 / 10 = 0.3
```

But:

> ❗ **int cannot store decimal values**

So Java **cuts the decimal part**:

```text
0.3 → 0
```

✔ Final output:

```text
0
```

---

# 🧠 Important Rule

> **Integer division removes decimal part (no rounding)**

---

# ❗ Why NOT 1?

You might think:

```text
3/10 ≈ 1 (rounded)
```

👉 But Java does **NOT round**

```text
It truncates (cuts)
```

---

# 🔥 Visual Understanding

```text
3 / 10 = 0.3

int → only integer part → 0
```

---

# ✅ How to Get Correct Decimal Result?

👉 Convert at least one value to **double**

---

## ✔ Solution 1

```java
double result = (double) num1 / num2;
System.out.println(result);
```

✔ Output:

```text
0.3
```

---

## ✔ Solution 2

```java
double result = num1 / 10.0;
```

---

## ✔ Solution 3

```java
double result = 3.0 / 10;
```

---

# ⚡ Quick Comparison

| Expression | Output |
| ---------- | ------ |
| `3 / 10`   | 0      |
| `3.0 / 10` | 0.3    |
| `3 / 10.0` | 0.3    |

---

# 💥 Golden Rule

> If both operands are `int` → result is `int`

---

# 🚀 Interview One-Liner

> In Java, integer division truncates the decimal part, so `3 / 10` results in `0`, not `1`.

---

next 🔥

👉 I can explain **why `5/2 = 2` but `5/2.0 = 2.5` internally (type promotion step-by-step)** — this is very commonly asked.

Perfect 👍 this is one of the **most asked concepts** — let’s break it down step-by-step so it *clicks fully*.

---

# 🔥 Problem

```java
System.out.println(5 / 2);   // 2
System.out.println(5 / 2.0); // 2.5
```

👉 Why different results?

---

# 🧠 Core Concept: **Type Promotion**

> Java converts smaller types to bigger types before calculation

---

# ✅ Case 1: `5 / 2`

```java
int / int
```

### Step-by-step:

```text
5 ÷ 2 = 2.5
```

👉 But both are `int`, so:

```text
Decimal removed → 2
```

✔ Output: **2**

---

# ✅ Case 2: `5 / 2.0`

```java
int / double
```

### Step-by-step:

👉 Java promotes `int → double`

```text
5 → 5.0
```

Now:

```text
5.0 / 2.0 = 2.5
```

✔ Output: **2.5**

---

# 🔥 Rule You Must Remember

> If ANY operand is `double` → result becomes `double`

---

# ⚡ More Examples

---

## Example 1

```java
System.out.println(10 / 4); // 2
```

👉 int / int → 2.5 → **2**

---

## Example 2

```java
System.out.println(10 / 4.0); // 2.5
```

👉 int → double → **2.5**

---

## Example 3

```java
double result = 5 / 2;
System.out.println(result);
```

👉 Important ❗

```text
5 / 2 = 2 (already calculated)
then stored as 2.0
```

✔ Output: **2.0**

---

# ❗ Common Mistake

```java
double result = 5 / 2; // ❌ wrong thinking
```

👉 Many think:

```text
= 2.5 ❌
```

👉 Actual:

```text
= 2 → then converted → 2.0
```

---

# ✅ Correct Way

```java
double result = (double) 5 / 2;
```

✔ Output:

```text
2.5
```

---

# 🔁 Type Promotion Flow

```text
byte → short → int → long → float → double
```

👉 Java moves **left → right**

---

# 💡 Visual Flow

### Case 1

```text
5(int) / 2(int)
→ result int
→ 2
```

---

### Case 2

```text
5(int) / 2.0(double)
→ 5 becomes 5.0
→ result double
→ 2.5
```

---

# 💥 Golden Rules

✔ int / int → int result
✔ int / double → double result
✔ Casting BEFORE division matters
✔ Casting AFTER division is useless

---

# 🚀 Interview One-Liner

> In Java, type promotion converts operands to the largest data type before evaluation, so if one operand is double, the entire expression is evaluated as double.

---

