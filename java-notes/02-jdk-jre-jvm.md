# JDK vs JRE vs JVM

Java programs run using a combination of **JDK, JRE, and JVM**.
Each component plays a different role in developing and running Java applications.

---

# 1. JDK (Java Development Kit)

**JDK** is a complete **software development kit** used to **develop Java applications**.

It provides tools required for **writing, compiling, debugging, and running Java programs**.

### JDK Structure

```
JDK = JRE + Development Tools
```

### Main Tools in JDK

| Tool      | Purpose                                     |
| --------- | ------------------------------------------- |
| `javac`   | Java compiler (converts `.java` → `.class`) |
| `java`    | Runs the compiled program                   |
| `jar`     | Creates Java archive files                  |
| `jdb`     | Java debugger                               |
| `javadoc` | Generates documentation                     |

Example:

```
javac Hello.java
```

This command compiles the Java file and creates:

```
Hello.class
```

---

# 2. JRE (Java Runtime Environment)

**JRE** provides the **environment required to run Java programs**.

It contains the **JVM and core Java libraries**.

### JRE Structure

```
JRE = JVM + Libraries
```

Components inside JRE:

* JVM
* Core Java class libraries
* Runtime environment

JRE **cannot compile Java programs**, it can only **run them**.

---

# 3. JVM (Java Virtual Machine)

**JVM** is responsible for **executing Java bytecode**.

It acts as a **virtual machine** between the Java program and the operating system.

### Main Responsibilities of JVM

* Loads `.class` files
* Verifies bytecode
* Converts bytecode to machine code
* Executes the program

This is why Java is **platform independent**.

---

# Java Program Execution Flow

```
Hello.java
     ↓
javac (Compiler)
     ↓
Hello.class (Bytecode)
     ↓
JVM
     ↓
Machine Code
     ↓
Output
```

Example:

Compile the program

```
javac Hello.java
```

Run the program

```
java Hello
```

Output

```
Hello World
```

---

# Java Architecture Overview

```
JDK
 ├── JRE
 │    └── JVM
 ├── javac (Compiler)
 ├── jar
 ├── debugger
 └── other development tools
```

---

# Key Differences

| Feature   | JDK                   | JRE                      | JVM                  |
| --------- | --------------------- | ------------------------ | -------------------- |
| Full Form | Java Development Kit  | Java Runtime Environment | Java Virtual Machine |
| Purpose   | Develop Java programs | Run Java programs        | Execute bytecode     |
| Contains  | JRE + tools           | JVM + libraries          | Execution engine     |
| Compiler  | Yes                   | No                       | No                   |

---

# Interview Answer (Short)

**JDK** is a development kit used to build Java applications.
It contains **JRE and development tools like the Java compiler (javac)**.

**JRE** provides the runtime environment to run Java programs.

**JVM** executes the Java bytecode and converts it into machine code.