# What is Method Overloading in Java?

**Method Overloading** means:

> **Creating multiple methods with the same name but different parameter lists in the same class.**

The parameters must differ by:

* Number of parameters ✅
* Type of parameters ✅
* Order of parameters ✅

---

# Easy Definition

Think of your mobile phone.

There is one **Camera** app.

But it works in different ways:

```text
Camera()

Camera(Portrait)

Camera(Night Mode)

Camera(48MP)
```

Same app name (**Camera**).

Different options.

Similarly in Java:

```java
add(10, 20);

add(10, 20, 30);

add(10.5, 20);
```

Same method name:

```java
add()
```

Different parameters.

This is **Method Overloading**.

---

# Example

```java
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }
}
```

All methods are named:

```text
add()
```

But each has different parameters.

---

# Calling Methods

```java
Calculator calc = new Calculator();

System.out.println(calc.add(10, 20));

System.out.println(calc.add(10, 20, 30));

System.out.println(calc.add(10.5, 20));
```

Output

```text
30
60
30.5
```

Java automatically chooses the correct method based on the arguments.

---

# How Java Chooses the Method

```text
calc.add(10,20)

        │
        ▼

Looks for

add(int,int)

        │
        ▼

Found

        │
        ▼

Execute
```

---

# Rules of Method Overloading

### 1. Different Number of Parameters ✅

```java
void print() { }

void print(String name) { }

void print(String name, int age) { }
```

---

### 2. Different Data Types ✅

```java
void show(int a) { }

void show(double a) { }

void show(String a) { }
```

---

### 3. Different Order of Parameters ✅

```java
void display(int age, String name) { }

void display(String name, int age) { }
```

These are different because the parameter order is different.

---

# Not Allowed

Changing **only the return type** is **not** overloading.

```java
int add(int a, int b) {
    return a + b;
}

double add(int a, int b) {   // ❌ Compile-time error
    return a + b;
}
```

Both methods have the same parameter list, so Java cannot distinguish between them.

---

# Why Do We Need Method Overloading?

Without overloading:

```java
addTwoNumbers();

addThreeNumbers();

addDoubleNumbers();
```

Many different method names.

With overloading:

```java
add(10, 20);

add(10, 20, 30);

add(10.5, 20);
```

One meaningful method name handles multiple situations.

---

# Real-Life Example

Imagine a person named Rahul.

```text
Rahul

↓

Can Walk

Can Walk Fast

Can Walk With Bag
```

Same action:

```text
Walk
```

Different ways of doing it.

Similarly:

```java
walk();

walk(int speed);

walk(int speed, String bag);
```

---

# Interview Definition

**Method Overloading** is an OOP feature in Java where multiple methods in the same class have the **same name** but **different parameter lists** (different number, type, or order of parameters). Java resolves which method to call at **compile time**, so method overloading is also called **compile-time polymorphism**.

---

# Summary

| Feature                        | Method Overloading |
| ------------------------------ | ------------------ |
| Same method name               | ✅                  |
| Same class                     | ✅                  |
| Different number of parameters | ✅                  |
| Different parameter types      | ✅                  |
| Different parameter order      | ✅                  |
| Different return type only     | ❌ Not allowed      |
| Decided at                     | Compile Time       |

### Easy Formula

```text
Same Method Name
        +
Different Parameters
        =
Method Overloading
```

**Example:**

```java
add(10, 20);

add(10, 20, 30);

add(10.5, 20);
```

All are named `add()`, but Java calls a different method based on the arguments you provide.

---
---

This is called **Method Overloading**. Java decides **which `add()` method to call based on the number and type of arguments** you pass.

Let's understand it step by step.

---

# Your Class

```java
class Calculator {

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, int b) {
        return a + b;
    }
}
```

There are **3 methods with the same name**:

| Method               | Parameters             |
| -------------------- | ---------------------- |
| `add(int, int, int)` | 3 integers             |
| `add(int, int)`      | 2 integers             |
| `add(double, int)`   | 1 double and 1 integer |

This is **Method Overloading**.

---

# Now see your `main()`

```java
Calculator calc = new Calculator();

int sum = calc.add(5, 10);
```

### Step 1

Java sees:

```java
calc.add(5, 10);
```

The arguments are:

```text
5  → int
10 → int
```

So Java starts looking for a matching method.

---

### Method 1

```java
add(int a, int b, int c)
```

Needs **3 arguments**.

