# Java Stack & Heap Memory (Complete Beginner Guide)

This guide explains **Stack Memory**, **Heap Memory**, **JVM Memory**, and how they work together using simple language and diagrams.

---

# Before Learning Stack & Heap

Whenever you run a Java program:

```java
public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.add(10,20);

    }

}
```

Many beginners think:

> "Where is this program stored?"
>
> "Where are objects created?"
>
> "Where are methods executed?"

The answer is:

**Inside the JVM (Java Virtual Machine).**

---

# What is JVM?

JVM stands for

```text
Java Virtual Machine
```

It is a software that runs Java programs.

Think of JVM as a **manager**.

Its job is to

* Load classes
* Execute methods
* Create objects
* Manage memory
* Remove unused objects (Garbage Collection)

---

# JVM Memory

When your Java program starts

```text
               JVM
        +------------------+
        |                  |
        |   Stack Memory   |
        |                  |
        |------------------|
        |                  |
        |   Heap Memory    |
        |                  |
        +------------------+
```

The two most important memory areas for beginners are

* Stack Memory
* Heap Memory

---

# Easy Real-Life Example

Imagine an Office.

```text
Office

───────────────

Desk

Cupboard
```

Desk

* Current work
* Temporary

Cupboard

* Store files
* Long-term

Java

```text
Desk

↓

Stack

Cupboard

↓

Heap
```

---

# What is Stack Memory?

Stack Memory stores

* Method calls
* Local variables
* Reference variables

Stack memory is

* Fast
* Temporary
* Automatically cleaned

---

# Example

```java
public class Main {

    public static void main(String[] args) {

        int x = 10;

    }

}
```

Memory

```text
Stack

-----------------

main()

x = 10

-----------------
```

No object exists.

Everything is inside Stack.

---

# What is Heap Memory?

Heap Memory stores

* Objects
* Instance variables

Whenever you write

```java
new Calculator()
```

Java creates an object in the Heap.

---

# Example

```java
Calculator calc = new Calculator();
```

Memory

```text
Stack                        Heap

calc  ---------------------> Calculator Object
                             ----------------
                             num1 = 0
                             num2 = 0
                             ----------------
```

Notice

Object is NOT in Stack.

Object is in Heap.

---

# What Does "calc" Store?

Many beginners think

```java
Calculator calc
```

is the object.

Actually

No.

It stores the address (reference).

```text
calc

↓

0x100
```

Object

```text
Address 0x100

Calculator Object
```

---

# Complete Example

```java
class Calculator {

    int num = 100;

    void add() {

        System.out.println("Adding");

    }

}
```

Main

```java
public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.add();

    }

}
```

---

# Step 1

Program Starts

JVM starts.

```text
JVM

↓

main()
```

---

# Step 2

Java executes

```java
Calculator calc = new Calculator();
```

Heap

```text
Calculator Object

num = 100
```

Stack

```text
calc

↓

Calculator Object
```

Diagram

```text
              JVM

+--------------------------------------+

Stack                    Heap

main()

calc  ----------------> Calculator Object

                        num = 100

+--------------------------------------+
```

---

# Step 3

Call

```java
calc.add();
```

Stack

```text
add()

main()
```

Heap

```text
Calculator Object

num =100
```

Diagram

```text
                JVM

+------------------------------------------------+

Stack

add()

main()

calc -----------

               |

               |

Heap           |

Calculator Object

num =100

+------------------------------------------------+
```

---

# Step 4

Method Finishes

```java
add()
```

is removed.

Stack

```text
main()

calc
```

Heap

Still exists.

```text
Calculator Object
```

---

# Step 5

Program Ends

main()

removed.

Now nothing points to the object.

Heap

```text
Calculator Object
```

↓

Unused

↓

Garbage Collector removes it.

---

# Another Example

```java
Calculator c1 = new Calculator();

Calculator c2 = new Calculator();
```

Memory

```text
Stack

c1 -------------

                |

                |

c2 -------------|-------------

                |             |

Heap            |             |

Calculator      Calculator

Object          Object
```

Two objects.

Two references.

---

# Method Parameters

Example

```java
public int add(int a,int b){

    return a+b;

}
```

Call

```java
calc.add(10,20);
```

Stack

