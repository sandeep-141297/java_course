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

|  `&&`                 | `&`               | `\|\|`      | `\|`             |            |
|-----------------------|-------------------|-------------|------------------|------------|
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

---

# 🚀 Interview
### Important Understanding

Great question! Let me clear this up.

---

### `&&` stops at the **FIRST FALSE** it finds

```java
if (cond1 && cond2 && cond3)
```

```
cond1 → TRUE  → keep checking...
cond2 → FALSE → STOP! ❌ Never checks cond3
cond3 → never reached
```

---

### Real Example

```java
int a = 5;   // a > 0   → TRUE
int b = 0;   // 10/b    → would CRASH (divide by zero)
int c = 10;  // c > 5   → TRUE

if (a > 0 && (10 / b) > 1 && c > 5) {
//  TRUE  &&   CRASH❌  &&  never checked
//           STOPS HERE
}
```

---

### All Cases with 3 Conditions (`&&`)

```
TRUE  && TRUE  && TRUE   → checks all 3  → true  ✅
TRUE  && TRUE  && FALSE  → checks all 3  → false ✅
TRUE  && FALSE && TRUE   → stops at 2nd  → false ✅ (3rd never checked)
TRUE  && FALSE && FALSE  → stops at 2nd  → false ✅ (3rd never checked)
FALSE && TRUE  && TRUE   → stops at 1st  → false ✅ (2nd, 3rd never checked)
FALSE && FALSE && TRUE   → stops at 1st  → false ✅ (2nd, 3rd never checked)
FALSE && TRUE  && FALSE  → stops at 1st  → false ✅ (2nd, 3rd never checked)
FALSE && FALSE && FALSE  → stops at 1st  → false ✅ (2nd, 3rd never checked)
```

### Simple Rule 🧠
> `&&` → **Stops at first FALSE** → doesn't matter what comes after

---

### Same for `||` → Stops at first TRUE

```
FALSE || FALSE || TRUE  → checks all 3  → true  ✅
FALSE || TRUE  || FALSE → stops at 2nd  → true  ✅ (3rd never checked)
TRUE  || FALSE || TRUE  → stops at 1st  → true  ✅ (2nd, 3rd never checked)
```

> `||` → **Stops at first TRUE** → doesn't matter what comes after