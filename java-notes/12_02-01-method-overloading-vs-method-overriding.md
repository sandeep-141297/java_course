# Method Overloading is same as Method OverRiding?

**No.** ❌

Your example is **Method Overloading**, **not** Method Overriding.

Many beginners confuse these two. Here's the easiest way to remember them.

---

# 1. Method Overloading (Same Class) ✅

**Same method name + Different parameters**

Example:

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, int b) {
        return a + b;
    }
}
```

This is **Method Overloading** because:

* ✅ Same class
* ✅ Same method name
* ✅ Different parameters

---

# 2. Method Overriding (Different Classes) ✅

Method overriding happens when a **child class** provides its own implementation of a method that already exists in the **parent class**.

Example:

```java
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();

    }
}
```

Output:

```text
Dog barks
```

The `Dog` class **overrides** the `sound()` method of `Animal`.

---

# Easy Real-Life Example

## Overloading

One person can do the same task in different ways.

```text
Calculator

add(2,3)

add(2,3,4)

add(2.5,3)
```

Same person (same class).

Different inputs.

---

## Overriding

Father teaches one way.

Son changes it.

```text
Father

Drive()

↓

Son

Drive()  ← New implementation
```

Same method.

Different implementation.

Different classes.

---

# Comparison

| Method Overloading       | Method Overriding    |
| ------------------------ | -------------------- |
| Same class               | Parent & Child class |
| Same method name         | Same method name     |
| Different parameters     | Same parameters      |
| Compile-time             | Runtime              |
| Inheritance not required | Inheritance required |

---

# Interview Question

### Q: Is your `Calculator` example method overriding?

```java
class Calculator {

    int add(int a, int b) { ... }

    int add(int a, int b, int c) { ... }
}
```

**Answer:**

❌ No.

It is **Method Overloading** because the methods have the **same name** but **different parameter lists**, and they are in the **same class**.

Method Overriding requires:

* A **parent class**
* A **child class**
* The **same method signature** (same name and parameters)
* The child class provides a new implementation.

---

### Easy Trick to Remember

```text
Method Overloading
------------------
Same Class
Different Parameters

Method Overriding
-----------------
Different Classes
Same Parameters
New Implementation
```

So your `Calculator` code is **100% Method Overloading**, **not** Method Overriding.
