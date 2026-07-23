# Drawback - Array Insertion/Shift Process

```java
int fixedSizeArr[] = new int[5]; // Declare an array of size 5
fixedSizeArr[0] = 10;
fixedSizeArr[1] = 20;
fixedSizeArr[2] = 30;
fixedSizeArr[3] = 40;
fixedSizeArr[4] = 50;

// insertion in the middle of the array
int indexToInsert = 2; // Index where we want to insert the new element
int newElement = 25; // The new element to be inserted

// Shift elements to the right
for (int i = fixedSizeArr.length - 1; i > indexToInsert; i--) {
    System.out.println("Shifting element at index " + (i - 1) + " to index " + i);
    System.out.println(fixedSizeArr[i]);
    fixedSizeArr[i] = fixedSizeArr[i - 1];
    System.out.println(fixedSizeArr[i]);
}

```

This is one of the most important concepts for interviews. Let's understand it in **very simple language**.

---

# Initial Array

```java
int fixedSizeArr[] = new int[5];
```

Java creates an array of **5 boxes**.

```
Index

 0    1    2    3    4
+----+----+----+----+----+
| 0  | 0  | 0  | 0  | 0  |
+----+----+----+----+----+
```

---

# Store Values

```java
fixedSizeArr[0] = 10;
fixedSizeArr[1] = 20;
fixedSizeArr[2] = 30;
fixedSizeArr[3] = 40;
fixedSizeArr[4] = 50;
```

Now the array becomes:

```
Index

 0    1    2    3    4
+----+----+----+----+----+
|10  |20  |30  |40  |50  |
+----+----+----+----+----+
```

---

# We Want to Insert

```java
int indexToInsert = 2;
int newElement = 25;
```

Meaning:

We want to insert **25** at **index 2**.

Current array:

```
10 20 30 40 50
      ↑
     index 2
```

Desired result:

```
10 20 25 30 40
```

Notice something?

Where did **50** go?

Because the array size is fixed (5), **50 will be lost**.

---

# Why Do We Shift?

If we directly do

```java
fixedSizeArr[2] = 25;
```

Result:

```
10 20 25 40 50
```

Oops!

The **30 disappeared**.

So first we must move existing elements to the right.

---

# The Loop

```java
for (int i = fixedSizeArr.length - 1; i > indexToInsert; i--)
```

Let's understand every part.

---

## fixedSizeArr.length

```
length = 5
```

---

## fixedSizeArr.length - 1

```
5 - 1 = 4
```

Why?

Because the last index is

```
0 1 2 3 4
```

not 5.

So

```java
i = 4
```

---

## Condition

```java
i > indexToInsert
```

indexToInsert is

```
2
```

So the loop runs while

```
i > 2
```

Values of `i`:

```
i = 4
i = 3
Stop
```

Notice it **doesn't run for i = 2**, because that's where we want to insert the new value.

---

# First Iteration

```
i = 4
```

Current array

```
Index

0   1   2   3   4

10 20 30 40 50
```

---

### Line

```java
System.out.println("Shifting element at index " + (i - 1) + " to index " + i);
```

Substitute `i = 4`

```
Shifting element at index 3 to index 4
```

Meaning

Move value from

```
index 3
```

to

```
index 4
```

---

### Line

```java
System.out.println(fixedSizeArr[i]);
```

`i = 4`

Print

```
50
```

This is the current value at index 4 **before shifting**.

---

### Line

```java
fixedSizeArr[i] = fixedSizeArr[i - 1];
```

Substitute

```java
fixedSizeArr[4] = fixedSizeArr[3];
```

Meaning

```
50 ← 40
```

Array becomes

```
10 20 30 40 40
```

Notice

50 is gone.

---

### Line

```java
System.out.println(fixedSizeArr[i]);
```

Print

```
40
```

Because index 4 now contains 40.

---

# Second Iteration

```
i = 3
```

Current array

```
10 20 30 40 40
```

---

Print

```
Shifting element at index 2 to index 3
```

---

Print

```java
fixedSizeArr[3]
```

Output

```
40
```

(before shifting)

---

Shift

```java
fixedSizeArr[3] = fixedSizeArr[2];
```

Means

```
40 ← 30
```

Array becomes

```
10 20 30 30 40
```

---

Print

```
30
```

(after shifting)

---

Loop ends.

Current array

```
10 20 30 30 40
```

Notice:

Index 2 is now **free to overwrite**, because its original value (30) has already been copied to index 3.

---

# Now Insert New Element

```java
fixedSizeArr[indexToInsert] = newElement;
```

Means

```java
fixedSizeArr[2] = 25;
```

Final array

```
Index

0   1   2   3   4

10 20 25 30 40
```

---

# Visual Animation

### Before

```
10   20   30   40   50
          ↑
      Insert here
```

---

### Step 1

Move

```
40 → 50 position
```

```
10   20   30   40   40
```

---

### Step 2

Move

```
30 → 40 position
```

```
10   20   30   30   40
```

---

### Step 3

Insert

```
25
```

```
10   20   25   30   40
```

---

# Why Start from the End?

Suppose you started from the front:

```
10 20 30 40 50
```

Move index 2 to index 3:

```
10 20 30 30 50
```

Now the original **40 is lost** before you had a chance to move it.

That's why we always shift **from the last element toward the insertion point**. This preserves every value that still needs to be moved.

---

## Complete Execution Table

| Step    | i | Operation         | Array After Operation |
| ------- | - | ----------------- | --------------------- |
| Initial | - | Original array    | `10 20 30 40 50`      |
| 1       | 4 | `arr[4] = arr[3]` | `10 20 30 40 40`      |
| 2       | 3 | `arr[3] = arr[2]` | `10 20 30 30 40`      |
| 3       | - | `arr[2] = 25`     | `10 20 25 30 40`      |

This example also demonstrates **why insertion into the middle of an array is considered slow**: Java must shift existing elements one by one before placing the new value.

