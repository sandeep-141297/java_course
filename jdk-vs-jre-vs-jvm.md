**JDK is neither just a compiler nor just JVM.**
It is a **complete development kit** that **includes both the JVM and the compiler**.

### 1️⃣ JDK (Java Development Kit)

JDK is used to **develop Java programs**. It contains tools needed for coding, compiling, and running Java.

**JDK = JRE + Development Tools**

Main tools inside JDK:

* **javac** → Java **compiler**
* **java** → runs the program using JVM
* debugger, jar tool, etc.

---

### 2️⃣ JVM (Java Virtual Machine)

* JVM **runs the Java bytecode**.
* It converts **bytecode → machine code** for the computer.

Example flow:

```
Hello.java  →  javac (compiler)  →  Hello.class (bytecode)  →  JVM runs it
```

---

### 3️⃣ Java Compiler (javac)

* Converts **.java file → .class file (bytecode)**

Example you used:

```
javac Hello.java
```

This created:

```
Hello.class
```

Then JVM runs it:

```
java Hello
```

---

### 4️⃣ Full Structure

```
JDK
 ├── JRE
 │    └── JVM
 ├── javac (compiler)
 ├── jar
 └── other development tools
```

---

✅ **Simple Answer (Interview Style):**

> **JDK is a software development kit that contains the JVM and the Java compiler (javac) along with other tools used to develop Java applications.**


