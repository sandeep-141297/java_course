# Conditional Statements in Java

Conditional statements are used to make decisions in a program.

They check a condition (`true` or `false`) and execute different code based on the result.

---

# Real Life Example

Imagine a security guard checking age before allowing entry.

```text
If age >= 18
    Allow entry
Else
    Do not allow
```

Same concept in Java.

---

# Simple Diagram

```text
           Start
              |
      Check Condition
              |
        true / \ false
            /   \
      Run Code1  Run Code2
            \   /
             End
```

---

# Types of Conditional Statements in Java

| Statement    | Purpose                            |
| ------------ | ---------------------------------- |
| `if`         | Run code only if condition is true |
| `if-else`    | Choose between two options         |
| `if-else-if` | Check multiple conditions          |
| `switch`     | Select one option from many        |

---

# 1. if Statement

Runs code only when condition is true.

## Syntax

```java
if(condition) {
    // code
}
```

## Example

```java
int age = 20;

if(age >= 18) {
    System.out.println("You can vote");
}
```

## Output

```text
You can vote
```

---

# Flow Diagram of if

```text
        Start
          |
    age >= 18 ?
        |
     Yes/No
      /   \
Print    Skip
      \   /
        End
```

---

# 2. if-else Statement

Used when there are two choices.

## Syntax

```java
if(condition) {
    // code if true
} else {
    // code if false
}
```

## Real Life Example

If it rains → take umbrella
Else → wear sunglasses

## Java Example

```java
boolean isRaining = true;

if(isRaining) {
    System.out.println("Take umbrella");
} else {
    System.out.println("Wear sunglasses");
}
```

## Output

```text
Take umbrella
```

---

# Flow Diagram of if-else

```text
            Start
               |
       isRaining ?
          /     \
       true    false
        |         |
 Take umbrella  Wear sunglasses
        \         /
             End
```

---

# 3. if-else-if Ladder

Used when checking multiple conditions.

## Syntax

```java
if(condition1) {

} else if(condition2) {

} else {

}
```

---

# Real Life Example

Student Grades

```text
90+  -> Grade A
75+  -> Grade B
50+  -> Grade C
Else -> Fail
```

## Java Example

```java
int marks = 82;

if(marks >= 90) {
    System.out.println("Grade A");
}
else if(marks >= 75) {
    System.out.println("Grade B");
}
else if(marks >= 50) {
    System.out.println("Grade C");
}
else {
    System.out.println("Fail");
}
```

## Output

```text
Grade B
```

---

# Diagram of if-else-if

```text
               Start
                  |
            marks >= 90 ?
              /      \
           Yes       No
           |          |
        Grade A   marks >= 75 ?
                     /      \
                  Yes       No
                  |          |
               Grade B   marks >= 50 ?
                              /    \
                           Yes     No
                           |        |
                        Grade C    Fail
```

---

# 4. switch Statement

Used when many fixed options exist.

Better than many `else if` in some cases.

---

# Real Life Example

Press button for drink:

```text
1 -> Tea
2 -> Coffee
3 -> Juice
```

---

# Syntax

```java
switch(value) {
    case 1:
        // code
        break;

    case 2:
        // code
        break;

    default:
        // code
}
```

---

# Java Example

```java
int day = 2;

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
        System.out.println("Invalid day");
}
```

## Output

```text
Tuesday
```

---

# switch Flow Diagram

```text
           Start
              |
          Check value
      /      |       \
   case1   case2   default
      |       |        |
   Code1   Code2    Code3
      \       |       /
               End
```

---

# Important Points

| Point            | Description               |
| ---------------- | ------------------------- |
| Condition result | Must be `true` or `false` |
| `if`             | Single condition          |
| `if-else`        | Two choices               |
| `if-else-if`     | Multiple conditions       |
| `switch`         | Fixed values/options      |
| `break`          | Stops switch execution    |

---

# Difference Between if-else and switch

| if-else                     | switch                   |
| --------------------------- | ------------------------ |
| Used for ranges             | Used for fixed values    |
| Supports logical conditions | Checks exact values      |
| Slower for many conditions  | Cleaner for many options |

---

# Simple Daily Life Examples

| Situation            | Conditional Statement |
| -------------------- | --------------------- |
| ATM PIN check        | `if-else`             |
| Traffic signal       | `switch`              |
| Exam result          | `if-else-if`          |
| Login authentication | `if`                  |

---

# Small Program Combining Everything

```java
public class Main {

    public static void main(String[] args) {

        int temperature = 35;

        if(temperature > 40) {
            System.out.println("Very Hot");
        }
        else if(temperature > 30) {
            System.out.println("Hot");
        }
        else if(temperature > 20) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Cold");
        }
    }
}
```

## Output

```text
Hot
```
