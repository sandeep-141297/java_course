Good question 👍 — this comes from how **binary numbers work in computers**.

---

## 🔢 Why `int` range is **-2³¹ to 2³¹ - 1**

In Java, `int` = **4 bytes = 32 bits**

Each bit can be either **0 or 1**

So total combinations:

[
2^{32} = 4,294,967,296 \text{ values}
]

---

## ⚡ But why not 0 to 2³²-1?

Because Java uses **Two's Complement** for signed numbers.

👉 In this system:

* **1 bit (leftmost)** = sign bit

  * `0` → positive
  * `1` → negative

So:

* 1 bit used for sign
* Remaining bits = **31 bits for value**

---
# Two's Complement
Two’s complement is a binary numeral system used to represent signed integers in digital computing. It enables both positive and negative numbers to be expressed within a fixed bit length, using the same circuitry for addition and subtraction. Nearly all modern processors adopt this system for integer arithmetic. 

Key facts
First formal use: 1958

Bitwise rule: Invert all bits and add one to form a negative

Numeric range (n bits): –2ⁿ⁻¹ to 2ⁿ⁻¹ – 1

Zero representation: Single unique value (all bits = 0)

Common usage: Standard signed integer form in CPUs and programming languages
---

## 📊 Positive Range

[
2^{31} - 1 = 2,147,483,647
]

Why `-1`?

Because **0 is included**

---

## 📊 Negative Range

[
-2^{31} = -2,147,483,648
]

---

## 🧠 Final Range of `int`

[
-2^{31} \text{ to } 2^{31} - 1
]

👉 i.e.

```
-2,147,483,648  to  +2,147,483,647
```

---

## 🔍 Simple Intuition

Think like this:

| Bits    | Meaning |
| ------- | ------- |
| 1 bit   | sign    |
| 31 bits | number  |

So total:

```
Negative side → 2^31 values
Positive side → (2^31 - 1) values
```

---

## ❗ Important Trick (Interview Favorite)

👉 Why negative side has **one extra value**?

Because in **Two’s Complement**, **0 exists only once**, so:

```
Negative = 2^31 values
Positive = 2^31 - 1 values
```

---

## 🧪 Example in Java

```java
int min = Integer.MIN_VALUE;
int max = Integer.MAX_VALUE;

System.out.println(min); // -2147483648
System.out.println(max); // 2147483647
```

---

## 🚀 Quick Summary

* Total bits = 32 → (2^{32}) values
* Signed → split into positive + negative
* Range = **-2³¹ to 2³¹ - 1**

---

If you want, I can **visually show how binary creates -2³¹** step by step (very easy trick for interviews) 👍
