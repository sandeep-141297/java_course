# can we change datatype of variables?
Short answer 👍:

> ❌ **No, you cannot change the data type of a variable once it is declared in Java.**

---

# 🔥 Why?

When you write:

```java
int a = 10;
```

👉 Java fixes:

* variable name → `a`
* data type → `int`

So later:

```java
a = 10.5; // ❌ ERROR
```

👉 Not allowed because:

```text
10.5 → double
a → int
```

---

# ✅ What CAN you do?

👉 You can **convert the value**, not the variable type.

---

## 🔹 Example 1: Using Casting

```java
int a = 10;
double b = a;   // int → double

System.out.println(b); // 10.0
```

---

## 🔹 Example 2: Reverse

```java
double x = 10.5;
int y = (int) x;

System.out.println(y); // 10
```

---

# 🔁 Important Concept

👉 Variable type is **fixed**
👉 Value can be **converted**

---

# ❗ Common Mistake

```java
int a = 10;
a = 20.5; // ❌ not allowed
```

✔ Correct way:

```java
double a = 10;
a = 20.5; // ✅
```

---

# 🧠 Real-Life Analogy

Think of variable like a box 📦

```text
int box → only stores integers
double box → can store decimal
```

👉 You cannot change the box type after creating it
👉 But you can create a new box

---

# 💥 Correct Approach

```java
int a = 10;
double b = a; // new variable
```

---

# 🚀 Interview One-Liner

> In Java, a variable’s data type cannot be changed after declaration; only its value can be converted using type casting.
