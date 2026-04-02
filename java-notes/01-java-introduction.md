# Java Introduction

## What is Java?

**Java** is a **high-level, object-oriented, platform-independent programming language** used to build applications for web, mobile, desktop, and enterprise systems.

Java was designed to follow the principle:

> **Write Once, Run Anywhere (WORA)**

This means a Java program can run on any system that has a **Java Virtual Machine (JVM)** installed.

---

## History of Java

Java was developed by **James Gosling** and his team at **Sun Microsystems** in **1991**.

Originally, the project was called **Oak**.

Later it was renamed **Java** in **1995** and officially released as **Java 1.0 in 1996**.

In **2010**, **Oracle Corporation** acquired Sun Microsystems and became the owner of Java.

---

## Features of Java

### 1. Platform Independent

Java programs are compiled into **bytecode**, which can run on any system with a JVM.

Example:

```
Windows
Linux
Mac
```

The same `.class` file runs on all systems.

---

### 2. Object-Oriented

Java follows **Object-Oriented Programming (OOP)** principles like:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

---

### 3. Simple

Java syntax is easier compared to languages like **C and C++** because it removes complex features like:

* Pointer arithmetic
* Manual memory management

---

### 4. Secure

Java provides strong security features:

* No direct memory access
* Bytecode verification
* Secure class loading

---

### 5. Robust

Java is robust because:

* Strong memory management
* Exception handling
* Garbage collection

---

### 6. Multithreaded

Java supports **multithreading**, which allows multiple tasks to run simultaneously.

Example:

* Downloading a file
* Playing music at the same time

---

### 7. High Performance

Java uses **Just-In-Time (JIT) compilation**, which improves program execution speed.

---

## Applications of Java

Java is widely used in many areas:

* Web applications (Spring, JSP, Servlets)
* Mobile applications (Android)
* Desktop applications
* Enterprise systems
* Cloud applications
* Big data technologies (Hadoop)

---

## Java Program Example

```java
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Compile the program:

```
javac Hello.java
```

Run the program:

```
java Hello
```

Output:

```
Hello World
```

---

## Java Editions

Java has different editions for different types of applications:

### Java SE (Standard Edition)

Used for **core Java development** and desktop applications.

### Java EE (Enterprise Edition)

Used for **enterprise-level web applications**.

### Java ME (Micro Edition)

Used for **embedded systems and small devices**.

---

## Summary

* Java is a **platform-independent programming language**
* Developed by **James Gosling**
* First released in **1996**
* Follows **Object-Oriented Programming**
* Used for **web, mobile, enterprise, and cloud applications**