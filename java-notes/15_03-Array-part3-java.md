Now that you understand **1D arrays**, let's move to **Part 3**.

---

# Java Arrays - Part 3

## Advanced Arrays (2D, 3D, Jagged Arrays & Array Methods)

> **Prerequisite:** Complete Part 1 and Part 2 first.

---

# What You Will Learn

In this chapter, you will learn:

* What is a 2D array?
* Why do we need a 2D array?
* How to declare, create, and initialize a 2D array
* How to access and update elements
* How to print a 2D array using nested loops
* What is a 3D array?
* What is a Jagged array?
* Passing arrays to methods
* Returning arrays from methods
* Copying arrays
* Useful methods from the `Arrays` class

---

# 1. What is a 2D Array?

A **2D array** stores data in **rows and columns**, just like a table.

Think of a classroom seating chart.

```text
      Column
        0    1    2
      +----+----+----+
Row 0 | 10 | 20 | 30 |
      +----+----+----+
Row 1 | 40 | 50 | 60 |
      +----+----+----+
Row 2 | 70 | 80 | 90 |
      +----+----+----+
```

---

# Why Do We Need a 2D Array?

Suppose you have marks of **3 students** in **3 subjects**.

Without a 2D array:

```java
int[] student1 = {80, 75, 90};
int[] student2 = {85, 88, 70};
int[] student3 = {95, 92, 89};
```

With a 2D array:

```java
int[][] marks = {
    {80, 75, 90},
    {85, 88, 70},
    {95, 92, 89}
};
```

Everything is stored in one variable.

---

# 2. Declaration

```java
int[][] matrix;
```

Only declaration.

---

# 3. Creation

```java
int[][] matrix = new int[3][4];
```

Meaning:

* 3 rows
* 4 columns

Memory:

```text
      C0  C1  C2  C3
     +---+---+---+---+
R0   | 0 | 0 | 0 | 0 |
     +---+---+---+---+
R1   | 0 | 0 | 0 | 0 |
     +---+---+---+---+
R2   | 0 | 0 | 0 | 0 |
     +---+---+---+---+
```

---

# 4. Initialization

```java
int[][] matrix = {
    {10,20,30},
    {40,50,60},
    {70,80,90}
};
```

Memory:

```text
      C0  C1  C2
     +---+---+---+
R0   |10 |20 |30 |
     +---+---+---+
R1   |40 |50 |60 |
     +---+---+---+
R2   |70 |80 |90 |
     +---+---+---+
```

---

# 5. Accessing Elements

Syntax:

```java
array[row][column]
```

Example:

```java
System.out.println(matrix[0][0]);
```

Output

```text
10
```

Another example:

```java
System.out.println(matrix[2][1]);
```

Output

```text
80
```

Visualization:

```text
matrix[2][1]

      C0  C1  C2
     +---+---+---+
R0   |10 |20 |30 |
     +---+---+---+
R1   |40 |50 |60 |
     +---+---+---+
R2   |70 |80 |90 |
     +---+---+---+
          ↑
```

---

# 6. Updating Elements

```java
matrix[1][2] = 100;
```

Now:

```text
      C0  C1  C2
     +---+---+----+
R0   |10 |20 |30  |
     +---+---+----+
R1   |40 |50 |100 |
     +---+---+----+
R2   |70 |80 |90  |
     +---+---+----+
```

---

# 7. Printing a 2D Array

Use **nested loops**.

```java
for(int row = 0; row < matrix.length; row++) {

    for(int col = 0; col < matrix[row].length; col++) {

        System.out.print(matrix[row][col] + " ");
    }

    System.out.println();
}
```

Output

```text
10 20 30
40 50 60
70 80 90
```

---

# How Nested Loops Work

```text
Row = 0
   Column = 0 → 10
   Column = 1 → 20
   Column = 2 → 30

Row = 1
   Column = 0 → 40
   Column = 1 → 50
   Column = 2 → 60

Row = 2
   Column = 0 → 70
   Column = 1 → 80
   Column = 2 → 90
```

Outer loop changes rows.

Inner loop changes columns.

---

# 8. 3D Array

A **3D array** is an array of 2D arrays.

Syntax:

```java
int[][][] cube = new int[2][2][2];
```

Imagine a cube instead of a table.

```text
Layer 0

1 2
3 4

Layer 1

5 6
7 8
```

Initialization:

