## Short Circuit Evaluation in Java

### What does "Short Circuit" mean?

In `||` — Java **stops checking** the rest of the condition **as soon as it finds one `true`**.

Think of it like this:

> "If ANY one condition is true → result is true"
> So why bother checking the rest? ✅ **Stop early = Short Circuit**

---

### Example

```java
int a = 5;
int b = 0;

// Using || (Short Circuit)
if (a > 0 || (10 / b) > 1) {   // a > 0 is TRUE → stops here, never divides by zero!
    System.out.println("Safe!");
}

// Using | (No Short Circuit)
if (a > 0 | (10 / b) > 1) {    // a > 0 is TRUE → but still checks next → CRASH! ArithmeticException
    System.out.println("This crashes!");
}
```

---

### Visual Flow

```
|| (Short Circuit)
┌─────────────┐     ✅ TRUE
│ Condition 1 │ ──────────────→ STOP. Result = true. Skip Condition 2.
└─────────────┘
                     ❌ FALSE
                ──────────────→ Check Condition 2 → decide result


| (No Short Circuit)
┌─────────────┐
│ Condition 1 │ ──→ ALWAYS checks Condition 2 regardless
└─────────────┘
```

---

### Simple Rule to Remember

|                                  | `\|\|`               | `\|`             |
| -------------------------------- | ---------------------|------------------|
| Checks both sides always?        | ❌ No (stops early)  | ✅ Yes (always) |
| Safe with risky code (null, /0)? | ✅ Yes               | ❌ No           |
| Speed                            | ✅ Faster            | 🐢 Slower       |
| Use in real code?                | ✅ Almost always     | ⚠️ Rarely       |

---

### Real Life Analogy 🎯

```
|| → Lazy friend:
"Is it raining OR is it Sunday?"
Checks rain → YES → "I'm staying home" → doesn't even check what day it is 😄

| → Overcautious friend:
Checks rain → YES → still checks what day it is anyway 🙄
```

**In 99% of Java code, always use `||` and `&&`** — they are safer and faster.