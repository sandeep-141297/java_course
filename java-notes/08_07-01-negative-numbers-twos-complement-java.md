I created a focused document explaining:

* Why `0101` is `+5`
* Why `1011` represents `-5`
* 2’s complement step-by-step
* Invert bits + add 1
* Actual 32-bit Java representation
* Leftmost sign bit meaning
* Right shift with negative numbers
* Sign extension
* Java examples and binary calculations

---




# Doubt

## Q = -5 how 1011 it should be 0101

Good catch.
`0101` is `+5`, not `-5`.

The confusion happens because negative numbers in Java are stored using **2’s complement**.

---

# Positive 5

```text id="x2m8p1"
5 = 0101
```

---

# How Java Stores `-5`

To make a negative number:

## Step 1: Start with `+5`

```text id="j7k4v2"
0101
```

---

## Step 2: Invert bits

```text id="n3q8w5"
1010
```

---

## Step 3: Add 1

```text id="c6r1t9"
1011
```

So:

```text id="b5u2y8"
-5 = 1011
```

(This is simplified 4-bit representation.)

---

# Actual Java 32-bit Representation

Positive 5:

```text id="m8v4p7"
00000000 00000000 00000000 00000101
```

Invert:

```text id="k1n6x3"
11111111 11111111 11111111 11111010
```

Add 1:

```text id="d9s2f5"
11111111 11111111 11111111 11111011
```

This is how Java stores `-5`.

---

# Why Use 2’s Complement?

Computers use it because:

* Addition/subtraction becomes easier
* Only one representation for zero
* Faster hardware operations

---

# Important Formula

To find negative binary:

```text id="q4z7m1"
Invert bits + Add 1
```

---

# Verify `1011 = -5`

Take:

```text id="t6w8p2"
1011
```

Invert:

```text id="r3y9k4"
0100
```

Add 1:

```text id="f1u5n7"
0101 = 5
```

So original number is:

```text id="v8x2c6"
-5
```

---

# Final Important Point

| Binary | Meaning                  |
| ------ | ------------------------ |
| `0101` | `+5`                     |
| `1011` | `-5` (in 2’s complement) |

So your observation was correct:

```text id="g2m9r5"
0101 is positive 5, not negative 5.
```
