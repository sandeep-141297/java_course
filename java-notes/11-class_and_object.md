# Java Classes & Objects (Easy Language + Real-Life Examples + Interview Notes)

This guide explains **Classes and Objects** from scratch in simple English.

---

# What is OOP (Object-Oriented Programming)?

Java is an **Object-Oriented Programming (OOP)** language.

Instead of writing only functions, Java groups **data + methods** together into **objects**.

Imagine the real world.

Everything around us is an object.

* Car
* Mobile
* Fan
* Student
* Employee
* Bank Account

Each object has:

* **Properties (Data)**
* **Behavior (Actions)**

Example:

A Car has

Properties

* Color
* Brand
* Speed

Behaviors

* Start
* Stop
* Accelerate
* Brake

Java follows the same idea.

---

# What is a Class?

A **Class** is a **blueprint** or **template**.

It tells Java:

> "If someone creates this object, it should have these variables and these methods."

Think about building a house.

Before building,

An architect creates a blueprint.

The blueprint is NOT the house.

It only describes how the house should look.

Exactly same in Java.

```
Blueprint = Class

Actual House = Object
```

---

# Real-Life Example

Suppose you manufacture Cars.

You don't create a new design every time.

You first create one design.

```
Car Design

Brand
Color
Engine
Start()
Stop()
```

Then many cars are manufactured.

```
Car 1

BMW
White

Car 2

Audi
Black

Car 3

Honda
Blue
```

One design.

Many cars.

```
Class = Design

Object = Actual Car
```

---

# Java Example

```java
class Car {

    String brand;
    String color;

    void start() {
        System.out.println("Car Started");
    }

    void stop() {
        System.out.println("Car Stopped");
    }
}
```

This class only describes the car.

Nothing is created yet.

---

# What is an Object?

An object is a **real instance** of a class.

Class

```
Car
```

Object

```
BMW

Audi

Honda
```

Each object has its own data.

---

# Creating Object

Syntax

```java
ClassName objectName = new ClassName();
```

Example

```java
Car car1 = new Car();
```

Let's understand each part.

```
Car
```

Data Type

```
car1
```

Reference Variable

```
new
```

Creates memory

```
Car()
```

Constructor

---

# Memory Representation

```
Car car1 = new Car();
```

Memory

```
Stack

car1
 |
 |
 V

Heap

--------------------
brand = null
color = null
--------------------
```

Object lives in Heap Memory.

Reference variable lives in Stack.

---

# Setting Values

```java
car1.brand = "BMW";
car1.color = "White";
```

Memory

```
brand = BMW

color = White
```

---

# Calling Methods

```java
car1.start();
```

Output

```
Car Started
```

---

# Complete Program

```java
class Car {

    String brand;
    String color;

    void start() {
        System.out.println(brand + " Started");
    }
}

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "BMW";
        car1.color = "White";

        car1.start();
    }
}
```

Output

```
BMW Started
```

---

# Creating Multiple Objects

```java
Car car1 = new Car();
Car car2 = new Car();
Car car3 = new Car();
```

Assign values

```java
car1.brand = "BMW";

car2.brand = "Audi";

car3.brand = "Honda";
```

Output

```
BMW

Audi

Honda
```

Each object has separate memory.

---

# Memory Diagram

```
Heap

Object 1

Brand = BMW

Object 2

Brand = Audi

Object 3

Brand = Honda
```

---

# Why Create Objects?

Without objects

Suppose you have 100 students.

Without object

```
student1Name

student1Age

student2Name

student2Age

student3Name

student3Age
```

Huge mess.

Instead

```
Student class

↓

Student objects

student1

student2

student3
```

Everything becomes organized.

---

# Student Example

```java
class Student {

    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}
```

Main

```java
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Rahul";
        s1.age = 22;

        s1.study();
    }

}
```

Output

```
Rahul is studying
```

---

# Another Object

