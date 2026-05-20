# Optimizing Greatest Number Logic in Java

## Problem

We want to find the greatest number among:

```java
int x = 5;
int y = 9;
int z = 7;
```

---

# Version 1 — Full Comparisons

```java
if (x > y && x > z)
    System.out.println("x is greatest");
else if (y > x && y > z)
    System.out.println("y is greatest");
else
    System.out.println("z is greatest");
```

---

# How This Works

## Step 1

```java
if (x > y && x > z)
```

Checks:

* Is `x > y` ?
* Is `x > z` ?

If both are true:

```java
x is greatest
```

Otherwise move to next condition.

---

## Step 2

```java
else if (y > x && y > z)
```

Checks:

* Is `y > x` ?
* Is `y > z` ?

If both are true:

```java
y is greatest
```

Otherwise:

```java
z is greatest
```

---

# Problem in This Logic

When first condition fails:

```java
x > y && x > z
```

we already know:

```text
x is NOT the greatest
```

So checking:

```java
y > x
```

again is unnecessary.

This creates extra comparisons.

---

# Optimized Version

```java
if (x > y && x > z)
    System.out.println("x is greatest");
else if (y > z)
    System.out.println("y is greatest");
else
    System.out.println("z is greatest");
```

---

# Why This Works

After first condition fails:

```java
x > y && x > z
```

Java already knows:

```text
x lost
```

Now only two numbers remain:

```text
y and z
```

So we only compare:

```java
y > z
```

---

# Visual Understanding

## Before First Check

```text
x vs y vs z
```

---

## After First Condition Fails

```text
x ❌ eliminated
```

Remaining:

```text
y vs z
```

So:

```java
if (y > z)
```

is enough.

---

# Comparison Count

## Full Version

```java
else if (y > x && y > z)
```

Performs:

1. `y > x`
2. `y > z`

Total = 2 comparisons

---

## Optimized Version

```java
else if (y > z)
```

Performs:

1. `y > z`

Total = 1 comparison

---

# Why This Saves Time

Computers execute every comparison separately.

Fewer comparisons means:

* less CPU work
* faster execution
* cleaner code

This optimization becomes important in:

* loops
* large datasets
* real applications
* algorithms

---

# Example Walkthrough

```java
x = 5
y = 9
z = 7
```

---

## Step 1

```java
x > y && x > z
```

Means:

```java
5 > 9 && 5 > 7
```

Result:

```text
false
```

So:

```text
x eliminated
```

---

## Step 2

Now compare only:

```java
y > z
```

Means:

```java
9 > 7
```

Result:

```text
true
```

Output:

```text
y is greatest
```

---

# Important Limitation

This optimized version does NOT properly handle ties.

---

# Example

```java
x = 5
y = 9
z = 9
```

Condition:

```java
y > z
```

Means:

```java
9 > 9
```

Result:

```text
false
```

So output becomes:

```text
z is greatest
```

But actually:

```text
y and z are equal
```

---

# Tie Handling Version

```java
if (x > y && x > z)
    System.out.println("x is greatest");
else if (y > x && y > z)
    System.out.println("y is greatest");
else if (z > x && z > y)
    System.out.println("z is greatest");
else
    System.out.println("Tie exists");
```

---

# Efficient Version Using >=

```java
if (x >= y && x >= z)
    System.out.println("x is greatest");
else if (y >= z)
    System.out.println("y is greatest");
else
    System.out.println("z is greatest");
```

---

# Summary Table

| Version           | Comparisons | Tie Handling | Performance     |
| ----------------- | ----------- | ------------ | --------------- |
| Full comparisons  | More        | Yes          | Slightly slower |
| Optimized version | Less        | No           | Faster          |
| Using `>=`        | Less        | Partial      | Faster          |

---

# Key Concept

The optimization works because:

```text
Once a value loses,
there is no need to compare it again.
```

This is a very important programming and algorithm concept.
