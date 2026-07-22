This is the **final part**. Since you've already learned **Classes & Objects**, this is the right time to learn **Array of Objects**.

---

# Java Arrays - Part 4

# Array of Objects, Advantages, Drawbacks & Interview Questions

> **Prerequisite:**
>
> * Part 1 (Basics)
> * Part 2 (Memory & Loops)
> * Part 3 (2D, 3D & Jagged Arrays)

---

# What You Will Learn

* What is an Array of Objects?
* Why do we need it?
* Memory diagram
* Advantages of Arrays
* Drawbacks (Limitations)
* Arrays vs ArrayList
* Arrays vs LinkedList
* Real-world examples
* Interview Questions

---

# 1. What is an Array of Objects?

Until now, we stored **primitive values**.

Example

```java
int[] marks = {80, 90, 75};
```

This stores **integers**.

But sometimes we want to store **objects**.

Example

* Students
* Employees
* Books
* Cars

For this, Java provides **Array of Objects**.

---

# Real Life Example

Imagine a school.

Instead of storing only marks,

You want to store

* Student Name
* Age
* Roll Number

Each student becomes an **object**.

Many student objects are stored inside an array.

---

# Step 1: Create a Class

```java
class Student {

    String name;
    int age;

}
```

---

# Step 2: Create an Array

```java
Student[] students = new Student[3];
```

Question:

Did Java create three Student objects?

**No.**

It only created **3 reference variables**.

Memory

```text
students

+------+-------+------+
| null | null  | null |
+------+-------+------+
```

Every element is `null`.

No object exists yet.

---

# Step 3: Create Objects

```java
students[0] = new Student();
students[1] = new Student();
students[2] = new Student();
```

Now objects are created.

Memory

```text
Stack

students
    │
    ▼

Heap

+-----------+-----------+-----------+
| Ref       | Ref       | Ref       |
+-----------+-----------+-----------+
    │            │            │
    ▼            ▼            ▼

 Student      Student      Student
+------+      +------+      +------+
|name  |      |name  |      |name  |
|age   |      |age   |      |age   |
+------+      +------+      +------+
```

---

# Step 4: Store Data

```java
students[0].name = "Rahul";
students[0].age = 20;

students[1].name = "Amit";
students[1].age = 22;

students[2].name = "Neha";
students[2].age = 19;
```

---

# Step 5: Print Data

```java
for(Student student : students) {

    System.out.println(student.name + " " + student.age);

}
```

Output

```text
Rahul 20
Amit 22
Neha 19
```

---

# Complete Program

```java
class Student {

    String name;
    int age;

}

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].name = "Rahul";
        students[0].age = 20;

        students[1].name = "Amit";
        students[1].age = 22;

        students[2].name = "Neha";
        students[2].age = 19;

        for(Student student : students){

            System.out.println(student.name + " " + student.age);

        }

    }

}
```

---

# Why Use an Array of Objects?

