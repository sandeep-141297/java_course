# Java Logical Operators – Complete Notes

## What are Logical Operators in Java?

Logical operators are used to combine multiple conditions.

They mainly work with:

```java id="d7k4qp"
boolean
```

values.

Logical operators return:

```java id="j8mz2r"
true
```

or

```java id="m3pt7v"
false
```

---

# Types of Logical Operators in Java

| Operator | Name        |
| -------- | ----------- |
| `&&`     | Logical AND |
| `\|\|`   | Logical OR  |
| `!`      | Logical NOT |

---

# 1. Logical AND (`&&`)

## Meaning

Returns `true` only if BOTH conditions are true.

---

# Truth Table

| Condition 1 | Condition 2 | Result |
| ----------- | ----------- | ------ |
| true        | true        | true   |
| true        | false       | false  |
| false       | true        | false  |
| false       | false       | false  |

---

# Example 1

```java id="k9t2pw"
public class Main {

    public static void main(String[] args) {

        int age = 20;

        System.out.println(age > 18 && age < 30);
    }
}
```

---

# Output

```java id="r4xq8m"
true
```

---

# Explanation

Condition 1:

```java id="f6mq2u"
20 > 18 = true
```

Condition 2:

```java id="y2kt8n"
20 < 30 = true
```

Final:

```java id="n4pw6s"
true && true = true
```

---

# Example 2

```java id="v8cr5u"
int num = 10;

System.out.println(num > 5 && num > 20);
```

---

# Output

```java id="t3ok9x"
false
```

---

# Explanation

```java id="y9uq1m"
10 > 5 = true
10 > 20 = false
```

Final:

```java id="o6mz4w"
true && false = false
```

---

# Real-Life Example

```java id="x7qm3r"
boolean hasID = true;
boolean hasTicket = true;

System.out.println(hasID && hasTicket);
```

Output:

```java id="n2vw5p"
true
```

Because both are required.

---

# 2. Logical OR (`||`)

## Meaning

Returns `true` if AT LEAST ONE condition is true.

---

# Truth Table

| Condition 1 | Condition 2 | Result |
| ----------- | ----------- | ------ |
| true        | true        | true   |
| true        | false       | true   |
| false       | true        | true   |
| false       | false       | false  |

---

# Example 1

```java id="z6pt1v"
public class Main {

    public static void main(String[] args) {

        int marks = 35;

        System.out.println(marks > 40 || marks == 35);
    }
}
```

---

# Output

```java id="u5wr8n"
true
```

---

# Explanation

```java id="g8tx2k"
35 > 40 = false
35 == 35 = true
```

Final:

```java id="d9qy4m"
false || true = true
```

---

# Example 2

```java id="o3pk8v"
int num = 10;

System.out.println(num < 5 || num > 20);
```

---

# Output

```java id="f2mr7x"
false
```

Because both conditions are false.

---

# Real-Life Example

```java id="n8qy3w"
boolean loginWithEmail = false;
boolean loginWithMobile = true;

System.out.println(loginWithEmail || loginWithMobile);
```

---

# Output

```java id="s5kt2m"
true
```

Because at least one login method worked.

---

# 3. Logical NOT (`!`)

## Meaning

Reverses boolean value.

| Original | Result |
| -------- | ------ |
| true     | false  |
| false    | true   |

---

# Example 1

```java id="m2vx8q"
public class Main {

    public static void main(String[] args) {

        boolean isJavaEasy = true;

        System.out.println(!isJavaEasy);
    }
}
```

---

# Output

```java id="k7tp4w"
false
```

---

# Explanation

```java id="u3rx9m"
!true = false
```

---

# Example 2

```java id="d8kt1p"
boolean isRainy = false;

System.out.println(!isRainy);
```

---

# Output

```java id="r6pm2x"
true
```

---

# Combined Logical Operators

## Example

```java id="p7vx4u"
int age = 25;
int salary = 40000;

System.out.println(age > 18 && salary > 30000);
```

---

# Output

```java id="n4qt8w"
true
```

---

# Example with OR and AND

```java id="h5mr2u"
int marks = 70;
boolean sportsQuota = false;

System.out.println(marks > 80 || sportsQuota);
```

---

# Output

