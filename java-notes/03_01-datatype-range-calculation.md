# ✅ 1. Are these integer subtypes?

Yes 👍
`byte`, `short`, `int`, `long` are all:

> **Integer data types (signed integers)**

They store **whole numbers (no decimal)** and support **negative + positive values**.

---

# ✅ 2. How to Calculate Range (Core Concept)

Java uses **2’s complement representation** for signed integers.

### Formula:

👉 For **n bits**:

```text
Range = -2^(n-1)  to  2^(n-1) - 1
```

---

# 🔍 Let’s Understand Step-by-Step

## 🔹 Example: `byte` (1 byte = 8 bits)

👉 n = 8 bits

```text
Min = -2^(8-1) = -2^7 = -128
Max =  2^(8-1) - 1 = 2^7 - 1 = 127
```

✔ Range = **-128 to 127**

---

## 🔹 Example: `short` (2 bytes = 16 bits)

```text
Min = -2^(16-1) = -2^15 = -32,768
Max =  2^15 - 1 = 32,767
```

✔ Range = **-32,768 to 32,767**

---

## 🔹 Example: `int` (4 bytes = 32 bits)

```text
Min = -2^(31)
Max =  2^31 - 1
```

✔ Range = **-2,147,483,648 to 2,147,483,647**

---

## 🔹 Example: `long` (8 bytes = 64 bits)

```text
Min = -2^(63)
Max =  2^63 - 1
```

✔ Range = **very large (~9 quintillion)**

---

# 🧠 Easy Trick to Remember

👉 Just remember:

```text
Min = -2^(bits-1)
Max =  2^(bits-1) - 1
```

---

# ⚡ Why “-1” in Max?

Because **one value is used for zero**.

Total values:

```text
2^n total values
```

For byte:

```text
2^8 = 256 values
= 128 negative + 1 zero + 127 positive
```

---

# 💥 Visual Understanding (byte)

```text
-128 ... -3 -2 -1  0  1  2  3 ... 127
```

---

# 🚀 Interview Tip (Very Important)

If interviewer asks:

👉 *“How do you calculate range of int?”*

Answer:

> Java uses **2’s complement**.
> For n bits, range is **-2^(n-1) to 2^(n-1)-1**.

---

# 🔥 Bonus (Why no +128?)

Because:

```text
Positive side loses 1 value
```

That extra value is used for **negative side** in 2’s complement.