Without an array

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
```

Imagine creating **1000 students**.

Very difficult.

With an array

```java
Student[] students = new Student[1000];
```

Everything is organized.

---

# Advantages of Arrays

### 1. Store Multiple Values

```java
int[] numbers = {10,20,30,40};
```

Only one variable.

---

### 2. Fast Access

Access any element using its index.

```java
numbers[3];
```

Very fast.

---

### 3. Less Code

Instead of creating hundreds of variables.

---

### 4. Easy Looping

```java
for(int num : numbers){

}
```

---

### 5. Memory is Continuous

Arrays store elements in contiguous memory, making index-based access efficient.

---

# Drawbacks (Limitations) of Arrays

---

## 1. Fixed Size

```java
int[] numbers = new int[5];
```

Later you cannot make it

```java
new int[10]
```

You must create another array.

---

## 2. Same Data Type

Allowed

```java
int[] numbers = {10,20,30};
```

Not allowed

```java
10
"Amit"
true
```

All elements must be the same type.

---

## 3. Insertion is Expensive

Suppose

```text
10 20 30 40
```

Insert 15

```text
10 15 20 30 40
```

Everything after 10 must shift one position to the right.

---

## 4. Deletion is Expensive

Delete

```text
20
```

Then

```text
30
40
```

must move left.

---

## 5. Memory Can Be Wasted

Suppose

```java
new int[100]
```

You only use

```text
10 elements
```

The remaining 90 positions are unused.

---

# Arrays vs ArrayList

| Feature                    | Array           | ArrayList                                |
| -------------------------- | --------------- | ---------------------------------------- |
| Size                       | Fixed           | Dynamic                                  |
| Stores Objects             | Yes             | Yes                                      |
| Stores Primitives Directly | Yes             | No (uses wrapper classes like `Integer`) |
| Fast Index Access          | Yes             | Yes                                      |
| Insert/Delete              | Slow            | Easier than arrays                       |
| Package                    | Built into Java | `java.util`                              |

---

# Arrays vs LinkedList

| Feature           | Array | LinkedList                         |
| ----------------- | ----- | ---------------------------------- |
| Memory            | Less  | More                               |
| Access by Index   | Fast  | Slow                               |
| Insert/Delete     | Slow  | Fast (after reaching the position) |
| Contiguous Memory | Yes   | No                                 |

---

# Real-World Examples

### Student Marks

```java
int[] marks;
```

---

### Temperature of 7 Days

```java
double[] temperature;
```

---

### Product List

```java
Product[] products;
```

---

### Employee Records

```java
Employee[] employees;
```

---

### Library

```java
Book[] books;
```

---

# Interview Questions

## Q1. What is an Array?

A fixed-size collection of elements of the same data type stored together.

---

## Q2. Why Does an Array Start from Index 0?

The first element is stored at the base memory address, so its offset is 0. Using zero-based indexing makes address calculation efficient.

---

## Q3. Why Can't Array Size Change?

Because Java allocates a fixed block of memory when the array is created. Changing its size would require a new block of memory.

---

## Q4. Difference Between Array and ArrayList?

* Array → Fixed size
* ArrayList → Dynamic size

---

## Q5. Can Arrays Store Objects?

Yes.

Example

```java
Student[] students;
```

---

## Q6. Can Arrays Store Different Data Types?

No.

All elements must have the same data type.

---

## Q7. Where is an Array Stored?

* Reference variable → Stack Memory
* Actual array object → Heap Memory

---

# Best Practices

✅ Use `array.length` instead of hard-coded numbers.

```java
for(int i = 0; i < array.length; i++) {

}
```

---

✅ Use meaningful names.

Good

```java
studentMarks
```

Bad

```java
a
```

---

✅ Check the index before accessing an element if it comes from user input.

---

✅ Use enhanced `for` loops when you only need to read values.

---

# Complete Learning Journey

```
Part 1
│
├── What is an Array?
├── Why Arrays?
├── Declaration
├── Initialization
├── Index
└── Fixed Size

        ↓

Part 2
│
├── Stack & Heap Memory
├── Reference Variables
├── length
├── for Loop
├── for-each Loop
├── Scanner
└── Common Exceptions

        ↓

Part 3
│
├── 2D Array
├── 3D Array
├── Jagged Array
├── Passing Arrays
├── Returning Arrays
├── Copying Arrays
└── Arrays Utility Methods

        ↓

Part 4
│
├── Array of Objects
├── Advantages
├── Drawbacks
├── Arrays vs ArrayList
├── Arrays vs LinkedList
├── Interview Questions
└── Best Practices
```

# 🎉 Congratulations!

You now have a solid understanding of Java arrays—from basic concepts to advanced topics like multidimensional arrays and arrays of objects.

## Suggested Next Topic

The most natural next step is **Java Strings**, because you'll frequently use arrays and strings together. A beginner-friendly sequence would be:

1. What is a String?
2. String Pool and Memory
3. String methods
4. `String` vs `StringBuilder` vs `StringBuffer`
5. Common String interview questions
6. Programs using Strings and Arrays together

This progression will build directly on what you've learned about arrays.
