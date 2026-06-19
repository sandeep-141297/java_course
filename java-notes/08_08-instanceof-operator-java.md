# `instanceof` Operator in Java

The `instanceof` operator checks whether an object belongs to a particular class, subclass, or interface.

It returns:

```text
true  -> if object is of the specified type
false -> otherwise
```

---

# Syntax

```java
object instanceof ClassName
```

Example:

```java
String name = "Sandeep";

System.out.println(name instanceof String);
```

Output:

```text
true
```

---

# Basic Example

```java
String str = "Hello";

boolean result = str instanceof String;

System.out.println(result);
```

Output:

```text
true
```

---

# How It Works

```java
String str = "Hello";
```

Java creates a String object.

Then:

```java
str instanceof String
```

asks:

```text
"Is str an object of String class?"
```

Answer:

```text
true
```

---

# Example with Custom Class

```java
class Student {
}

public class Test {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s instanceof Student);
    }
}
```

Output:

```text
true
```

---

# Example Returning False

```java
String str = "Hello";

System.out.println(str instanceof Integer);
```

❌ Compile-time error because `String` and `Integer` are unrelated types.

A valid false example:

```java
Object obj = "Hello";

System.out.println(obj instanceof Integer);
```

Output:

```text
false
```

---

# Parent and Child Class Example

```java
class Animal {
}

class Dog extends Animal {
}

public class Test {
    public static void main(String[] args) {

        Dog d = new Dog();

        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
    }
}
```

Output:

```text
true
true
```

---

# Why Both Are True?

Because:

```text
Animal
   ↑
  Dog
```

A Dog object is:

* a Dog
* an Animal

So:

```java
d instanceof Dog
```

→ `true`

and

```java
d instanceof Animal
```

→ `true`

---

# Parent Reference Example

```java
Animal a = new Dog();

System.out.println(a instanceof Animal);
System.out.println(a instanceof Dog);
```

Output:

```text
true
true
```

---

# Important Concept

`instanceof` checks the **actual object**, not the reference type.

Reference:

```java
Animal a
```

Actual object:

```java
new Dog()
```

Since the object is Dog:

```java
a instanceof Dog
```

is `true`.

---

# Interface Example

```java
interface Printable {
}

class Report implements Printable {
}

public class Test {
    public static void main(String[] args) {

        Report r = new Report();

        System.out.println(r instanceof Printable);
    }
}
```

Output:

```text
true
```

---

# Null Example

```java
String str = null;

System.out.println(str instanceof String);
```

Output:

```text
false
```

---

# Why?

Because:

```text
null is not an object
```

So `instanceof` always returns:

```text
false
```

for `null`.

---

# Common Real-Life Use

Before type casting:

```java
Object obj = "Java";

if(obj instanceof String) {
    String str = (String) obj;
    System.out.println(str.length());
}
```

This avoids:

```text
ClassCastException
```

---

# Without instanceof

```java
Object obj = 100;

String str = (String) obj;
```

Runtime Error:

```text
ClassCastException
```

---

# With instanceof

```java
Object obj = 100;

if(obj instanceof String) {
    String str = (String) obj;
}
```

Safe because the cast happens only when the object is actually a String.

---

# Complete Example

```java
class Animal {
}

class Dog extends Animal {
}

public class InstanceOfDemo {

    public static void main(String[] args) {

        Animal a = new Dog();

        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Object);
    }
}
```

Output:

```text
true
true
true
```

---

# Why `instanceof Object` Is True?

Every class in Java ultimately inherits from:

Object

So every object is also an Object.

---

# Quick Revision

| Expression                    | Result  |
| ----------------------------- | ------- |
| `"Hello" instanceof String`   | `true`  |
| `new Dog() instanceof Dog`    | `true`  |
| `new Dog() instanceof Animal` | `true`  |
| `null instanceof String`      | `false` |

---

# Easy Memory Trick

```text
instanceof = "Is this object of this type?"
```

Example:

```java
obj instanceof String
```

Read as:

```text
Is obj a String object?
```

---

# Easy Understand

Let's make it very simple.

# What is `instanceof`?

Think of it as asking a question:

```text
"Is this object of this type?"
```

---

## Example 1

```java
String name = "Sandeep";

System.out.println(name instanceof String);
```

Java asks:

```text
Is "Sandeep" a String?
```

Answer:

```text
Yes
```

Output:

```text
true
```

---

## Example 2

```java
String name = "Sandeep";

System.out.println(name instanceof Object);
```

Java asks:

```text
Is "Sandeep" an Object?
```

Answer:

```text
Yes
```

Because every object in Java comes from `Object`.

Output:

```text
true
```

---

# Real-Life Analogy

Suppose:

```text
Animal
  ↑
 Dog
```

A Dog is also an Animal.

Just like:

```text
Car
  ↑
 BMW
```

A BMW is also a Car.

---

## Example

```java
class Animal {
}

class Dog extends Animal {
}

Dog d = new Dog();
```

Now:

```java
System.out.println(d instanceof Dog);
```

Java asks:

```text
Is d a Dog?
```

Answer:

```text
Yes
```

Output:

```text
true
```

---

Now:

```java
System.out.println(d instanceof Animal);
```

Java asks:

```text
Is d an Animal?
```

Answer:

```text
Yes
```

Because Dog extends Animal.

Output:

```text
true
```

---

# Visual Understanding

```text
Animal
   ↑
  Dog
```

Object created:

```java
Dog d = new Dog();
```

Questions:

```text
Is d a Dog?      → true
Is d an Animal?  → true
```

---

# Most Important Example

```java
Animal a = new Dog();
```

This confuses many beginners.

---

## What is the Reference?

```java
Animal a
```

Reference type = Animal

---

## What is the Actual Object?

```java
new Dog()
```

Actual object = Dog

---

Now:

```java
System.out.println(a instanceof Dog);
```

Java checks:

```text
What object was actually created?
```

Answer:

```text
Dog
```

So output:

```text
true
```

---

# Why Do We Use `instanceof`?

Before type casting.

Example:

```java
Object obj = "Hello";
```

Suppose we want to convert:

```java
String str = (String) obj;
```

Before casting, we check:

```java
if(obj instanceof String) {
    String str = (String) obj;
}
```

Meaning:

```text
Only cast if obj is really a String.
```

---

# One-Line Definition for Notes

```text
instanceof checks whether an object belongs to a particular class, subclass, or interface.
```

---

# Interview Shortcut

Whenever you see:

```java
obj instanceof SomeClass
```

Read it as:

```text
"Is obj a SomeClass object?"
```

That's all `instanceof` does. It returns only:

```text
true
or
false
```

### Small Practice

What will be the output?

```java
String str = "Java";

System.out.println(str instanceof String);
System.out.println(str instanceof Object);
```

Try answering before looking below.

Output:

```text
true
true
```

Because `"Java"` is a String, and every String is also an Object.

