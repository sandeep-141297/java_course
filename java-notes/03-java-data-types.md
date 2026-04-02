# Java Data Types

Data types in Java define the **type of data a variable can store**.

Example:

```java
int age = 25;
float price = 99.99f;
char grade = 'A';
```

---

# Types of Data Types in Java

Java data types are divided into **two categories**:

```id="p6kr0w"
1. Primitive Data Types
2. Non-Primitive Data Types
```

---

# 1. Primitive Data Types

Primitive data types are **basic built-in data types** provided by Java.

They store **simple values** and are not objects.

## List of Primitive Data Types

| Data Type | Size    | Range                 | Example                |
| --------- | ------- | --------------------- | ---------------------- |
| `byte`    | 1 byte  | -128 to 127           | `byte b = 10;`         |
| `short`   | 2 bytes | -32,768 to 32,767     | `short s = 1000;`      |
| `int`     | 4 bytes | -2³¹ to 2³¹-1         | `int num = 100;`       |
| `long`    | 8 bytes | -2⁶³ to 2⁶³-1         | `long l = 100000L;`    |
| `float`   | 4 bytes | ~6-7 decimal digits   | `float f = 10.5f;`     |
| `double`  | 8 bytes | ~15 decimal digits    | `double d = 10.555;`   |
| `char`    | 2 bytes | 0 to 65,535 (Unicode) | `char c = 'A';`        |
| `boolean` | 1 bit*  | true/false            | `boolean flag = true;` |

> *Note: Size of boolean is JVM-dependent.*

---

## Example Program

```java
class DataTypesExample {
    public static void main(String[] args) {
        int num = 10;
        float price = 99.5f;
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println(num);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(isJavaFun);
    }
}
```

---

# 2. Non-Primitive Data Types

Non-primitive data types are also called **reference types**.

They store **memory addresses (references)** instead of actual values.

## Examples

* String
* Arrays
* Classes
* Objects
* Interfaces

Example:

```java
String name = "Sandeep";
int[] numbers = {1, 2, 3, 4};
```

---

# Difference Between Primitive and Non-Primitive

| Feature    | Primitive    | Non-Primitive       |
| ---------- | ------------ | ------------------- |
| Type       | Basic        | Reference           |
| Stores     | Actual value | Address (reference) |
| Size       | Fixed        | Not fixed           |
| Example    | int, float   | String, Array       |
| Null value | Not allowed  | Allowed             |

---

# Important Points

* `int` is the **most commonly used** data type for numbers
* `double` is preferred over `float` for precision
* `char` stores **single character only**
* `String` is **not primitive**, it is a class
* `boolean` only stores **true or false**

---

# Type Casting in Java

Type casting means **converting one data type into another**.

## 1. Implicit Casting (Widening)

Small → Large (automatic)

```java
int num = 10;
double d = num; // int → double
```

---

## 2. Explicit Casting (Narrowing)

Large → Small (manual)

```java
double d = 10.5;
int num = (int) d; // double → int
```

---

# Interview Questions

### Q1. How many data types are there in Java?

Java has **8 primitive data types**.

---

### Q2. Difference between float and double?

* `float` → less precision (4 bytes)
* `double` → more precision (8 bytes)

---

### Q3. Why is String not primitive?

Because it is a **class** and provides many methods like:

```java
name.length();
name.toUpperCase();
```

---

# Summary

* Java has **2 types of data types**
* **Primitive (8 types)** → stores values
* **Non-Primitive** → stores references
* Type casting is used to convert between types