```java
Student s2 = new Student();

s2.name = "Priya";

s2.age = 20;
```

Output

```
Priya is studying
```

---

# Object Stores Different Data

```
Student

↓

Rahul

Age 22

↓

Priya

Age 20

↓

Aman

Age 18
```

Same class.

Different objects.

---

# Class Contains

A class mainly contains:

### Variables (Fields)

Store data.

```java
String name;

int age;
```

---

### Methods

Perform actions.

```java
void study() {

}
```

---

### Constructors

Create object.

```java
Student() {

}
```

We'll learn constructors in detail later.

---

# Simple Formula

```
Class

↓

Object

↓

Method

↓

Result
```

---

# Another Real-Life Example

Think of Mobile Phones.

Blueprint

```
Samsung Phone

RAM

Storage

Camera

Call()

Message()
```

Objects

```
My Phone

Your Phone

Friend Phone
```

Same class.

Different objects.

---

# Bank Example

Class

```java
class BankAccount {

    String name;
    double balance;

    void deposit() {

    }

    void withdraw() {

    }
}
```

Objects

```
Sandeep Account

Rahul Account

Amit Account
```

Every customer has different balance.

---

# Car Example (Complete)

```java
class Car {

    String brand;
    int speed;

    void accelerate() {
        speed += 20;
        System.out.println(brand + " Speed : " + speed);
    }
}

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car();

        bmw.brand = "BMW";
        bmw.speed = 0;

        bmw.accelerate();
        bmw.accelerate();

    }
}
```

Output

```
BMW Speed : 20

BMW Speed : 40
```

---

# Important Keywords

## new

Creates object.

```java
Student s = new Student();
```

---

## Dot (.)

Access variable or method.

```java
s.name

s.study()
```

---

## Reference Variable

```
Student s;
```

"s" stores object's address.

---

## Instance

Object is also called an **instance** of a class.

```
Student s = new Student();
```

"s" is an instance of Student.

---

# Difference Between Class and Object

| Class                                                 | Object                                   |
| ----------------------------------------------------- | ---------------------------------------- |
| Blueprint                                             | Real thing                               |
| Logical                                               | Physical                                 |
| No memory for instance fields until object is created | Occupies memory                          |
| Created once                                          | Can create many                          |
| Defines variables and methods                         | Holds actual values and can call methods |

---

# Interview Questions

### 1. What is a class?

A class is a blueprint/template used to create objects. It defines the properties (fields) and behaviors (methods) that its objects will have.

---

### 2. What is an object?

An object is a real instance of a class. It has its own data (field values) and can perform actions defined by the class methods.

---

### 3. Why do we need classes?

* To organize code.
* To model real-world entities.
* To create multiple objects with the same structure.
* To improve reusability and maintainability.

---

### 4. Why do we need objects?

Objects let us work with actual data. Each object can store different values while sharing the same class definition.

---

### 5. Can we create multiple objects from one class?

Yes. A single class can be used to create any number of objects.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
```

---

### 6. Does every object have separate memory?

Yes. Every object gets its own memory in the heap, so changing one object's fields does not affect another object's fields.

---

# Summary

* **Class** = Blueprint or template.
* **Object** = Real instance created from a class.
* **Fields** store the object's data.
* **Methods** define the object's behavior.
* Use the `new` keyword to create an object.
* The **reference variable** points to the object in memory.
* One class can create many independent objects with different data.

### Easy way to remember

```
Real World                     Java

House Design        --->       Class

Actual House        --->       Object

Student Form        --->       Class

Actual Student      --->       Object

Car Design          --->       Class

BMW Car             --->       Object

Mobile Design       --->       Class

Your Mobile         --->       Object
```

This is the foundation of Java OOP. Once you're comfortable with classes and objects, the next topics—**constructors, `this` keyword, methods, encapsulation, inheritance, polymorphism, abstraction, and interfaces**—will become much easier to understand.
