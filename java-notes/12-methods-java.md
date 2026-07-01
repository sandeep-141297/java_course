# Java Methods (Complete Beginner Guide)

This guide explains **Methods** in Java using **easy language**, **real-life examples**, **memory concepts**, and **interview questions**.

---

# What is a Method?

A **method** is a **block of code** that performs a specific task.

Instead of writing the same code again and again, we write it **once inside a method** and call it whenever we need it.

Think of a method as a **machine**.

```
Input
   │
   ▼
 Method
   │
   ▼
Output
```

---

# Real-Life Example

Imagine a **Coffee Machine**.

You press a button.

The machine performs many steps:

* Boils water
* Adds coffee
* Adds sugar
* Mixes everything

Finally,

```
Coffee Ready
```

You don't know every internal step.

You simply press the button.

A Java method works the same way.

```
coffeeMachine.makeCoffee();
```

---

# Why Do We Need Methods?

Without methods

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

Imagine writing this 100 times.

Instead

```java
printHello();
```

Whenever needed

```java
printHello();
printHello();
printHello();
```

Write once.

Use many times.

---

# Method Syntax

```java
returnType methodName() {

    // code

}
```

Example

```java
void greet() {

    System.out.println("Welcome");

}
```

---

# Parts of a Method

```java
public void greet() {

    System.out.println("Hello");

}
```

```
public
```

Access Modifier

```
void
```

Return Type

```
greet
```

Method Name

```
()
```

Parameters

```
{}
```

Method Body

---

# Simple Method

```java
public class Main {

    static void greet() {

        System.out.println("Hello Java");

    }

    public static void main(String[] args) {

        greet();

    }
}
```

Output

```
Hello Java
```

---

# What Happens?

```
main()

↓

greet()

↓

Print Hello Java

↓

Return to main()
```

---

# Method Call Flow

```
main()

↓

Method Called

↓

Execute Code

↓

Return Back
```

---

# Real-Life Example

Imagine a Restaurant.

Customer

↓

Orders Food

↓

Chef Cooks

↓

Food Ready

↓

Customer Gets Food

Java

```
main()

↓

Method

↓

Execute

↓

Return
```

---

# Calling a Method Multiple Times

```java
public class Main {

    static void greet() {

        System.out.println("Welcome");

    }

    public static void main(String[] args) {

        greet();
        greet();
        greet();

    }
}
```

Output

```
Welcome
Welcome
Welcome
```

---

# Methods with Parameters

Sometimes methods need input.

Example

```
Hello Rahul

Hello Aman

Hello Priya
```

Instead of creating 3 methods

Create one.

```java
static void greet(String name) {

    System.out.println("Hello " + name);

}
```

Call

```java
greet("Rahul");

greet("Aman");

greet("Priya");
```

Output

```
Hello Rahul

Hello Aman

Hello Priya
```

---

# What are Parameters?

Parameters are variables that receive values.

```
String name
```

is a parameter.

Call

```java
greet("Rahul");
```

```
Rahul
```

is an argument.

Remember

```
Method Definition

↓

Parameter

Method Call

↓

Argument
```

---

# Example with Two Parameters

```java
static void add(int a, int b) {

    System.out.println(a + b);

}
```

Call

```java
add(10,20);

add(5,7);
```

Output

```
30

12
```

---

# Return Type

Some methods only perform work.

Some methods return a value.

Example

```java
static int add(int a,int b){

    return a+b;

}
```

Call

```java
int sum = add(10,20);

System.out.println(sum);
```

Output

```
30
```

---

# Difference Between `void` and `return`

## Void

Returns nothing.

```java
void print() {

    System.out.println("Hello");

}
```

---

## Return

Returns a value.

```java
int square(int n){

    return n*n;

}
```

---

# Complete Example

```java
public class Main {

    static int multiply(int a,int b){

        return a*b;

    }

    public static void main(String[] args){

        int answer = multiply(5,4);

        System.out.println(answer);

    }

}
```

Output

```
20
```

---

# Method Types

## 1. No Parameters, No Return

```java
void greet(){

    System.out.println("Hello");

}
```

---

## 2. Parameters, No Return

