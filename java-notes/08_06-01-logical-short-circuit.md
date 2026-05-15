## Short Circuit: `&&` vs `&` and `||` vs `|`

---

### `&&` (Short Circuit AND)

Java **stops checking** as soon as it finds one `false`.

> "BOTH must be true → if first is FALSE, why check second? Result is already false!"

```java
int a = -5;
int b = 0;

// Using && (Short Circuit)
if (a > 0 && (10 / b) > 1) {   // a > 0 is FALSE → stops here, never divides by zero!
    System.out.println("Safe!");
}

// Using & (No Short Circuit)
if (a > 0 & (10 / b) > 1) {    // a > 0 is FALSE → but still checks next → CRASH!
    System.out.println("This crashes!");
}
```

---

### `||` (Short Circuit OR)

Java **stops checking** as soon as it finds one `true`.

> "ANY one must be true → if first is TRUE, why check second? Result is already true!"

```java
int a = 5;
int b = 0;

// Using || (Short Circuit)
if (a > 0 || (10 / b) > 1) {   // a > 0 is TRUE → stops here, never divides by zero!
    System.out.println("Safe!");
}

// Using | (No Short Circuit)
if (a > 0 | (10 / b) > 1) {    // a > 0 is TRUE → but still checks next → CRASH!
    System.out.println("This crashes!");
}
```

---

### Visual Flow

```
&& (Short Circuit AND)
┌─────────────┐    ❌ FALSE
│ Condition 1 │ ──────────────→ STOP. Result = false. Skip Condition 2.
└─────────────┘
                    ✅ TRUE
               ──────────────→ Check Condition 2 → decide result


& (No Short Circuit AND)
┌─────────────┐
│ Condition 1 │ ──→ ALWAYS checks Condition 2 regardless
└─────────────┘


|| (Short Circuit OR)
┌─────────────┐    ✅ TRUE
│ Condition 1 │ ──────────────→ STOP. Result = true. Skip Condition 2.
└─────────────┘
                    ❌ FALSE
               ──────────────→ Check Condition 2 → decide result


| (No Short Circuit OR)
┌─────────────┐
│ Condition 1 │ ──→ ALWAYS checks Condition 2 regardless
└─────────────┘
```

---

### Full Comparison Table

| | `&&`                | `&`               | `\|\|`      | `\|`             |            |
|---                    |---                |---          |---               |---         |
| Full name             | Short Circuit AND | Bitwise AND | Short Circuit OR | Bitwise OR |
| Stops early?          | ✅ Yes (on FALSE) | ❌ No      | ✅ Yes (on TRUE) | ❌ No     |
| Safe with risky code? | ✅ Yes            | ❌ No      | ✅ Yes           | ❌ No     |
| Speed                 | ✅ Faster         | 🐢 Slower  | ✅ Faster        | 🐢 Slower |
| Use in real code?     | ✅ Always         | ⚠️ Rarely  | ✅ Always        | ⚠️ Rarely |

---

### Memory Trick 🧠

```
&&  → Lazy AND → "First is false? I'm done. Not checking anything else."
&   → Workaholic AND → "I check EVERYTHING no matter what."

||  → Lazy OR  → "First is true? I'm done. Not checking anything else."
|   → Workaholic OR  → "I check EVERYTHING no matter what."
```

---

### When to use `&` and `|`? ⚠️

Only when you **need both sides to always execute** (very rare):

```java
int x = 0;
int y = 0;

// Both x++ and y++ will always run with & and |
if ((x++ > 5) & (y++ > 5)) {
    System.out.println("Both incremented!");
}
System.out.println(x + " " + y); // 1 1 → both ran

// With &&, y++ may NOT run
if ((x++ > 5) && (y++ > 5)) {
    System.out.println("Both incremented?");
}
System.out.println(x + " " + y); // 2 1 → y++ skipped!
```

**In 99% of Java code → always use `&&` and `||`** ✅