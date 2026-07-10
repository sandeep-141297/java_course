# Since `num` is an **instance variable**, Java automatically gives it a **default value**.

```java
class Calculator {

    int num;   // Instance variable

}
```

Here,

```java
num = 0
```

even though you didn't assign a value.

---

## Example

```java
class Calculator {

    int num;

    void display() {
        System.out.println(num);
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.display();

    }
}
```

### Output

```text
0
```

---

# Why?

Because `num` is an **instance variable**.

When you create an object:

```java
Calculator calc = new Calculator();
```

Java automatically initializes all instance variables with default values.

---

# Default Values of Instance Variables

| Data Type                                   | Default Value                        |
| ------------------------------------------- | ------------------------------------ |
| `byte`                                      | `0`                                  |
| `short`                                     | `0`                                  |
| `int`                                       | `0`                                  |
| `long`                                      | `0L`                                 |
| `float`                                     | `0.0f`                               |
| `double`                                    | `0.0`                                |
| `char`                                      | `'\u0000'` (empty Unicode character) |
| `boolean`                                   | `false`                              |
| Reference types (`String`, objects, arrays) | `null`                               |

---

## Example

```java
class Student {

    int age;          // 0
    double marks;     // 0.0
    boolean pass;     // false
    char grade;       // '\u0000'
    String name;      // null
}
```

---

# What About Local Variables?

Local variables **do not get default values**.

```java
class Calculator {

    void display() {

        int num;

        System.out.println(num);   // ❌ Compile-time error

    }
}
```

### Error

```text
variable num might not have been initialized
```

You must initialize it first:

```java
void display() {

    int num = 0;

    System.out.println(num);

}
```

Output:

```text
0
```

---

# Easy Trick to Remember

```text
Instance Variable
        ↓
Java gives a default value automatically.

------------------------------

Local Variable
        ↓
You must assign a value before using it.
```

### Example

```java
class Calculator {

    int num;              // Default value = 0

    void show() {

        int sum = 10;     // Must initialize

    }
}
```

### Interview Answer

**Q: What is the default value of an `int` instance variable?**

**Answer:** `0`.

**Q: What is the default value of a `String` instance variable?**

**Answer:** `null`.

**Q: Do local variables get default values?**

**Answer:** **No.** Local variables must be initialized before they are used.
