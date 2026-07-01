**A method in Java is very similar to a function**, but there is a small difference.

## Short Answer

* **Function** = General programming term.
* **Method** = A function that belongs to a class or object.

So in Java, we usually say **method**, not function.

---

# Real-Life Example

Imagine a **TV**.

The TV can perform actions like:

* Turn On
* Turn Off
* Increase Volume
* Change Channel

These actions belong to the TV.

```text
TV
 ├── turnOn()
 ├── turnOff()
 ├── volumeUp()
 └── changeChannel()
```

In Java, these actions are called **methods** because they belong to the `TV` class.

---

# Example

```java
class Calculator {

    void add() {
        System.out.println("Adding numbers");
    }
}
```

Here,

```java
add()
```

is a **method** because it belongs to the `Calculator` class.

Call it like this:

```java
Calculator calc = new Calculator();
calc.add();
```

---

# Function vs Method

| Function                                | Method                          |
| --------------------------------------- | ------------------------------- |
| Independent block of code               | Belongs to a class/object       |
| Exists on its own (in languages like C) | Exists inside a class (Java)    |
| Called directly                         | Called using an object or class |

---

# C Language Example (Function)

```c
#include <stdio.h>

void greet() {
    printf("Hello");
}

int main() {
    greet();
}
```

Here `greet()` is called a **function** because C does not have classes.

---

# Java Example (Method)

```java
class Student {

    void study() {
        System.out.println("Studying");
    }
}

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        s.study();

    }
}
```

Here `study()` is called a **method** because it belongs to the `Student` class.

---

# Why doesn't Java use the word "function"?

Everything in Java (except primitive values) is organized around **classes and objects**.

So Java says:

> **A method is a function that belongs to a class.**

That's why Java documentation uses the term **method**.

---

# Easy Formula

```text
C Language

Function
   ↓
greet()


Java

Class
   ↓
Method
   ↓
student.study()
```

---

# Interview Answer

**Q: Is a method the same as a function?**

**Answer:**

Almost. A **method is a type of function that belongs to a class or object**. In Java, all executable code (except constructors and initialization blocks) is written inside classes, so Java uses the term **method** instead of **function**.

### Easy way to remember

```text
Function = General word

Method = Function inside a Class
```

So you can think of it as:

```text
All methods are functions,
but in Java, functions inside classes are called methods.
```

This is the simplest and most commonly accepted explanation for beginners and interviews.
