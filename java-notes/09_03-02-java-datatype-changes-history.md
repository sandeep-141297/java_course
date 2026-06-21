# Ques = before java 5 only integer support after that string support?

Yes. In **older Java versions**, `switch` supported only a few data types. Support increased over time.

### Before Java 5

`switch` supported:

* `byte`
* `short`
* `char`
* `int`

```java
int day = 1;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;
}
```

❌ Not supported:

```java
long l = 10;
switch(l) {}   // Error

String s = "Hello";
switch(s) {}   // Error
```

---

### Java 5 (2004)

Java 5 introduced **Enum** support in `switch`.

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

Day d = Day.MONDAY;

switch(d) {
    case MONDAY:
        System.out.println("Monday");
        break;
}
```

---

### Java 7 (2011)

Java 7 added **String** support in `switch`.

```java
String day = "MONDAY";

switch(day) {
    case "MONDAY":
        System.out.println("Monday");
        break;

    case "TUESDAY":
        System.out.println("Tuesday");
        break;
}
```

Before Java 7, this would give a compile-time error.

---

### Java 14+ (Modern Switch Expression)

New arrow syntax (`->`) and no need for `break`.

```java
String day = "MONDAY";

switch(day) {
    case "MONDAY" -> System.out.println("Monday");
    case "TUESDAY" -> System.out.println("Tuesday");
    default -> System.out.println("Invalid");
}
```

Or return a value:

```java
String result = switch(day) {
    case "MONDAY" -> "Work Day";
    case "SUNDAY" -> "Holiday";
    default -> "Unknown";
};

System.out.println(result);
```

---

### Switch Support Timeline

| Java Version  | Supported Types                        |
| ------------- | -------------------------------------- |
| Before Java 5 | `byte`, `short`, `char`, `int`         |
| Java 5        | Above + `enum`                         |
| Java 7        | Above + `String`                       |
| Java 14+      | New switch expressions (`->`, `yield`) |

### Still NOT Supported

```java
long l = 10L;
switch(l) {}      // Error

float f = 10.5f;
switch(f) {}      // Error

double d = 10.5;
switch(d) {}      // Error

boolean b = true;
switch(b) {}      // Error
```

**Interview Question:** Why is `String` allowed but `long` is not?

Because `String` values can be converted internally to a hash and compared efficiently, while `long`, `float`, and `double` have design/precision considerations and were never added to `switch`.
