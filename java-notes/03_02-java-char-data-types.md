## char datatype work

# ✅ Your Code

```java
char ch = 'a';
System.out.println(ch);

ch++;
System.out.println(ch);
```

---

# 🔥 Output

```text
a
b
```

---

# ❓ Why does this work on `char`?

👉 Because in Java:

> **`char` is internally stored as a number (Unicode value)**

---

# 🔍 What actually happens

```text
'a' → Unicode value = 97
'b' → Unicode value = 98
```

So your code becomes:

```text
ch = 97
ch++ → 98
```

Then Java converts it back:

```text
98 → 'b'
```

---

# 🧠 Step-by-Step

```java
char ch = 'a';   // 97
ch++;            // 98
System.out.println(ch); // 'b'
```

---

# 🔥 Proof (Try this)

```java
char ch = 'a';

System.out.println((int) ch); // 97
ch++;
System.out.println((int) ch); // 98
```

---

# ✅ Why Java allows this?

Because:

```text
char → numeric type (0 to 65535)
```

It is basically an **unsigned 16-bit integer (Unicode)**.

---

# ⚡ Works with other characters too

```java
char ch = 'A';
ch++;
System.out.println(ch); // B
```

```java
char ch = '9';
ch++;
System.out.println(ch); // :
```

👉 Because:

```text
'9' = 57 → next is 58 → ':'
```

---

# ❗ Important Difference (Other Languages)

You said:

> other languages only allow increment on numbers

✔ Correct for some languages

But in:

* Java ✔
* C ✔
* C++ ✔

👉 `char` is treated as **integer internally**, so increment works.

---

# 💥 Key Concept

> `char` behaves like a number behind the scenes.

---

# 🚀 Interview One-Liner

> In Java, `char` is stored as a Unicode integer value, so increment/decrement operations work on it like numeric types.

---


