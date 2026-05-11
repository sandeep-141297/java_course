# Java Byte Type Casting — Complete Beginner Documentation

# 1. Introduction

In Java, sometimes we convert one datatype into another datatype.

This process is called:

```text id="j2m5q8"
Type Casting
```

Example:

```java id="h7n3v1"
int x = 10;
byte b = (byte)x;
```

Here:

```text id="x4p8m2"
int → byte
```

conversion is happening.

---

# 2. What is `byte` in Java?

`byte` is a small integer datatype.

Size:

```text id="k6w0n9"
1 byte = 8 bits
```

Range:

```text id="f1v7p4"
-128 to 127
```

This means a byte can store only values between:

```text id="d5q2m8"
Minimum = -128
Maximum = 127
```

---

# 3. Why Byte Range is `-128 to 127`

A byte has:

```text id="u8n4k1"
8 bits
```

Total possible values:

```text id="g0x5r7"
2^8 = 256
```

These 256 positions are used for:

* Negative numbers
* Zero
* Positive numbers

So final range becomes:

```text id="t9m3p6"
-128 to 127
```

---

# 4. Memory Representation

A byte stores values like this:

```text id="w2f6k8"
... -128 ... -3 -2 -1 0 1 2 3 ... 126 127
```

After `127`, Java cannot go further.

So it starts again from:

```text id="c4q7v0"
-128
```

This is called:

```text id="z1p5m9"
Overflow / Wrapping
```

---

# 5. Easy Real-Life Example (Clock)

Think of a clock.

```text id="q8n2k4"
11 → 12 → 1 → 2
```

After 12, the clock restarts from 1.

Byte works similarly.

After:

```text id="n7m0v5"
127
```

next value becomes:

```text id="r4k8p2"
-128
```

---

# 6. Byte Rotation Table

| Actual Number | Stored as Byte |
| ------------- | -------------- |
| 127           | 127            |
| 128           | -128           |
| 129           | -127           |
| 130           | -126           |
| 131           | -125           |

---

# 7. Understanding the Rotation

See carefully:

```text id="m5q1x7"
127  -> 127
128  -> -128
129  -> -127
130  -> -126
```

Java continues counting after 127.

---

# 8. Type Casting Syntax

Syntax:

```java id="y6k3v9"
datatype variable = (datatype)value;
```

Example:

```java id="p1m8q4"
byte b = (byte)x;
```

---

# 9. Why Casting is Needed

`int` is bigger than `byte`.

| Datatype | Size    |
| -------- | ------- |
| byte     | 1 byte  |
| int      | 4 bytes |

Java does not automatically put a bigger datatype into a smaller datatype because data may be lost.

So explicit casting is required:

```java id="t7n2w5"
(byte)
```

---

# 10. Example Without Overflow

```java id="g4p9m1"
int x = 100;
byte b = (byte)x;

System.out.println(b);
```

Output:

```java id="v8k5q3"
100
```

Why?

Because:

```text id="f2m7n0"
100 is inside byte range
```

Range:

```text id="x5q1k6"
-128 to 127
```

---

# 11. Example With Overflow

```java id="j9v4m2"
int x = 130;
byte b = (byte)x;

System.out.println(b);
```

Output:

```java id="c6p0n8"
-126
```

---

# 12. Why 130 Becomes -126

int x2 = 130; byte bx2 = (byte) x2; output -126 ?

## Step 1

Maximum byte value:

```text id="h3m8q5"
127
```

---

## Step 2

130 goes beyond limit.

---

## Step 3

Java rotates after 127:

```text id="u1k7p4"
128 -> -128
129 -> -127
130 -> -126
```

Final Output:

```java id="n5v2m9"
-126
```

---

# 13. Formula Method

When value exceeds 127:

```text id="k8q4w1"
result = value - 256
```

Examples:

## 128

```text id="m2p7v5"
128 - 256 = -128
```

## 129

```text id="g6n1k8"
129 - 256 = -127
```