```text
add()

a=10

b=20

main()
```

Heap

```text
Calculator Object
```

Parameters are stored inside Stack.

---

# Local Variables

```java
void test(){

    int x=10;

    int y=20;

}
```

Memory

```text
Stack

test()

x=10

y=20
```

Local variables always go into Stack.

---

# Instance Variables

```java
class Student{

    int age=25;

}
```

Object

```java
Student s = new Student();
```

Memory

```text
Heap

Student Object

age=25
```

Instance variables live inside the object in the Heap.

---

# Stack vs Heap

| Stack                                       | Heap                                                                   |
| ------------------------------------------- | ---------------------------------------------------------------------- |
| Stores method calls                         | Stores objects                                                         |
| Stores local variables                      | Stores instance variables                                              |
| Stores reference variables                  | Stores object data                                                     |
| Fast                                        | Larger but slower                                                      |
| Automatically cleaned when a method returns | Cleaned by the Garbage Collector when objects are no longer referenced |

---

# Real-Life Example

Imagine a School.

Teacher's Table

```text
Current Attendance

Current Notebook
```

Temporary.

Cupboard

```text
Student Records

Books

Furniture
```

Long-term.

Java

```text
Teacher Table

↓

Stack

Cupboard

↓

Heap
```

---

# Call Stack

Suppose

```java
main()

↓

display()

↓

calculate()
```

Stack

```text
----------------

calculate()

----------------

display()

----------------

main()

----------------
```

Last method called is always on top.

When calculate() finishes

```text
----------------

display()

----------------

main()

----------------
```

This is called

```text
LIFO

Last In

First Out
```

---

# Complete Execution

```java
class Calculator{

    int num=100;

    void add(){

        int sum=10+20;

    }

}
```

Main

```java
public class Main{

    public static void main(String[] args){

        Calculator calc=new Calculator();

        calc.add();

    }

}
```

Execution

```text
JVM Starts

↓

main()

↓

Create Object

↓

Object goes into Heap

↓

Reference stored in Stack

↓

Call add()

↓

add() goes into Stack

↓

sum created in Stack

↓

Method finishes

↓

add() removed

↓

main() finishes

↓

Stack Empty

↓

Object becomes unreachable

↓

Garbage Collector removes object
```

---

# Garbage Collection

Example

```java
Calculator calc=new Calculator();
```

Later

```java
calc=null;
```

Now

```text
Stack

calc = null
```

Heap

```text
Calculator Object
```

No reference.

JVM Garbage Collector removes it later.

---

# Interview Questions

### 1. What is Stack Memory?

Stack Memory stores method calls, local variables, parameters, and reference variables. It is automatically managed and each method call gets its own stack frame.

---

### 2. What is Heap Memory?

Heap Memory stores objects and their instance variables. Objects remain there until they are no longer referenced and are eventually removed by the Garbage Collector.

---

### 3. Where are objects created?

Objects are created in **Heap Memory**.

Example:

```java
Calculator calc = new Calculator();
```

---

### 4. Where are local variables stored?

In **Stack Memory**.

Example:

```java
int x = 10;
```

---

### 5. What does a reference variable store?

A reference variable stores the **reference (memory address)** of an object, not the object itself.

---

# Summary

### Stack

```text
Method Calls

Local Variables

Parameters

Reference Variables
```

---

### Heap

```text
Objects

Instance Variables
```

---

### JVM

```text
Runs Java Program

Creates Objects

Executes Methods

Manages Memory

Runs Garbage Collector
```

---

# Easy Formula

```text
                     JVM
        +---------------------------+
        |                           |
        |   Stack (Temporary Work)  |
        |---------------------------|
        |   Heap (Objects Storage)  |
        +---------------------------+

Stack
------
✓ Method calls
✓ Local variables
✓ Parameters
✓ References

Heap
-----
✓ Objects
✓ Instance variables
```

## Final Rule (Remember Forever)

```text
new Object()      → Heap

Reference Variable → Stack

Method Calls       → Stack

Local Variables    → Stack

Object Data        → Heap

JVM                → Manages Stack, Heap, and Garbage Collection
```

This mental model will help you understand classes, objects, methods, constructors, inheritance, exceptions, and multithreading later in your Java journey.
