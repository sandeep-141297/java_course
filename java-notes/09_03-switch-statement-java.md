# Switch Statement in Java (Easy Notes)

## What is a Switch Statement?

A `switch` statement is used when you have **one variable** and want to compare it against **multiple fixed values**.

Instead of writing many `if-else if` conditions, you can use `switch`.

---

# Real-Life Example

Suppose a user enters:

```text
1 = Monday
2 = Tuesday
3 = Wednesday
```

Using `if-else`:

```java
if(day == 1) {
    System.out.println("Monday");
} else if(day == 2) {
    System.out.println("Tuesday");
} else if(day == 3) {
    System.out.println("Wednesday");
} else {
    System.out.println("Invalid Day");
}
```

---

Using `switch`:

```java
switch(day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

---

# Syntax

```java
switch(expression) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

---

# How Switch Works

Example:

```java
int day = 2;
```

Java checks:

```text
Is day = 1 ? No
Is day = 2 ? Yes
```

Then executes:

```java
System.out.println("Tuesday");
```

Output:

```text
Tuesday
```

---

# What is `break`?

`break` stops the switch after finding a match.

Example:

```java
int day = 2;

switch(day) {
    case 1:
        System.out.println("Monday");

    case 2:
        System.out.println("Tuesday");

    case 3:
        System.out.println("Wednesday");
}
```

Output:

```text
Tuesday
Wednesday
```

Why?

Because without `break`, Java continues executing the next cases.

This is called:

```text
Fall Through
```

---

# Correct Version

```java
switch(day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;
}
```

Output:

```text
Tuesday
```

---

# What is `default`?

`default` works like `else`.

Example:

```java
int day = 10;

switch(day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

Output:

```text
Invalid Day
```

---

# Switch with String

```java
String role = "Admin";

switch(role) {

    case "Admin":
        System.out.println("Full Access");
        break;

    case "User":
        System.out.println("Limited Access");
        break;

    default:
        System.out.println("Unknown Role");
}
```

Output:

```text
Full Access
```

---

# When Should We Use Switch?

Use `switch` when:

✅ One variable

✅ Many fixed values

Example:

```java
day = 1,2,3,4,5,6,7
```

```java
month = "Jan","Feb","Mar"
```

```java
role = "Admin","User","Manager"
```

---

# When NOT to Use Switch?

Example:

```java
if(age >= 18)
```

Switch cannot handle:

```java
>=
<=
>
<
```

So use `if-else`.

---

# Switch vs If-Else

## Good for Switch

```java
int day = 2;

switch(day) {
    case 1:
    case 2:
    case 3:
}
```

Because checking exact values.

---

## Good for If-Else

```java
if(age >= 18)
```

Because checking conditions.

---

# Ternary vs If-Else vs Switch

## Ternary Operator

Best for:

```java
(num % 2 == 0) ? "Even" : "Odd";
```

Simple True/False decision.

---

## If-Else

Best for:

```java
if(age >= 18)
```

Complex conditions.

```java
if(age >= 18 && salary > 30000)
```

---

## Switch

Best for:

```java
switch(day)
```

Many fixed values.

---

# Easy Comparison Table

| Use Case                  | Best Choice |
| ------------------------- | ----------- |
| True / False              | Ternary     |
| Range Check (`>=`, `<`)   | If-Else     |
| Multiple Fixed Values     | Switch      |
| Complex Conditions        | If-Else     |
| One Variable Many Options | Switch      |

---

# Example 1: Ternary

```java
int age = 20;

String result =
        (age >= 18)
        ? "Adult"
        : "Minor";
```

Output:

```text
Adult
```

---

# Example 2: If-Else

```java
int marks = 75;

if(marks >= 90) {
    System.out.println("A");
}
else if(marks >= 75) {
    System.out.println("B");
}
else {
    System.out.println("C");
}
```

Output:

```text
B
```

---

# Example 3: Switch

```java
int month = 2;

switch(month) {

    case 1:
        System.out.println("January");
        break;

    case 2:
        System.out.println("February");
        break;

    case 3:
        System.out.println("March");
        break;

    default:
        System.out.println("Invalid Month");
}
```

Output:

```text
February
```

---

# Interview Question

### Can Switch Replace If-Else?

**No.**

Because switch checks:

```text
Exact values only
```

Example:

```java
case 1:
case 2:
```

But switch cannot directly check:

```java
age > 18
salary >= 50000
marks < 40
```

For these, use `if-else`.

---

# Easy Memory Trick

```text
Ternary  -> Simple True/False

If-Else  -> Conditions and Ranges

Switch   -> One Variable, Many Fixed Values
```

---

# Complete Example

```java
public class SwitchDemo {

    public static void main(String[] args) {

        int day = 3;

        switch(day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
```

Output:

```text
Wednesday
```

---