## 130

```text id="p4v9m3"
130 - 256 = -126
```

---

# 14. Understanding `(byte)256`

Example:

```java id="d7m0q6"
int x = 256;
byte b = (byte)x;

System.out.println(b);
```

Output:

```java id="r2k8v1"
0
```

---

# 15. Why `(byte)256` Gives 0

A byte has total:

```text id="s9p3m7"
256 positions
```

So after one complete rotation:

```text id="x4k1n5"
256 returns to 0
```

Exactly like:

```text id="v7m2q8"
12 on clock returns to 12
```

---

# 16. Most Important Confusion

byte ac = 124; int b = 256; output 0 ?

## Example

```java id="h0v6p4"
byte ac = 124;
int b = 256;

ac = (byte)b;
```

Many beginners think:

```text id="w5k8n2"
(byte)124
```

But this is WRONG.

---

# 17. What Actually Happens

Java converts:

```java id="t3m7q1"
(byte)b
```

Since:

```java id="f8p2v6"
b = 256
```

Java actually does:

```java id="u4n9k5"
(byte)256
```

NOT:

```java id="m1q6v8"
(byte)124
```

---

# 18. Step-by-Step Execution

## Step 1

```java id="c7v3m0"
byte ac = 124;
```

Now:

```text id="z2k5p9"
ac = 124
```

No conversion happens.

Because:

```text id="q8n1v4"
124 already fits inside byte range
```

---

## Step 2

```java id="n6p4m7"
int b = 256;
```

Now:

```text id="h5v0k2"
b = 256
```

---

## Step 3

```java id="x1m8q3"
ac = (byte)b;
```

Means:

```java id="r9k4v6"
ac = (byte)256;
```

Now Java converts 256 into byte.

Result:

```text id="m3q7p1"
0
```

So now:

```text id="f6v2n8"
ac = 0
```

Old value `124` gets replaced.

---

## Step 4

```java id="p5k9m4"
System.out.println(ac);
```

Output:

```java id="t8v1q7"
0
```

---

# 19. Important Understanding

This:

```java id="v2n6k0"
(byte)b
```

means:

```text id="j4m8p5"
convert value stored in b
```

NOT:

```text id="u7q1v3"
convert ac
```

---

# 20. Binary Explanation

## 130 in Binary

```text id="m0k5p8"
00000000 10000010
```

Byte stores only last 8 bits:

```text id="g7v2n4"
10000010
```

This binary value represents:

```text id="q1m6k9"
-126
```

---

# 21. Modulus (%) Method

Java internally behaves similarly to:

```text id="h8p3v0"
value % 256
```

Examples:

| Value | value % 256 |
| ----- | ----------- |
| 256   | 0           |
| 257   | 1           |
| 258   | 2           |

So:

```java id="f5m9q2"
(byte)256 = 0
(byte)257 = 1
```

---

# 22. Important Interview Examples

## Example 1

```java id="z4n8k1"
int x = 127;
byte b = (byte)x;

System.out.println(b);
```

Output:

```java id="m7q2v5"
127
```

---

## Example 2

```java id="x0p6m3"
int x = 128;
byte b = (byte)x;

System.out.println(b);
```

Output:

```java id="u3k9v7"
-128
```

---

## Example 3

```java id="r5m1q8"
int x = 130;
byte b = (byte)x;

System.out.println(b);
```

Output:

```java id="n2v6k4"
-126
```

---

## Example 4

```java id="q9m3p7"
int x = 256;
byte b = (byte)x;

System.out.println(b);
```

Output:

```java id="w1k8v5"
0
```

---

# 23. Super Easy Final Memory Trick

Remember only these rules:

## Rule 1

```text id="d6p2m9"
Byte range = -128 to 127
```

---

## Rule 2

After 127:

```text id="t4v7k1"
128 = -128
129 = -127
130 = -126
```

---

## Rule 3

```text id="f0m5q8"
256 returns to 0
```

because byte rotates like a circle.
