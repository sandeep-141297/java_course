# Drawback - Array Deletion/Shift Process

This is exactly how interviewers expect you to explain **deletion in an array**.

```java
int fixedSizeArr[] = new int[5]; // Declare an array of size 5
fixedSizeArr[0] = 10;
fixedSizeArr[1] = 20;
fixedSizeArr[2] = 30;
fixedSizeArr[3] = 40;
fixedSizeArr[4] = 50;

// deletion in the middle of the array
int indexToDelete = 3; // Index of the element to be deleted
// Shift elements to the left
for (int i = indexToDelete; i < fixedSizeArr.length - 1; i++) {
    System.out.println("Shifting element at index " + (i + 1) + " to index " + i);
    System.out.println(fixedSizeArr[i]);
    fixedSizeArr[i] = fixedSizeArr[i + 1];
    System.out.println(fixedSizeArr[i]);
}
System.out.println("Fixed size array after deletion: " + fixedSizeArr[3]);

fixedSizeArr[fixedSizeArr.length - 1] = 0;

```

Let's go **line by line** just like we did for insertion.

---

# Initial Array

Suppose our array is

```text
Index

 0    1    2    3    4
+----+----+----+----+----+
|10  |20  |25  |30  |40  |
+----+----+----+----+----+
```

Length = **5**

---

# We Want to Delete

```java
int indexToDelete = 3;
```

Meaning

Delete the element at **index 3**.

```text
10 20 25 30 40
         ↑
      Delete 30
```

Desired result logically:

```text
10 20 25 40
```

But remember...

**Arrays cannot shrink.**

We'll understand why later.

---

# Why Do We Shift?

If we simply do

```java
fixedSizeArr[3] = 0;
```

Result

```text
10 20 25 0 40
```

Oops!

40 is still at index 4.

The array has a gap.

Instead, we move every element after the deleted element one position left.

---

# The Loop

```java
for (int i = indexToDelete; i < fixedSizeArr.length - 1; i++)
```

Let's understand every part.

---

## indexToDelete

```text
3
```

So

```java
i = 3;
```

---

## fixedSizeArr.length

```text
5
```

---

## fixedSizeArr.length - 1

```text
4
```

Condition

```java
i < 4
```

So values of i are

```text
i = 3

Stop
```

Only one iteration.

Why?

Because after index 3, only one element (40) exists.

---

# First Iteration

```text
i = 3
```

Current array

```text
10 20 25 30 40
```

---

## Line

```java
System.out.println("Shifting element at index "
        + (i + 1) + " to index " + i);
```

Substitute

```text
Shifting element at index 4 to index 3
```

Meaning

Move value from

```text
index 4
```

to

```text
index 3
```

---

## Line

```java
System.out.println(fixedSizeArr[i]);
```

Prints

```text
30
```

Current value before shifting.

---

## Line

```java
fixedSizeArr[i] = fixedSizeArr[i + 1];
```

Substitute

```java
fixedSizeArr[3] = fixedSizeArr[4];
```

Means

```text
30 ← 40
```

Array becomes

```text
10 20 25 40 40
```

Notice

40 now exists twice.

That's okay for now.

---

## Line

```java
System.out.println(fixedSizeArr[i]);
```

Prints

```text
40
```

because index 3 now contains 40.

---

# Loop Ends

Current array

```text
Index

0   1   2   3   4

10 20 25 40 40
```

Notice something?

The last value is duplicated.

This is normal.

---

# Why Didn't the Array Become Smaller?

Many beginners expect this:

```text
10 20 25 40
```

Length = 4

But Java does **NOT** do this.

The array is still

```text
Length = 5
```

Memory

```text
Index

0   1   2   3   4

10 20 25 40 40
```

---

# Why Can't Java Reduce the Array Size?

Suppose you created

```java
int[] arr = new int[5];
```

Java reserved memory like this

```text
+----+----+----+----+----+
|    |    |    |    |    |
+----+----+----+----+----+
```

Exactly **5 boxes**.

These boxes are fixed.

Java cannot remove one box from the middle.

Memory cannot suddenly become

```text
+----+----+----+----+
```

because the array object was created with **5 elements**.

The only solution is:

Create a **new array**.

---

# Real Deletion

If you truly want size 4

Create another array.

```java
int[] newArray = new int[4];
```

Copy values.

```text
Old

10 20 25 40 40

↓

New

10 20 25 40
```

Now the size becomes 4.

---

# One More Thing

After shifting, many programmers set the last element to its default value because it is no longer logically used.

```java
fixedSizeArr[fixedSizeArr.length - 1] = 0;
```

Now the array looks like:

```text
Index

0   1   2   3   4

10 20 25 40 0
```

This **does not reduce the size**. It simply clears the last position to avoid having a duplicate value.

---

# Complete Execution Table

