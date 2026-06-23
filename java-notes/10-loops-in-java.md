# Java Loops - Easy Notes (Beginner Friendly)

## What is a Loop?

A **loop** is used to execute a block of code **repeatedly** until a condition becomes false.

### Without Loop

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

### With Loop

```java
for(int i = 1; i <= 5; i++) {
    System.out.println("Hello");
}
```

Output:

```
Hello
Hello
Hello
Hello
Hello
```

---

# Why Do We Need Loops?

Imagine you want to:

* Print numbers 1 to 100
* Read 100 records from database
* Process 1000 files
* Calculate marks for 50 students

Without loops, you would write the same code many times.

Loops:

* Save time
* Reduce code length
* Make code reusable
* Improve readability

---

# Types of Loops in Java

There are mainly 4 loops:

1. `for` Loop
2. `while` Loop
3. `do-while` Loop
4. Enhanced `for-each` Loop

---

# 1. for Loop

Used when you know how many times the loop should run.

### Syntax

```java
for(initialization; condition; increment/decrement) {
    // code
}
```

### Example

```java
for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Output:

```
1
2
3
4
5
```

---

## How it Works

```java
for(int i = 1; i <= 5; i++)
```

### Step 1

```java
int i = 1;
```

### Step 2

Check:

```java
i <= 5
```

True → Execute code

### Step 3

Increment:

```java
i++
```

Continue until condition becomes false.

---

# for Loop Flow

```text
Start
  |
Initialization
  |
Condition ?
  |
True
  |
Execute Code
  |
Increment
  |
Condition Again
  |
False
  |
Stop
```

---

# 2. while Loop

Used when the number of iterations is unknown.

### Syntax

```java
while(condition) {
    // code
}
```

### Example

```java
int i = 1;

while(i <= 5) {
    System.out.println(i);
    i++;
}
```

Output:

```
1
2
3
4
5
```

---

## while Loop Flow

```text
Start
  |
Condition
  |
True
  |
Execute Code
  |
Update Variable
  |
Condition Again
  |
False
  |
Stop
```

---

# 3. do-while Loop

Special loop that executes at least one time.

### Syntax

```java
do {
    // code
} while(condition);
```

### Example

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while(i <= 5);
```

Output:

```
1
2
3
4
5
```

---

## Difference Between while and do-while

### while

```java
int i = 10;

while(i < 5) {
    System.out.println(i);
}
```

Output:

```
Nothing
```

---

### do-while

```java
int i = 10;

do {
    System.out.println(i);
} while(i < 5);
```

Output:

```
10
```

Reason:
`do-while` executes first and checks condition later.

---

# 4. Enhanced for Loop (for-each)

Used with arrays and collections.

### Syntax

```java
for(dataType variable : collection) {
    // code
}
```

### Example

```java
int numbers[] = {10,20,30,40};

for(int num : numbers) {
    System.out.println(num);
}
```

Output:

```
10
20
30
40
```

---

# Nested Loop

A loop inside another loop is called a **Nested Loop**.

### Syntax

```java
for(...) {
    for(...) {
        // code
    }
}
```

---

# Example 1: Print Rectangle

```java
for(int row = 1; row <= 3; row++) {

    for(int col = 1; col <= 5; col++) {
        System.out.print("* ");
    }

    System.out.println();
}
```

Output:

```
* * * * *
* * * * *
* * * * *
```

---

## Understanding

### Outer Loop

Controls rows

```java
for(int row=1; row<=3; row++)
```

Runs 3 times.

---

### Inner Loop

Controls columns

```java
for(int col=1; col<=5; col++)
```

Runs 5 times for each row.

---

# Example 2: Multiplication Table

```java
for(int i = 1; i <= 3; i++) {

    for(int j = 1; j <= 10; j++) {

        System.out.println(i + " x " + j +
                           " = " + (i*j));
    }

    System.out.println();
}
```

Output:

```
1 x 1 = 1
1 x 2 = 2
...

2 x 1 = 2
2 x 2 = 4
...

3 x 1 = 3
...
```

---

# Example 3: Number Pattern

```java
for(int i = 1; i <= 5; i++) {

    for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }

    System.out.println();
}
```

Output:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

---

# Infinite Loop

A loop that never ends.

### Example

```java
while(true) {
    System.out.println("Running...");
}
```

OR

```java
for(;;) {
    System.out.println("Running...");
}
```

⚠️ Use carefully.

---

# break Statement

Used to exit the loop immediately.

```java
for(int i = 1; i <= 10; i++) {

    if(i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```
1
2
3
4
```

---

# continue Statement

Skips current iteration.

```java
for(int i = 1; i <= 5; i++) {

    if(i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```
1
2
4
5
```

---

# Which Loop Should I Use?

| Situation                    | Best Loop |
| ---------------------------- | --------- |
| Known number of iterations   | for       |
| Unknown number of iterations | while     |
| Must execute at least once   | do-while  |
| Arrays/Collections           | for-each  |

---

# Interview Questions

### Q1: Difference between while and do-while?

| while                   | do-while                 |
| ----------------------- | ------------------------ |
| Condition checked first | Code executes first      |
| May execute 0 times     | Executes at least 1 time |

---

### Q2: What is Nested Loop?

A loop inside another loop.

Example:

```java
for(int i=1;i<=3;i++) {
    for(int j=1;j<=3;j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

### Q3: Which loop is fastest?

There is usually **no significant difference** between `for`, `while`, and `do-while` in modern Java. Choose based on readability and requirement.

---

# Quick Revision

```text
Loop = Repeat code

for      -> Known iterations
while    -> Unknown iterations
do-while -> Run at least once
for-each -> Arrays/Collections

break    -> Exit loop
continue -> Skip current iteration

Nested Loop = Loop inside Loop
```

For DSA and Java interviews, focus most on:

1. `for` loop
2. Nested `for` loops
3. `break`
4. `continue`
5. Pattern printing using nested loops

These are asked very frequently in Java and DSA interviews.
