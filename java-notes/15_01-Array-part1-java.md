# Java Arrays - Beginner Notes (Part 1)

---

# What is an Array?

An **array** is a container that stores **multiple values of the same data type** in a single variable.

Instead of creating many variables, we can store everything in one array.

### Without Array

```java
int mark1 = 80;
int mark2 = 75;
int mark3 = 90;
int mark4 = 85;
int mark5 = 70;
```

Here we created **5 different variables**.

Imagine if there were **1000 students**.

Creating 1000 variables would be difficult.

---

### With Array

```java
int[] marks = {80, 75, 90, 85, 70};
```

Now all marks are stored in **one variable** called `marks`.

---

# Why Do We Need Arrays?

Arrays make our code simple and organized.

Without arrays:

* Too many variables
* Hard to manage
* Hard to process all values

With arrays:

* Store many values together
* Easy to access
* Easy to loop through
* Less code

Example:

Without array

```java
System.out.println(mark1);
System.out.println(mark2);
System.out.println(mark3);
System.out.println(mark4);
System.out.println(mark5);
```

With array

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

One loop prints all values.

---

# Real-Life Example

Think of a train.

```
Train

+----+----+----+----+----+
| A1 | A2 | A3 | A4 | A5 |
+----+----+----+----+----+
```

Every coach is connected together.

Similarly,

```
marks

+----+----+----+----+----+
| 80 | 75 | 90 | 85 | 70 |
+----+----+----+----+----+
```

Each box stores one value.

---

# Syntax

## Method 1

```java
int[] marks = new int[5];
```

or

```java
int marks[] = new int[5];
```

Both are correct.

Most Java developers prefer:

```java
int[] marks;
```

---

# Declaring an Array

```java
int[] numbers;
```

Only declaration.

Memory is **not yet created**.

---

# Creating an Array

```java
numbers = new int[5];
```

Now memory is created for **5 integers**.

---

# Declaration + Creation Together

```java
int[] numbers = new int[5];
```

---

# Initialize an Array

You can put values one by one.

```java
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

Result

```
Index

0   1   2   3   4

+---+---+---+---+---+
|10 |20 |30 |40 |50 |
+---+---+---+---+---+
```

---

# Shortcut Initialization

Instead of assigning one by one,

```java
int[] numbers = {10, 20, 30, 40, 50};
```

This is the easiest way.

---

# Array Index Starts from 0

This is very important.

```
Value

10   20   30   40   50

Index

0    1    2    3    4
```

Access values like this:

```java
System.out.println(numbers[0]);
```

Output

```
10
```

```java
System.out.println(numbers[2]);
```

Output

```
30
```

---

# Array Size Cannot Change

Suppose we create:

```java
int[] numbers = new int[5];
```

Memory looks like:

```
+----+----+----+----+----+
|    |    |    |    |    |
+----+----+----+----+----+
```

Java creates exactly **5 boxes**.

You cannot make it:

```
+----+----+----+----+----+----+
```

or

```
+----+----+----+
```

The size is **fixed**.

If you need a bigger array, create a **new array**.

Example

```java
int[] oldArray = new int[5];

int[] newArray = new int[10];
```

The old array still has 5 elements.

The new array has 10 elements.

---

# Why Can't Array Size Change?

When Java creates an array, it reserves a fixed block of memory.

Example

```java
int[] numbers = new int[5];
```

Java reserves memory for exactly **5 integers**.

Later, if Java allowed changing the size to 10, it might not find enough free space immediately after the existing array.

So Java keeps arrays **fixed-size** for simplicity and speed.

---

# Default Values

When you create an array with `new`, Java automatically fills it with default values.

```java
int[] numbers = new int[5];
```

Result

```
0 0 0 0 0
```

Example

```java
System.out.println(numbers[0]);
```

Output

```
0
```

---

# Types of Arrays

### 1. One-Dimensional (1D) Array

Stores values in one line.

```java
int[] numbers = {10, 20, 30, 40};
```

```
+----+----+----+----+
|10  |20  |30  |40  |
+----+----+----+----+
```

---

### 2. Two-Dimensional (2D) Array

Stores values in rows and columns (like a table).

```java
int[][] matrix = {
    {1, 2},
    {3, 4}
};
```

```
+---+---+
|1  |2  |
+---+---+
|3  |4  |
+---+---+
```

---

### 3. Multi-Dimensional Array

Three or more dimensions.

Example

```java
int[][][] cube = new int[2][2][2];
```

You usually learn and use these after mastering 1D and 2D arrays.

---

# Summary

* An **array** stores multiple values of the **same data type**.
* Arrays reduce the need to create many separate variables.
* Array indexing starts from **0**.
* Arrays have a **fixed size** once created.
* To increase the size, create a **new array**.
* Arrays can be:

  * **1D Array** (single row)
  * **2D Array** (rows and columns)
  * **Multi-Dimensional Array** (3D and beyond)
* Arrays created with `new` are automatically filled with default values (for `int`, it's `0`).

---

**Next (Part 2)** we can cover:

* Memory diagram (Stack vs Heap for Arrays)
* How arrays are stored in JVM memory
* `length` property
* Reading values using loops
* Updating elements
* Common mistakes (ArrayIndexOutOfBoundsException)
* Pass arrays to methods
* Enhanced `for-each` loop
* Array copying and comparison