```java
int[][][] cube = {
    {
        {1,2},
        {3,4}
    },
    {
        {5,6},
        {7,8}
    }
};
```

Access:

```java
System.out.println(cube[1][0][1]);
```

Output

```text
6
```

Meaning:

* Layer = 1
* Row = 0
* Column = 1

---

# 9. Jagged Array

A **Jagged Array** is a 2D array where **each row can have a different number of columns**.

Normal 2D array:

```text
10 20 30
40 50 60
70 80 90
```

Every row has **3 columns**.

Jagged array:

```text
10 20
30 40 50
60
70 80 90 100
```

Rows have different lengths.

Declaration:

```java
int[][] jagged = new int[4][];
```

Create each row separately.

```java
jagged[0] = new int[2];
jagged[1] = new int[3];
jagged[2] = new int[1];
jagged[3] = new int[4];
```

Or initialize directly:

```java
int[][] jagged = {
    {10,20},
    {30,40,50},
    {60},
    {70,80,90,100}
};
```

Printing:

```java
for(int row = 0; row < jagged.length; row++) {

    for(int col = 0; col < jagged[row].length; col++) {

        System.out.print(jagged[row][col] + " ");
    }

    System.out.println();
}
```

Output

```text
10 20
30 40 50
60
70 80 90 100
```

---

# 10. Passing an Array to a Method

```java
public static void printArray(int[] numbers) {

    for(int num : numbers) {
        System.out.println(num);
    }
}
```

Calling:

```java
int[] arr = {10,20,30};

printArray(arr);
```

---

# 11. Returning an Array

```java
public static int[] createArray() {

    int[] numbers = {10,20,30};

    return numbers;
}
```

Using it:

```java
int[] arr = createArray();
```

---

# 12. Copying Arrays

## Method 1: Manual Copy

```java
int[] original = {10,20,30};

int[] copy = new int[original.length];

for(int i = 0; i < original.length; i++) {
    copy[i] = original[i];
}
```

---

## Method 2: clone()

```java
int[] copy = original.clone();
```

---

## Method 3: System.arraycopy()

```java
System.arraycopy(original, 0, copy, 0, original.length);
```

Meaning:

* original array
* start index
* destination array
* destination start index
* number of elements

---

## Method 4: Arrays.copyOf()

```java
import java.util.Arrays;

int[] copy = Arrays.copyOf(original, original.length);
```

---

# 13. Useful Methods of Arrays Class

Import:

```java
import java.util.Arrays;
```

---

## sort()

```java
int[] numbers = {40,10,30,20};

Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));
```

Output

```text
[10, 20, 30, 40]
```

---

## toString()

```java
System.out.println(Arrays.toString(numbers));
```

Output

```text
[10, 20, 30, 40]
```

---

## equals()

```java
int[] a = {1,2,3};
int[] b = {1,2,3};

System.out.println(Arrays.equals(a,b));
```

Output

```text
true
```

---

## fill()

```java
int[] numbers = new int[5];

Arrays.fill(numbers,100);

System.out.println(Arrays.toString(numbers));
```

Output

```text
[100, 100, 100, 100, 100]
```

---

## binarySearch()

```java
int[] numbers = {10,20,30,40};

int index = Arrays.binarySearch(numbers,30);

System.out.println(index);
```

Output

```text
2
```

> **Note:** The array must be **sorted** before using `binarySearch()`.

---

# Summary

* A **2D array** stores data in **rows and columns**.
* Access elements using `array[row][column]`.
* Use **nested loops** to traverse a 2D array.
* A **3D array** adds another dimension (layers).
* A **Jagged array** allows each row to have a different number of columns.
* Arrays can be **passed to methods** and **returned from methods**.
* Arrays can be copied using:

  * Manual loop
  * `clone()`
  * `System.arraycopy()`
  * `Arrays.copyOf()`
* The `Arrays` class provides useful methods like `sort()`, `fill()`, `equals()`, `binarySearch()`, and `toString()`.

---

## Next (Part 4)

We'll cover:

1. **Array of Objects** (with memory diagrams)
2. **Advantages of Arrays**
3. **Drawbacks of Arrays**
4. **Arrays vs ArrayList**
5. **Arrays vs LinkedList**
6. **Interview Questions**
7. **Real-world use cases**
8. **Best practices**

This final part ties arrays into object-oriented programming and explains when arrays are the right choice versus Java collections.
