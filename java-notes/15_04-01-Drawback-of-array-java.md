# Drawback of using arrays in Java - which is correct or not in below points

### 1. Fixed size: Once an array is created, its size cannot be changed
### 2. Homogeneous: An array can only hold elements of the same data type
### 3. Memory consumption: If you create a large array but use only a few elements, the remaining memory is wasted.
### 4. No built-in methods: Arrays do not have built-in methods for common operations like searching, sorting, etc.
### 5. No bounds checking: Arrays do not perform bounds checking, which can lead to runtime errors if an invalid index is accessed


Your list is **partly correct**, but **points 4 and 5 need correction**. Let's go through each one.

---

## Drawbacks of Arrays in Java

### 1. Fixed Size ✅ (Correct)

Once an array is created, its size **cannot be changed**.

```java
int[] numbers = new int[5];
```

If later you need 10 elements, you cannot increase the size.

You must create a new array.

---

### 2. Homogeneous (Same Data Type Only) ✅ (Correct)

An array can store only **one data type**.

Correct:

```java
int[] numbers = {10, 20, 30};
```

Wrong:

```java
// Not allowed
// {10, "Hello", true}
```

---

### 3. Memory Wastage ✅ (Better wording)

Example:

```java
int[] numbers = new int[1000];
```

Suppose you use only:

```text
10 elements
```

The remaining **990 elements** still occupy memory.

---

### 4. No Built-in Methods ❌ (Incorrect)

This is **not a drawback** in Java.

Why?

Java provides the **`Arrays` utility class** in `java.util`.

Example:

```java
import java.util.Arrays;

int[] numbers = {30, 10, 20};

Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));
```

Output:

```text
[10, 20, 30]
```

Other useful methods include:

* `Arrays.sort()`
* `Arrays.binarySearch()`
* `Arrays.fill()`
* `Arrays.copyOf()`
* `Arrays.equals()`
* `Arrays.toString()`

So Java **does** provide built-in support for common array operations.

---

### 5. No Bounds Checking ❌ (Incorrect)

Java **does perform bounds checking**.

Example:

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[5]);
```

Output:

```text
Exception in thread "main"
ArrayIndexOutOfBoundsException
```

Java checks whether the index is valid.

If it's not, Java immediately throws an exception.

Some languages like C/C++ do not automatically check array bounds, but Java does.

---

# Important Drawbacks You Should Remember

These are the most common interview answers:

### 1. Fixed Size

Size cannot be changed after creation.

---

### 2. Same Data Type Only

Stores only one type of data.

---

### 3. Insertion is Slow

To insert a new element in the middle, existing elements must shift.

Example:

Before:

```text
10 20 30 40
```

Insert `15`:

```text
10 15 20 30 40
```

`20`, `30`, and `40` must move one position to the right.

---

### 4. Deletion is Slow

Deleting an element also requires shifting.

Before:

```text
10 20 30 40
```

Delete `20`:

```text
10 30 40
```

`30` and `40` must move left.

---

### 5. Memory Wastage

If you allocate a large array and don't use all its elements, memory is wasted.

---

## Final Interview Version

```java
// Drawbacks of Arrays in Java

// 1. Fixed size - cannot be resized after creation.

// 2. Can store only one data type (homogeneous).

// 3. Insertion in the middle is slow because elements need to be shifted.

// 4. Deletion is slow because remaining elements need to be shifted.

// 5. Memory may be wasted if the allocated array size is much larger than the number of elements used.
```

⭐ **Interview Tip:** If you're asked **"What are the disadvantages of arrays?"**, these **five points** are the standard and most commonly expected answers. They are more accurate than "no built-in methods" or "no bounds checking," which do **not** apply to Java.
