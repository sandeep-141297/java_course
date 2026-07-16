# Java Arrays - Part 2

## Memory, Basic Operations & Common Mistakes (Beginner Friendly)

> **Prerequisite:** Read **Part 1** first.

---

# What You Will Learn

In this chapter, you will learn:

* How arrays are stored in JVM memory
* Stack and Heap memory
* What is a reference variable?
* How to access array elements
* How to update values
* `length` property
* Loop through an array
* Enhanced for-each loop
* Taking input using `Scanner`
* Common array mistakes

---

# 1. How is an Array Stored in Memory?

When we write:

```java
int[] numbers = new int[5];
```

Two things happen.

### Step 1

Java creates a **reference variable** called `numbers`.

This variable is stored in the **Stack Memory**.

### Step 2

Java creates the actual array in the **Heap Memory**.

The reference variable stores the **address** of that array.

---

## Memory Diagram

```
                JVM Memory

+--------------------+      +-----------------------------+
|     Stack Memory   |      |        Heap Memory          |
+--------------------+      +-----------------------------+
| numbers ----------+------>| 0 | 0 | 0 | 0 | 0           |
+--------------------+      +-----------------------------+
```

Notice:

* Stack stores **reference**
* Heap stores **actual array**

---

# What is a Reference Variable?

A reference variable **does not store the array itself**.

It stores the **address (location)** of the array.

Think of it like this.

```
House Address
↓

25, Park Street
```

The address is **not the house**.

It only tells you **where the house is**.

Similarly,

```
numbers
     ↓
Heap Memory
```

`numbers` only knows where the array is stored.

---

# Why is the Array Stored in Heap?

Arrays can be large.

Java stores large objects in Heap Memory because:

* Heap is bigger than Stack.
* Objects can live longer.
* Multiple references can point to the same object.

---

# What is Stored in the Array Initially?

```java
int[] numbers = new int[5];
```

Java automatically fills the array with default values.

```
Index

0   1   2   3   4

+---+---+---+---+---+
| 0 | 0 | 0 | 0 | 0 |
+---+---+---+---+---+
```

---

# 2. Accessing Array Elements

Use the index.

```java
int[] numbers = {10, 20, 30, 40, 50};

System.out.println(numbers[0]);
System.out.println(numbers[2]);
System.out.println(numbers[4]);
```

Output

```
10
30
50
```

---

# Visual Representation

```
Index

0    1    2    3    4

+----+----+----+----+----+
|10  |20  |30  |40  |50  |
+----+----+----+----+----+
```

```
numbers[2]

↓

30
```

---

# 3. Updating Array Elements

You can change a value.

```java
int[] numbers = {10, 20, 30, 40, 50};

numbers[2] = 100;

System.out.println(numbers[2]);
```

Output

```
100
```

Memory becomes

```
+----+----+-----+----+----+
|10  |20  |100  |40  |50  |
+----+----+-----+----+----+
```

---

# 4. length Property

To know how many elements are present,

use

```java
numbers.length
```

Example

```java
int[] numbers = {10,20,30,40,50};

System.out.println(numbers.length);
```

Output

```
5
```

Notice

It is

```java
numbers.length
```

NOT

```java
numbers.length()
```

Because **length is a property**, not a method.

---

# 5. Traversing an Array Using for Loop

Instead of writing

```java
System.out.println(numbers[0]);
System.out.println(numbers[1]);
System.out.println(numbers[2]);
System.out.println(numbers[3]);
System.out.println(numbers[4]);
```

Use a loop.

```java
int[] numbers = {10,20,30,40,50};

for(int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

Output

```
10
20
30
40
50
```

---

# How Does the Loop Work?

```
i = 0 → numbers[0] → 10

i = 1 → numbers[1] → 20

i = 2 → numbers[2] → 30

i = 3 → numbers[3] → 40

i = 4 → numbers[4] → 50

Stop
```

---

# Why Use `numbers.length`?

Instead of

```java
for(int i = 0; i < 5; i++)
```

write

```java
for(int i = 0; i < numbers.length; i++)
```

Why?

Suppose later the array changes.

```java
int[] numbers = new int[100];
```

The loop still works.

No need to change `5` to `100`.

---

# 6. Enhanced for-each Loop

Java provides another loop.

```java
int[] numbers = {10,20,30,40,50};

for(int value : numbers) {
    System.out.println(value);
}
```

Output

```
10
20
30
40
50
```

---

# How Does for-each Work?

```
numbers

+----+----+----+----+----+
|10  |20  |30  |40  |50  |
+----+----+----+----+----+

value = 10

↓

value = 20

↓

value = 30

↓

value = 40

↓

value = 50
```

You don't need to manage the index.

---

# for Loop vs for-each Loop

| for Loop            | for-each Loop                  |
| ------------------- | ------------------------------ |
| Uses index          | Doesn't use index              |
| Can update elements | Mainly used for reading values |
| More control        | Easier to write                |

---

# 7. Taking Input Using Scanner

Example

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        for(int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks are:");

        for(int mark : marks) {
            System.out.println(mark);
        }

        sc.close();
    }
}
```

Sample Output

```
Enter mark: 70
Enter mark: 80
Enter mark: 90
Enter mark: 60
Enter mark: 75

Marks are:
70
80
90
60
75
```

---

# 8. Common Mistakes

## Mistake 1: ArrayIndexOutOfBoundsException

Wrong

```java
int[] numbers = {10,20,30};

System.out.println(numbers[3]);
```

Array has only these indexes:

```
0
1
2
```

There is **no index 3**.

Output

```
Exception in thread "main"
ArrayIndexOutOfBoundsException
```

---

## Mistake 2: NegativeArraySizeException

Wrong

```java
int[] numbers = new int[-5];
```

Output

```
NegativeArraySizeException
```

Array size can never be negative.

---

## Mistake 3: NullPointerException

```java
int[] numbers = null;

System.out.println(numbers.length);
```

Output

```
NullPointerException
```

Because no array has been created.

Memory

```
numbers

↓

null
```

There is nothing in Heap Memory.

---

# 9. Practice Examples

## Print all elements

```java
int[] numbers = {5,10,15,20};

for(int num : numbers) {
    System.out.println(num);
}
```

---

## Find Sum

```java
int[] numbers = {10,20,30,40};

int sum = 0;

for(int num : numbers) {
    sum += num;
}

System.out.println(sum);
```

Output

```
100
```

---

## Find Largest Number

```java
int[] numbers = {15,50,10,80,30};

int max = numbers[0];

for(int num : numbers) {
    if(num > max) {
        max = num;
    }
}

System.out.println(max);
```

Output

```
80
```

---

## Find Average

```java
int[] numbers = {10,20,30,40};

int sum = 0;

for(int num : numbers) {
    sum += num;
}

double average = (double) sum / numbers.length;

System.out.println(average);
```

Output

```
25.0
```

---

# Summary

* Arrays are **objects**, so they are stored in **Heap Memory**.
* The array variable (like `numbers`) is a **reference variable** stored in **Stack Memory**.
* Access elements using their **index**.
* Update values using `array[index] = value`.
* Use `array.length` to get the size of the array.
* Use a **for loop** when you need the index or want to modify elements.
* Use a **for-each loop** when you only need to read elements.
* Use `Scanner` to take input into an array.
* Avoid common mistakes:

  * `ArrayIndexOutOfBoundsException`
  * `NegativeArraySizeException`
  * `NullPointerException`

> **Next (Part 3):** We'll cover **2D Arrays**, **3D Arrays**, **Jagged Arrays**, **passing arrays to methods**, **returning arrays**, **copying arrays**, and useful methods from the `Arrays` class.
