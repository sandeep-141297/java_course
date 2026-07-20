# Find 5 largest number from multi-dimension array
Imagine you are the **JVM** executing the code one line at a time.

Sure! I'll explain it in the simplest possible way, as if you're learning nested loops for the first time.

---

# Our Array

```java
int[][] arr = {
    {10, 50, 20},
    {70, 40, 90}
};
```

It looks like this:

```
        Column
          0    1    2
Row 0    10   50   20
Row 1    70   40   90
```

There are **6 numbers**.

Our goal is:

> **Find only the 5 largest numbers.**

---

# Code

```java
for (int count = 1; count <= 5; count++) {

    int max = arr[0][0];
    int row = 0;
    int col = 0;

    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j < arr[i].length; j++) {

            if (arr[i][j] > max) {
                max = arr[i][j];
                row = i;
                col = j;
            }

        }

    }

    System.out.println(max);

    arr[row][col] = -1;
}
```

---

# STEP 1

```java
for (int count = 1; count <= 5; count++)
```

### Meaning

We need **5 greatest numbers**.

So run the same process **5 times**.

```
Pass 1 → Find largest
Pass 2 → Find next largest
Pass 3 → Find next largest
Pass 4 → Find next largest
Pass 5 → Find next largest
```

---

# PASS 1

### First line

```java
int max = arr[0][0];
```

The computer doesn't know which number is the largest.

So it says:

> "I'll assume the **first number (10)** is the largest."

```
max = 10
```

---

### Next

```java
int row = 0;
int col = 0;
```

This means

> "Right now my largest number is at Row 0, Column 0."

```
row = 0
col = 0
```

---

# Start checking every number

Outer loop

```java
for (int i = 0; i < arr.length; i++)
```

means

```
Visit Row 0
Visit Row 1
```

---

Inner loop

```java
for (int j = 0; j < arr[i].length; j++)
```

means

```
Visit every column in that row.
```

---

## First Check

```
i = 0
j = 0
```

Current number

```
10
```

Check

```
10 > 10 ?
```

Answer

```
No
```

So

```
max = 10
```

No change.

---

## Second Check

```
i = 0
j = 1
```

Current number

```
50
```

Check

```
50 > 10 ?
```

Yes

Update

```
max = 50
row = 0
col = 1
```

Computer says

> "I found a bigger number."

---

## Third Check

Current number

```
20
```

Check

```
20 > 50 ?
```

No

Nothing changes.

---

## Fourth Check

Move to Row 1

Current number

```
70
```

Check

```
70 > 50 ?
```

Yes

Update

```
max = 70
row = 1
col = 0
```

---

## Fifth Check

Current number

```
40
```

Check

```
40 > 70 ?
```

No

---

## Sixth Check

Current number

```
90
```

Check

```
90 > 70 ?
```

Yes

Update

```
max = 90
row = 1
col = 2
```

Now every number has been checked.

Largest number is

```
90
```

---

Print

```java
System.out.println(max);
```

Output

```
90
```

---

Now remove it

```java
arr[row][col] = -1;
```

means

```
arr[1][2] = -1;
```

Array becomes

```
10  50  20
70  40  -1
```

Why replace with `-1`?

Because next time we don't want to find **90** again.

---

# PASS 2

Again

```java
max = arr[0][0];
```

means

```
max = 10
```

Notice something important:

The program **does not remember** the old `max` value (90). Every new pass starts fresh by assuming the first element is the current maximum.

Now check every number again.

```
10 > 10 ❌

50 > 10 ✅
max = 50

20 > 50 ❌

70 > 50 ✅
max = 70

40 > 70 ❌

-1 > 70 ❌
```

Largest is

```
70
```

Print

```
70
```

Replace

```
10 50 20
-1 40 -1
```

---

# PASS 3

Again

```
max = 10
```

Check

```
10 >10 ❌

50 >10 ✅
max =50

20 >50 ❌

-1 >50 ❌

40 >50 ❌

-1 >50 ❌
```

Print

```
50
```

Replace

```
10 -1 20
-1 40 -1
```

---

# PASS 4

Again

```
max =10
```

Check

```
10 >10 ❌

-1 >10 ❌

20 >10 ✅
max =20

-1 >20 ❌

40 >20 ✅
max =40

-1 >40 ❌
```

Print

```
40
```

Replace

```
10 -1 20
-1 -1 -1
```

---

# PASS 5

Again

```
max =10
```

Check

```
10 >10 ❌

-1 >10 ❌

20 >10 ✅
max =20

-1 >20 ❌

-1 >20 ❌

-1 >20 ❌
```

Print

```
20
```

Replace

```
10 -1 -1
-1 -1 -1
```

---

# Final Output

```
90
70
50
40
20
```

---

# Why is `10` not printed?

The array has **6 numbers**:

```
10
20
40
50
70
90
```

Sorted from largest to smallest:

```
90
70
50
40
20
10
```

You asked for the **top 5**, so the program prints:

```
90
70
50
40
20
```

The number `10` is the **6th largest**, so it is left in the array.

---

## One sentence summary

* Start by assuming the **first element** is the largest.
* Check **every element** in the array.
* If you find a larger value, update `max`, `row`, and `col`.
* After checking all elements, print the largest value.
* Replace that value with `-1` so it won't be selected again.
* Repeat the same process **5 times** to get the top 5 largest numbers.



# Complete Dry Run Table

|    Step |  i |  j | arr[i][j] | Current max (Before) | Comparison        | Current max (After) | row | col |
| ------: | -: | -: | --------: | -------------------: | ----------------- | ------------------: | --: | --: |
| Initial |  - |  - |         - |               **10** | `max = arr[0][0]` |              **10** |   0 |   0 |
|       1 |  0 |  0 |        10 |                   10 | `10 > 10` ❌      |                  10 |   0 |   0 |
|       2 |  0 |  1 |        50 |                   10 | `50 > 10` ✅      |                  50 |   0 |   1 |
|       3 |  0 |  2 |        20 |                   50 | `20 > 50` ❌      |                  50 |   0 |   1 |
|       4 |  1 |  0 |        70 |                   50 | `70 > 50` ✅      |                  70 |   1 |   0 |
|       5 |  1 |  1 |        40 |                   70 | `40 > 70` ❌      |                  70 |   1 |   0 |
|       6 |  1 |  2 |        90 |                   70 | `90 > 70` ✅      |              **90** |   1 |   2 |

---

This is **Pass 1** only.

**Pass 2**, **Pass 3**, **Pass 4**, and **Pass 5** repeat exactly the same process, except that the previously found largest value has been replaced with `-1`.

For beginners, I recommend mastering **Pass 1** first. Once Pass 1 makes sense, the remaining passes are simply repetitions of the same logic on the updated array.
