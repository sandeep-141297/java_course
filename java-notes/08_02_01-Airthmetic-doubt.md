# Why Output is `0.0` (NOT `0.3`)?👍
Let’s fix the confusion clearly.

---

# 🔥 Your Code

```java
int num1 = 3;
int num2 = 10;

double result5 = num1 / num2;
System.out.println(result5);
```

---

# ❓ Why Output is `0.0` (NOT `0.3`)?

👉 Because **division happens BEFORE assignment**

---

# 🧠 Step-by-Step Execution

### Step 1: Expression evaluated first

```text
num1 / num2
= 3 / 10
```

👉 Both are `int`

```text
= 0   (decimal removed)
```

---

### Step 2: Assign to double

```text
double result5 = 0
```

👉 Converted to:

```text
0 → 0.0
```

✔ Final Output:

```text
0.0
```

---

# ❗ Where you misunderstood

You thought:

```text
double result5 = num1 / num2 → 0.3
```

👉 But Java does:

```text
(3 / 10) → 0   ❗ first
then → 0 → 0.0
```

---

# 🔥 Correct Way to Get `0.3`

👉 Convert BEFORE division

---

## ✅ Solution 1

```java
double result = (double) num1 / num2;
```

---

## ✅ Solution 2

```java
double result = num1 / 10.0;
```

---

## ✅ Solution 3

```java
double result = 3.0 / 10;
```

---

# ⚡ Key Difference

| Code                          | Result |
| ----------------------------- | ------ |
| `num1 / num2`                 | 0      |
| `(double) num1 / num2`        | 0.3    |
| `double result = num1 / num2` | 0.0    |

---

# 💥 Golden Rule (Very Important)

> **Type of expression matters, NOT variable type**

---

# 🧠 Simple Formula

```text
(int / int) → int
then → assign to double → decimal added
```

---

# 🚀 Interview One-Liner

> In Java, `num1 / num2` is evaluated first as integer division, producing 0, and then assigned to a double as 0.0; to get 0.3, casting must be done before division.

-----------------------------------------------------------------------------------------

# Simple Explain

> ❓ *“Why does `double result = num1 / num2;` give `0.0` instead of `0.3`?”*

Let’s fix this step-by-step.

---

# 🔥 Your Code

```java
int num1 = 3;
int num2 = 10;

double result = num1 / num2;
System.out.println(result);
```

---

# 💥 KEY POINT (Most Important)

> ❗ **Division happens BEFORE storing in `double`**

---

# 🧠 Step-by-Step Execution

## ✅ Step 1: Evaluate expression

```text
num1 / num2
= 3 / 10
```

👉 Both are `int`

```text
= 0   (NOT 0.3)
```

✔ Decimal already gone here ❗

---

## ✅ Step 2: Assign to double

```text
double result = 0
```

👉 Java converts:

```text
0 → 0.0
```

✔ Final Output:

```text
0.0
```

---

# ❗ Important Realization

👉 You are thinking:

```text
3 / 10 = 0.3 → then stored in double
```

👉 But Java actually does:

```text
(3 / 10) → 0   ❗ first
then → 0 → 0.0
```

---

# 🔥 Why double didn’t “save” it?

Because:

> ❗ **Double only stores the result — it does NOT change how calculation happened**

---

# 💡 Real-Life Analogy

Think like this:

```text
You already calculated wrong answer = 0
Now storing in bigger box (double)
```

👉 Bigger box cannot recover lost data

---

# ✅ Correct Way (VERY IMPORTANT)

👉 Convert BEFORE division

---

## ✔ Solution 1

```java
double result = (double) num1 / num2;
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

# ⚡ Comparison Table

| Code                          | What Happens    | Output |
| ----------------------------- | --------------- | ------ |
| `num1 / num2`                 | int division    | 0      |
| `double result = num1 / num2` | 0 → 0.0         | 0.0    |
| `(double) num1 / num2`        | double division | 0.3    |

---

# 🧠 Golden Rule

> **Calculation type depends on operands, not variable**

---

# 🚀 Interview One-Liner

> In Java, `num1 / num2` is evaluated as integer division first, producing 0, and only then stored in a double as 0.0; to get 0.3, at least one operand must be double before division.

---