```java id="u2wx9r"
false
```

---

# Logical Operators with `if`

## Example

```java id="k9rz5m"
public class Main {

    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        if(age >= 18 && hasLicense) {
            System.out.println("Can drive");
        }
    }
}
```

---

# Output

```java id="x7mq4p"
Can drive
```

---

# Short Circuit Concept

Very Important in Java.

---

# 1. Short Circuit AND (`&&`)

If first condition is false,

Java DOES NOT check second condition.

---

# Example

```java id="p3kt8v"
int a = 10;

System.out.println(a < 5 && a++ > 2);

System.out.println(a);
```

---

# Output

```java id="n8wr2m"
false
10
```

---

# Why?

First condition:

```java id="r2qt7x"
10 < 5 = false
```

Now result can NEVER become true.

So Java skips:

```java id="u6pm4k"
a++ > 2
```

Therefore:

```java id="q5vx8w"
a remains 10
```

---

# 2. Short Circuit OR (`||`)

If first condition is true,

Java DOES NOT check second condition.

---

# Example

```java id="f9tr2m"
int a = 10;

System.out.println(a > 5 || a++ > 20);

System.out.println(a);
```

---

# Output

```java id="m7qx4u"
true
10
```

---

# Why?

First condition:

```java id="t3pw8n"
10 > 5 = true
```

Now result is already true.

So Java skips second condition.

---

# Difference Between `&&` and `&`

| `&&`                      | `&`               |
| ------------------------- | ----------------- |
| Short circuit             | No short circuit  |
| Faster                    | Slower            |
| Mostly used in conditions | Bitwise + logical |

---

# Example

```java id="x4rt9m"
int a = 10;

System.out.println(a < 5 & a++ > 2);

System.out.println(a);
```

---

# Output

```java id="d7vx3q"
false
11
```

---

# Why?

Because single `&` checks BOTH conditions always.

So:

```java id="m5tp8u"
a++
```

executed.

---

# Difference Between `||` and `|`

| `\|\|`        | `\|`                 |
|---------------|----------------------|
| Short circuit | No short circuit     |
| Logical OR    | Bitwise OR + logical |

---

# Operator Precedence

| Priority | Operators |
| -------- | --------- |
| Highest  | `!`       |
| Lower    | `&&`      |
| Lower    | `\|\|`    |

---

# Example

```java id="w9pt4m"
boolean result = true || false && false;
```

---

# Execution

First AND:

```java id="m4vx7u"
false && false = false
```

Then OR:

```java id="p6qt2w"
true || false = true
```

---

# Output

```java id="k2wr8x"
true
```

---

# Important Doubts and Interview Questions

---

# Q1. Why logical operators return boolean?

Because they compare conditions.

Conditions only have two results:

```java id="o8mq5r"
true or false
```

---

# Q2. Can logical operators work with int?

❌ No directly.

Wrong:

```java id="y6pt2n"
10 && 20
```

Java gives error.

---

# Correct

```java id="m9qx4u"
10 > 5 && 20 > 10
```

---

# Q3. Why use `&&` instead of `&`?

Because:

```java id="v2rt8m"
&&
```

is faster due to short circuit.

---

# Q4. Which operator has highest priority?

```java id="d4pw7u"
!
```

Logical NOT has highest precedence.

---

# Q5. What is short circuit evaluation?

Java stops checking remaining conditions when final result is already decided.

---

# Q6. Can we combine multiple conditions?

✅ Yes

Example:

```java id="n7qx3w"
int age = 25;
boolean citizen = true;
boolean hasID = true;

System.out.println(age >= 18 && citizen && hasID);
```

---

# Output

```java id="u9mr4p"
true
```

---

# Final Quick Revision Table

| Operator | Meaning | Example         | Result  |
| -------- | ------- | --------------- | ------- |
| `&&`     | AND     | `true && false` | `false` |
| `\|\|`   | OR      | `true || false` | `true`  |
| `!`      | NOT     | `!true`         | `false` |

---

# Easy Trick to Remember

| Operator | Trick             | 
| -------- | ----------------- |
| `&&`     | BOTH must be true | 
| `\|\|`   | ANY one true      |
| `!`      | Opposite/reverse  | 
