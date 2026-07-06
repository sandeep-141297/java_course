# Java Method Overloading vs Varargs (Easy Guide)

This guide explains **why Java uses Method Overloading** and **when to use Varargs (`...`)**.

---

# The Question

Suppose we have this class:

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

You might think:

> **"Why create three methods? Can't we create just one method and pass 2 or 3 values like other languages?"**

**Answer:**

**Yes, sometimes we can.** Java provides **Varargs** for that.

---

# Option 1 - Method Overloading

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

Call

```java
Calculator calc = new Calculator();

System.out.println(calc.add(10,20));

System.out.println(calc.add(10,20,30));
```

Output

```
30

60
```

---

# Option 2 - Varargs

Java provides **Varargs** (`...`).

Instead of writing many methods,

write only one.

```java
class Calculator {

    public int add(int... numbers) {

        int sum = 0;

        for(int n : numbers){

            sum += n;

        }

        return sum;

    }

}
```

Call

```java
Calculator calc = new Calculator();

System.out.println(calc.add(10,20));

System.out.println(calc.add(10,20,30));

System.out.println(calc.add(10,20,30,40));

System.out.println(calc.add(10,20,30,40,50));
```

Output

```
30

60

100

150
```

One method handles **any number of integers**.

---

# How Varargs Works Internally

When you write

```java
calc.add(10,20,30);
```

Java internally converts it to an array.

```java
add(new int[]{10,20,30});
```

Inside the method

```java
public int add(int... numbers)
```

is actually treated like

```java
public int add(int[] numbers)
```

So Java creates an array automatically.

---

# Memory Representation

Call

```java
calc.add(10,20,30);
```

Memory

```
Stack

numbers

↓

Heap

-----------------

10

20

30

-----------------
```

Java loops through the array.

---

# Why Not Always Use Varargs?

Varargs works only when **all values are the same type**.

Example

```java
calc.add(10,20,30);
```

Works

Because

```
int

int

int
```

Same datatype.

---

Now suppose you want

```java
calc.add(10.5,20);
```

Varargs

```java
int... numbers
```

cannot accept

```
double

int
```

Different datatype.

So Java needs another method.

```java
double add(double a,int b)
```

---

# Why Method Overloading?

Method Overloading is useful when

* Number of parameters changes.
* Datatype changes.
* Order of parameters changes.
* Logic changes.

Example

```java
add(int,int)

add(double,int)

add(String,String)
```

Different parameter types.

Different behavior.

---

# Real-Life Example

Imagine a Restaurant.

Customer orders

```
Tea
```

↓

One cup

Another customer

```
Tea

+

Snacks
```

↓

Different order

Another customer

```
Tea

+

Snacks

+

Coffee
```

Restaurant provides different combinations.

Same counter.

Different orders.

Method Overloading works like that.

---

# Another Real-Life Example

Think about a Mobile Camera.

```
Camera()

Camera(Portrait)

Camera(Night)

Camera(48MP)
```

Same camera.

Different options.

Java

```
add()

add(int,int)

add(int,int,int)

add(double,int)
```

---

# When Should You Use Varargs?

Use Varargs when

* Same datatype
* Unknown number of values

Example

```java
public int sum(int... numbers)
```

Call

```java
sum(1,2);

sum(1,2,3);

sum(1,2,3,4,5);
```

Very useful.

---

# When Should You Use Method Overloading?

Use Method Overloading when

* Datatypes are different.
* Logic is different.
* Parameters are different.

Example

```java
add(int,int)

add(double,double)

add(String,String)
```

---

# Can We Use Both?

Yes.

```java
class Calculator{

    int add(int a,int b){

        return a+b;

    }

    int add(int... numbers){

        int sum=0;

        for(int n:numbers)

            sum+=n;

        return sum;

    }

}
```

Java first looks for an exact match.

If not found,

it can use the varargs method.

---

# Java Chooses Methods Like This

Suppose

```java
calc.add(10,20);
```

Java checks

```
Exact Match?

↓

Yes

↓

Use add(int,int)
```

---

Suppose

```java
calc.add(10,20,30,40);
```

Checks

```
add(int,int)?

↓

No

↓

Varargs?

↓

Yes

↓

Use add(int...)
```

---

# Difference Between Overloading and Varargs

| Method Overloading            | Varargs                                |
| ----------------------------- | -------------------------------------- |
| Multiple methods              | One method                             |
| Different parameter lists     | Variable number of same-type arguments |
| Good for different data types | Good for same data type                |
| Compile-time selection        | Internally uses an array               |
| More control                  | More flexibility                       |

---

# Interview Questions

### 1. Why do we use Method Overloading?

To perform similar operations using the same method name with different parameter lists.

---

### 2. Why not always use Varargs?

Because Varargs works only for **variable numbers of the same data type**. It cannot replace overloaded methods when parameter types or behavior differ.

---

### 3. What is Varargs?

Varargs (`...`) allow a method to accept **zero or more arguments** of the same type. Internally, Java converts them into an array.

Example:

```java
void print(String... names)
```

---

### 4. Does Java create an array for Varargs?

Yes.

```java
sum(10,20,30)
```

becomes internally

```java
sum(new int[]{10,20,30});
```

---

# Summary

### Method Overloading

```
Same Method Name

+

Different Parameters

=

Method Overloading
```

Used when

* Different datatypes
* Different parameter count
* Different parameter order

---

### Varargs

```
One Method

+

Same Datatype

+

Any Number of Values

=

Varargs
```

---

# Easy Formula

```
Need different parameter types?
        │
        ▼
Use Method Overloading

────────────────────────────

Need the same type but an unknown number of values?
        │
        ▼
Use Varargs (...)
```

### Example

**Method Overloading**

```java
add(10,20);

add(10,20,30);

add(10.5,20);
```

**Varargs**

```java
add(10,20);

add(10,20,30);

add(10,20,30,40,50);
```

The key difference is:

* **Method Overloading** = Same method name, **different parameter lists**.
* **Varargs** = One method that accepts **any number of arguments of the same type**.
