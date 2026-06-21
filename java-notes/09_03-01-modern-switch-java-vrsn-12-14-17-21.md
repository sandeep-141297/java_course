# New Features in Java Switch (Java 12, 13, 14+)

If you learned the old switch:

```java
switch(day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;
}
```

Modern Java introduced **Switch Expressions** which are cleaner and safer.

---

# 1. No Need for `break` (Arrow Syntax)

## Old Style

```java
int day = 2;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid");
}
```

---

## New Style

```java
int day = 2;

switch(day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Invalid");
}
```

### Benefits

✅ No `break`

✅ No fall-through bug

✅ Easier to read

---

# 2. Multiple Cases in One Line

## Old Style

```java
switch(day) {
    case 1:
    case 7:
        System.out.println("Weekend");
        break;
}
```

---

## New Style

```java
switch(day) {
    case 1, 7 -> System.out.println("Weekend");
    default -> System.out.println("Weekday");
}
```

Much cleaner.

---

# 3. Switch Can Return a Value

Before Java 14, switch was mostly a statement.

Now it can be an expression.

## Old Way

```java
String dayName;

switch(day) {
    case 1:
        dayName = "Monday";
        break;

    case 2:
        dayName = "Tuesday";
        break;

    default:
        dayName = "Invalid";
}
```

---

## New Way

```java
String dayName = switch(day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};
```

Output:

```text
Tuesday
```

---

# 4. Using `yield`

When a case needs multiple lines.

## Example

```java
String result = switch(day) {

    case 1 -> {
        System.out.println("Processing...");
        yield "Monday";
    }

    case 2 -> {
        System.out.println("Processing...");
        yield "Tuesday";
    }

    default -> "Invalid";
};
```

---

## What is `yield`?

Think:

```text
return for switch
```

Just like methods use:

```java
return value;
```

Switch expressions use:

```java
yield value;
```

---

# 5. No Fall-Through Problem

## Old Switch

```java
int day = 1;

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
Monday
Tuesday
Wednesday
```

Bug caused by missing `break`.

---

## New Switch

```java
switch(day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
}
```

Output:

```text
Monday
```

No accidental fall-through.

---

# 6. Switch with String (Modern Style)

```java
String role = "Admin";

String access = switch(role) {
    case "Admin" -> "Full Access";
    case "User" -> "Limited Access";
    default -> "No Access";
};

System.out.println(access);
```

Output:

```text
Full Access
```

---

# 7. Switch with Enum (Very Common)

```java
enum Status {
    NEW,
    IN_PROGRESS,
    COMPLETED
}
```

```java
Status status = Status.NEW;

String message = switch(status) {
    case NEW -> "Task Created";
    case IN_PROGRESS -> "Task Running";
    case COMPLETED -> "Task Finished";
};

System.out.println(message);
```

---

# Old vs New Comparison

## Old

```java
String result;

switch(day) {

    case 1:
        result = "Monday";
        break;

    case 2:
        result = "Tuesday";
        break;

    default:
        result = "Invalid";
}
```

---

## New

```java
String result = switch(day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};
```

Much shorter.

---

# When to Use Modern Switch?

Use modern switch when:

✅ One variable

✅ Fixed values

✅ Need to return a value

✅ Want cleaner code

Example:

```java
String role = switch(userRole) {
    case "ADMIN" -> "Full Access";
    case "USER" -> "Limited Access";
    default -> "Unknown";
};
```

---

# When to Use If-Else Instead?

Still use `if-else` for conditions like:

```java
if(age >= 18)
```

```java
if(salary > 50000)
```

```java
if(marks >= 90)
```

Because switch cannot directly evaluate ranges and comparison operators.

---

# Interview Questions

### Q1: Is `break` required in modern switch?

**No**, with arrow syntax (`->`).

```java
case 1 -> System.out.println("Monday");
```

No break needed.

---

### Q2: What is `yield`?

Used to return a value from a multi-line switch case.

```java
yield "Monday";
```

---

### Q3: What problem does modern switch solve?

It removes:

* Missing `break` bugs
* Fall-through issues
* Repeated variable assignments
* Verbose code

---

# Quick Revision

| Feature           | Old Switch | New Switch      |
| ----------------- | ---------- | --------------- |
| `break` needed    | Yes        | No              |
| Fall-through bug  | Yes        | No              |
| Return value      | Difficult  | Easy            |
| Multiple cases    | Verbose    | `case 1,2,3 ->` |
| Multi-line return | N/A        | `yield`         |

---

### Most Common Modern Interview Example

```java
int day = 2;

String result = switch(day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid";
};

System.out.println(result);
```

This is the switch syntax you will see most often in modern Java (Java 17/21).