| Step    | i | Operation                 | Array            |
| ------- | - | ------------------------- | ---------------- |
| Initial | - | Original array            | `10 20 25 30 40` |
| 1       | 3 | `arr[3] = arr[4]`         | `10 20 25 40 40` |
| 2       | - | *(Optional)* `arr[4] = 0` | `10 20 25 40 0`  |

---

## ⭐ Interview Tip

There are **two different concepts** that people often confuse:

1. **Deleting an element** (logical deletion): Shift elements left. The array size stays the same because arrays are fixed-size.
2. **Reducing the array size** (physical deletion): Impossible with the same array. You must create a **new, smaller array** and copy the remaining elements into it.

This distinction is very important in Java interviews.


---

# Delete Flow Method

There are actually **two different meanings of "delete"** in arrays:

1. **Logical delete** → Shift elements left (same array, same size).
2. **Physical delete** → Create a **new smaller array** and copy elements (size becomes smaller).

Let's learn both.

---

# Original Array

```java
int[] arr = {10, 20, 30, 40, 50};
```

Memory

```text
Index

0   1   2   3   4

10 20 30 40 50
```

Suppose we want to delete **30** (index 2).

---

# Method 1: Logical Delete (Most Common)

## Step 1: Shift Left

```java
int indexToDelete = 2;

for (int i = indexToDelete; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}
```

### Step-by-step

### First Iteration

```
i = 2

arr[2] = arr[3]

30 ← 40
```

Array

```
10 20 40 40 50
```

---

### Second Iteration

```
i = 3

arr[3] = arr[4]

40 ← 50
```

Array

```
10 20 40 50 50
```

---

### Loop Ends

```
10 20 40 50 50
```

Notice

Last value is duplicated.

---

### Optional

```java
arr[arr.length - 1] = 0;
```

Result

```
10 20 40 50 0
```

Size is still

```
5
```

---

# Method 2: Physical Delete (Create New Array)

Suppose we actually want

```
10 20 40 50
```

Length = **4**

---

## Step 1

Create a smaller array.

```java
int[] newArr = new int[arr.length - 1];
```

Memory

```
Old

10 20 30 40 50

New

0 0 0 0
```

---

## Step 2

Copy every element except the deleted one.

```java
int indexToDelete = 2;
int j = 0;

for (int i = 0; i < arr.length; i++) {

    if (i != indexToDelete) {

        newArr[j] = arr[i];
        j++;

    }

}
```

---

## Let's Understand Line by Line

### Initially

```
i = 0
j = 0
```

Old

```
10 20 30 40 50
```

New

```
0 0 0 0
```

---

### i = 0

```
0 != 2

Yes
```

Copy

```
newArr[0] = arr[0]

10
```

New

```
10 0 0 0
```

Increase

```
j = 1
```

---

### i = 1

Copy

```
20
```

New

```
10 20 0 0
```

```
j = 2
```

---

### i = 2

```
2 == 2

Don't copy
```

Skip

30 disappears.

---

### i = 3

Copy

```
40
```

New

```
10 20 40 0
```

```
j = 3
```

---

### i = 4

Copy

```
50
```

New

```
10 20 40 50
```

Finished.

---

# Final Result

Old

```
10 20 30 40 50
```

New

```
10 20 40 50
```

Now size becomes

```
4
```

because it is a **new array**.

---

# Complete Program

```java
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int indexToDelete = 2;

        int[] newArr = new int[arr.length - 1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i != indexToDelete) {

                newArr[j] = arr[i];
                j++;

            }

        }

        System.out.println(Arrays.toString(newArr));

    }

}
```

Output

```
[10, 20, 40, 50]
```

---

# Why Do We Need `j`?

Many beginners ask this.

`i` is for reading from the old array.

`j` is for writing into the new array.

Example

| i | arr[i] | Copy? | j | newArr      |
| - | ------ | ----- | - | ----------- |
| 0 | 10     | Yes   | 0 | 10 _ _ _    |
| 1 | 20     | Yes   | 1 | 10 20 _ _   |
| 2 | 30     | No    | 2 | 10 20 _ _   |
| 3 | 40     | Yes   | 2 | 10 20 40 _  |
| 4 | 50     | Yes   | 3 | 10 20 40 50 |

Notice that when `i = 2` (the deleted element), **`j` does not increase**, because nothing is copied.

---

# Summary

| Method                      | Size Changes? | Same Array? |
| --------------------------- | ------------- | ----------- |
| Shift Left (Logical Delete) | ❌ No          | ✅ Yes       |
| Create New Array + Copy     | ✅ Yes         | ❌ No        |

### Interview Tip

If an interviewer asks, **"Can you delete an element from an array?"**, a good answer is:

> "You cannot physically remove an element or reduce the size of an existing array because arrays are fixed-size. You can either perform a logical deletion by shifting elements to the left, or create a new smaller array and copy all elements except the one to be deleted."

