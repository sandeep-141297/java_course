# Instance Variable vs Local Variable (Easy Explanation)

This is one of the most important Java interview questions.

---

# Instance Variable

An **instance variable** is a variable that is **declared inside a class but outside any method, constructor, or block**.

It belongs to the **object (instance)** of the class.

### Example

```java
class Student {

    String name = "Sandeep";   // Instance variable
    int age = 25;              // Instance variable

}
```

Here,

* `name`
* `age`

are **instance variables**.

### Memory

```text
Heap

Student Object
-----------------
name = "Sandeep"
age = 25
-----------------
```

Instance variables are stored **inside the object in Heap Memory**.

---

# Local Variable

A **local variable** is a variable that is **declared inside a method, constructor, or block**.

It exists only while that method is running.

### Example

```java
class Student {

    void study() {

        int hours = 5;   // Local variable

        System.out.println(hours);
    }

}
```

Here,

`hours` is a **local variable**.

### Memory

```text
Stack

study()

hours = 5
```

Local variables are stored in **Stack Memory**.

When the method finishes, the local variable is destroyed automatically.

---

# Complete Example

```java
class Student {

    String name = "Sandeep";   // Instance variable

    void study() {

        int hours = 5;         // Local variable

        System.out.println(name);

        System.out.println(hours);

    }

}
```

### Memory Diagram

```text
              JVM

+----------------------------------------+

Stack                       Heap

study()                     Student Object

hours = 5                   name = "Sandeep"

+----------------------------------------+
```

* `name` → Heap (inside the object)
* `hours` → Stack (inside the method)

---

# Real-Life Example

Imagine a **Student**.

### Instance Variable

```text
Student

Name : Sandeep

Age  : 25
```

These are properties of the student.

Every student has their own values.

---

### Local Variable

Today the student studies for:

```text
Hours = 5
```

Tomorrow:

```text
Hours = 3
```

`hours` is temporary.

It exists only during the study session.

---

# Difference

| Instance Variable                         | Local Variable                                  |
| ----------------------------------------- | ----------------------------------------------- |
| Declared inside a class                   | Declared inside a method, constructor, or block |
| Belongs to an object                      | Belongs only to a method                        |
| Stored in Heap                            | Stored in Stack                                 |
| Lives as long as the object exists        | Lives only while the method is executing        |
| Has default values (`0`, `false`, `null`) | Must be initialized before use                  |

---

# Easy Trick to Remember

```text
Inside Class
Outside Method
        ↓
Instance Variable

-------------------------

Inside Method
        ↓
Local Variable
```

## Example

```java
class Calculator {

    int result = 0;      // Instance variable

    void add() {

        int sum = 10;    // Local variable

    }
}
```

* `result` → **Instance Variable** (stored in Heap)
* `sum` → **Local Variable** (stored in Stack)

### Interview Definition

* **Instance Variable:** A variable declared inside a class but outside any method. It belongs to an object and is stored in **Heap Memory**.
* **Local Variable:** A variable declared inside a method, constructor, or block. It exists only during method execution and is stored in **Stack Memory**.
