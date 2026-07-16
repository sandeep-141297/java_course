## Part 1 

**Java Arrays - Basics**

* What is an array?
* Why do we need arrays?
* Real-life example
* Syntax
* Declaration
* Creation
* Initialization
* Shortcut initialization
* Index starts from 0
* Fixed size (why size cannot change)
* Default values
* Types of arrays (only introduction: 1D, 2D, Multi-dimensional)

---

# Part 2 

## Java Arrays - Memory & Basic Operations

### 1. How an array is stored in memory

* Stack
* Heap
* Reference variable
* Memory diagram

### 2. Array indexing (recap)

### 3. `length` property

```java
numbers.length
```

### 4. Reading array elements

```java
System.out.println(numbers[2]);
```

### 5. Updating elements

```java
numbers[2] = 100;
```

### 6. Traversing an array using `for` loop

### 7. Traversing using enhanced `for-each` loop

### 8. Taking array input from the user (`Scanner`)

### 9. Common mistakes

* ArrayIndexOutOfBoundsException
* NegativeArraySizeException
* NullPointerException (array reference is `null`)

### 10. Practice examples

---

# Part 3

## Java Arrays - Advanced Arrays

### 1. Two-Dimensional (2D) Array

### 2. Multi-Dimensional Array

### 3. Three-Dimensional (3D) Array

### 4. Jagged Array (Array of Arrays)

### 5. Passing arrays to methods

### 6. Returning arrays from methods

### 7. Array copying

* Manual copy
* `clone()`
* `System.arraycopy()`
* `Arrays.copyOf()`

### 8. Useful methods from `Arrays` class

* `sort()`
* `fill()`
* `equals()`
* `binarySearch()`
* `toString()`

---

# Part 4

## Java Arrays - Interview & Real-World Concepts

### 1. Array of Objects ⭐

Example:

```java
Student[] students = new Student[5];
```

This deserves its own section because many beginners first need to understand **objects** before they can understand **an array of objects**.

### 2. Advantages of Arrays

### 3. Drawbacks (Limitations) of Arrays

* Fixed size
* Same data type only
* Insertion/deletion is expensive
* Memory may be wasted
* No built-in resizing

### 4. Arrays vs ArrayList

### 5. Arrays vs LinkedList

### 6. Interview Questions

### 7. Best Practices

### 8. Real-world examples

---

## Why keep "Array of Objects" in Part 4?

Because it depends on understanding **classes and objects** first.

For example:

```java
Student s1 = new Student();
```

Only after learning that does this make sense:

```java
Student[] students = new Student[5];
```

If you haven't learned objects yet, this topic can be confusing. That's why placing it in **Part 4** is a natural progression.

### Recommended learning order

1. **Part 1:** Basics of arrays
2. **Part 2:** Memory, loops, input, exceptions, and basic operations
3. **Part 3:** Advanced array concepts (2D, 3D, jagged arrays, copying, utility methods)
4. **Part 4:** Arrays in real-world Java (array of objects, advantages, limitations, comparisons, interview questions)

This sequence builds knowledge gradually and avoids introducing object-oriented concepts before the fundamentals are clear.