You gave **2 arguments**.

❌ Not selected.

---

### Method 2

```java
add(int a, int b)
```

Needs:

```text
int
int
```

You passed:

```text
int
int
```

✅ Perfect match.

Java calls this method.

---

### Method 3

```java
add(double a, int b)
```

Needs:

```text
double
int
```

You passed:

```text
int
int
```

Java **could** convert `5` from `int` to `double`, but it doesn't need to because it already found an **exact match** (`add(int, int)`).

So Java chooses:

```java
public int add(int a, int b) {
    return a + b;
}
```

---

# Execution

```java
calc.add(5,10);
```

becomes

```java
return 5 + 10;
```

returns

```text
15
```

So

```java
int sum = 15;
```

Output

```text
Sum: 15
```

---

# How Java Chooses the Method

Java follows this order:

### 1. Exact match ✅

```java
calc.add(5, 10);
```

Matches

```java
add(int, int)
```

---

### 2. If no exact match, look for automatic conversion (widening)

Example:

```java
calc.add(5.5, 10);
```

Arguments:

```text
double
int
```

Java chooses

```java
add(double, int)
```

Output:

```text
15.5
```

---

### 3. Three arguments

```java
calc.add(5, 10, 20);
```

Java chooses

```java
add(int, int, int)
```

Output

```text
35
```

---

# Visual Flow

```text
calc.add(5,10)

        │
        ▼

Arguments

int
int

        │
        ▼

Check Methods

add(int,int,int) ❌

add(int,int)     ✅

add(double,int)  (Not needed)

        │
        ▼

Call

add(int,int)

        │
        ▼

return 15
```

---

# Another Example

```java
calc.add(5.5, 10);
```

Java checks

```text
double
int
```

Methods

```text
add(int,int,int) ❌

add(int,int) ❌

add(double,int) ✅
```

Calls

```java
public double add(double a, int b)
```

Returns

```text
15.5
```

---

# Another Example

```java
calc.add(2,3,4);
```

Arguments

```text
int
int
int
```

Java checks

```text
add(int,int,int) ✅
```

Returns

```text
9
```

---

# Important Rule

Java **does not look at the return type** to decide which overloaded method to call.

It only looks at:

* ✅ Number of parameters
* ✅ Data types of parameters
* ✅ Order of parameters

For example, this is **not allowed**:

```java
int add(int a, int b) { ... }

double add(int a, int b) { ... } // ❌ Compile-time error
```

Both methods have the same parameter list, so Java cannot distinguish between them based on the return type alone.

---

## Interview Answer

**Q: How does Java decide which overloaded method to call?**

**Answer:**
At **compile time**, Java matches the method call with the method signature (method name + parameter types and count). It selects the **best matching** method. The return type is **not** considered during overload resolution.



---

## Error Explain

❌ It will **not work**.

If you have only this method:

```java
public int add(int a, int b, int c) {
    return a + b + c;
}
```

and you call:

```java
add(10, 20);
```


you will get a **compile-time error**.

### Why?

Your method expects **3 arguments**:

```text
add(int, int, int)
```

But you passed only **2 arguments**:

```text
add(10, 20)
      ↑   ↑
     2 arguments
```

Java cannot guess the third value.

---

## Compiler Error

You'll see an error similar to:

```text
method add in class Calculator cannot be applied to given types;
required: int,int,int
found:    int,int
reason: actual and formal argument lists differ in length
```

---

## Correct Call

Pass all 3 arguments:

```java
Calculator calc = new Calculator();

System.out.println(calc.add(10, 20, 30));
```

Output:

```text
60
```

---

## If You Want Both 2 and 3 Arguments

Use **method overloading**:

```java
class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

Now both calls work:

```java
calc.add(10, 20);      // Calls add(int, int)

calc.add(10, 20, 30);  // Calls add(int, int, int)
```

---

## If You Want Any Number of Integers

Use **varargs**:

```java
class Calculator {

    public int add(int... numbers) {

        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        return sum;
    }
}
```

Now all of these work:

```java
calc.add(10, 20);

calc.add(10, 20, 30);

calc.add(10, 20, 30, 40);

calc.add(10, 20, 30, 40, 50);
```

### Rule to Remember

* `add(int a, int b)` → **Exactly 2 arguments**
* `add(int a, int b, int c)` → **Exactly 3 arguments**
* `add(int... numbers)` → **0 or more integer arguments**