```java
void greet(String name){

    System.out.println(name);

}
```

---

## 3. No Parameters, Return Value

```java
int getAge(){

    return 20;

}
```

---

## 4. Parameters and Return Value

```java
int add(int a,int b){

    return a+b;

}
```

---

# Instance Methods

Inside a class

```java
class Calculator{

    void add(){

        System.out.println("Adding");

    }

}
```

Call

```java
Calculator calc = new Calculator();

calc.add();
```

Need an object because `add()` is an **instance method**.

---

# Static Methods

```java
class Calculator{

    static void hello(){

        System.out.println("Hello");

    }

}
```

Call

```java
Calculator.hello();
```

No object required because the method belongs to the class.

---

# Instance vs Static Method

| Instance Method               | Static Method                      |
| ----------------------------- | ---------------------------------- |
| Belongs to object             | Belongs to class                   |
| Need object                   | No object needed                   |
| Uses object data              | Usually independent of object data |
| Called with `object.method()` | Called with `ClassName.method()`   |

---

# Method Memory Flow

```java
public class Main {

    static void greet(){

        System.out.println("Hello");

    }

    public static void main(String[] args){

        greet();

    }

}
```

Execution

```
Program Starts

↓

main()

↓

Calls greet()

↓

greet() added to Call Stack

↓

Print Hello

↓

greet() finishes

↓

Removed from Call Stack

↓

Back to main()

↓

Program Ends
```

---

# Call Stack

```
Before Call

---------

main()

---------

After greet()

---------

greet()

main()

---------

After Return

---------

main()

---------
```

Methods are managed using the **Call Stack (LIFO - Last In, First Out)**.

---

# Real-Life Example

Think of a **TV Remote**.

Buttons

```
Volume Up

Volume Down

Power

Mute
```

Each button performs one task.

Each button is like a method.

```
remote.volumeUp();

remote.power();

remote.mute();
```

---

# Rules for Good Methods

* Keep one method for one task.
* Use meaningful names.
* Avoid very long methods.
* Reuse methods instead of copying code.
* Return values when needed.

---

# Common Naming Conventions

Good

```java
calculateSalary()

printInvoice()

getName()

setAge()

withdrawMoney()
```

Bad

```java
abc()

test1()

method()

xyz()
```

Method names should describe **what the method does**.

---

# Interview Questions

### 1. What is a method?

A method is a block of code that performs a specific task. It helps organize code and enables code reuse.

---

### 2. Why do we use methods?

* To avoid repeating code.
* To improve readability.
* To make programs easier to test and maintain.
* To break large problems into smaller tasks.

---

### 3. What is the difference between a parameter and an argument?

```java
void greet(String name) { ... }
```

* `String name` is a **parameter**.

```java
greet("Sandeep");
```

* `"Sandeep"` is an **argument**.

---

### 4. What is the difference between `void` and `return`?

* `void` means the method does not return any value.
* A method with a return type (like `int`, `String`, or `boolean`) must return a value using the `return` keyword.

---

### 5. What is the difference between an instance method and a static method?

* An **instance method** belongs to an object and is called using an object.
* A **static method** belongs to the class and is called using the class name.

---

# Summary

* A **method** is a reusable block of code that performs a specific task.
* Methods reduce code duplication and make programs easier to read and maintain.
* A method has a **return type**, **name**, **parameters**, and a **body**.
* **Parameters** receive values; **arguments** are the values passed during a method call.
* Use `void` when nothing needs to be returned; otherwise, use an appropriate return type.
* **Instance methods** require an object, while **static methods** can be called using the class name.
* During execution, method calls are managed by the **Call Stack**.

---

## Easy Formula to Remember

```
Need to perform a task?

        │
        ▼
     Create Method

        │
        ▼
Call the Method

        │
        ▼
Method Executes

        │
        ▼
(Optional) Returns a Value

        │
        ▼
Program Continues
```

> **Tip for learning:** Since you're preparing for Java interviews, master these four method types:
>
> 1. No parameters, no return.
> 2. Parameters, no return.
> 3. No parameters, return value.
> 4. Parameters and return value.
>
> Most Java interview coding questions use one of these four patterns.
