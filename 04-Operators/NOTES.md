## **1. Arithmetic Operators**

Arithmetic operators in Java are used to perform basic mathematical operations such as addition, subtraction, multiplication, division, and modulus.

### **List of Arithmetic Operators:**
| Operator | Description           | Example       |
|----------|-----------------------|---------------|
| `+`      | Addition              | `x + y`       |
| `-`      | Subtraction           | `x - y`       |
| `*`      | Multiplication        | `x * y`       |
| `/`      | Division              | `x / y`       |
| `%`      | Modulus (Remainder)   | `x % y`       |
| `++`     | Increment (Unary Plus)| `x++`         |
| `--`     | Decrement (Unary Minus)| `y--`        |

### **Example of Arithmetic Operators:**

```java
class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 10, y = 9;

        int number = x + y; // Addition
        System.out.println("\nAddition: " + number);

        x++; // Increment (Unary Plus)
        number = x - y; // Subtraction
        System.out.println("Subtraction: " + number);

        y--; // Decrement (Unary Minus)
        number = x * y; // Multiplication
        System.out.println("Multiplication: " + number);

        number = x / y; // Division
        System.out.println("Division: " + number);

        number = x % y; // Modulus
        System.out.println("Modulus: " + number);
    }
}
```

### **Explanation:**
- **Addition (`+`)** adds two operands.
- **Subtraction (`-`)** subtracts the second operand from the first.
- **Multiplication (`*`)** multiplies two operands.
- **Division (`/`)** divides the first operand by the second, returning the quotient.
- **Modulus (`%`)** gives the remainder of the division.
- **Increment (`++`)** increases the value by 1.
- **Decrement (`--`)** decreases the value by 1.

---

## **2. Relational Operators**

Relational operators compare two values and return a boolean result (`true` or `false`). They are used to establish a relationship between two operands.

### **List of Relational Operators:**
| Operator | Description                  | Example   |
|----------|------------------------------|-----------|
| `>`      | Greater than                 | `x > y`   |
| `<`      | Less than                    | `x < y`   |
| `>=`     | Greater than or equal to     | `x >= y`  |
| `<=`     | Less than or equal to        | `x <= y`  |
| `==`     | Equal to                     | `x == y`  |
| `!=`     | Not equal to                 | `x != y`  |

### **Example of Relational Operators:**

```java
package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 9, y = 8;

        boolean result = x > y; // Greater than
        System.out.println("\nx>y: " + result);

        result = x < y; // Less than
        System.out.println("x<y: " + result);

        result = x >= y; // Greater than or equal to
        System.out.println("x>=y: " + result);

        result = x <= y; // Less than or equal to
        System.out.println("x<=y: " + result);

        result = x == y; // Equal to
        System.out.println("x==y: " + result);

        result = x != y; // Not equal to
        System.out.println("x!=y: " + result);
    }
}
```

### **Explanation:**
- **Greater than (`>`)** checks if the left operand is greater than the right.
- **Less than (`<`)** checks if the left operand is smaller.
- **Greater than or equal to (`>=`)** checks if the left operand is greater or equal.
- **Less than or equal to (`<=`)** checks if the left operand is smaller or equal.
- **Equal to (`==`)** checks if both operands are equal.
- **Not equal to (`!=`)** checks if both operands are not equal.

---

## **3. Conditional (Logical) Operators**

Conditional operators are used to combine multiple conditions. They include logical AND (`&&`), logical OR (`||`), and logical NOT (`!`).

### **List of Conditional Operators:**
| Operator | Description      | Example      |
|----------|------------------|--------------|
| `&&`     | Logical AND       | `x > y && x < z` |
| `||`     | Logical OR        | `x > y || x < z` |
| `!`      | Logical NOT       | `!(x > y)`       |

### **Example of Conditional Operators:**

```java
class ConditionalOperators {
    public static void main(String[] args) {
        int x = 9, y = 8;

        boolean result = (x > y && x < y); // Logical AND
        System.out.println("\nx>y and x<y: " + result);

        result = (x > y || x < y); // Logical OR
        System.out.println("x>y or x<y: " + result);

        result = !(x > y); // Logical NOT
        System.out.println("Not x>y: " + result);
    }
}
```

### **Explanation:**
- **Logical AND (`&&`)** returns `true` if both conditions are true.
- **Logical OR (`||`)** returns `true` if either of the conditions is true.
- **Logical NOT (`!`)** negates the condition (i.e., returns `true` if the condition is false and vice versa).

---

## **4. Ternary Operator**

The ternary operator is a shorthand for the `if-else` statement. It takes three operands and has the form:  
**condition ? expression1 : expression2**  
If the condition is `true`, it returns `expression1`; otherwise, it returns `expression2`.

### **Example of Ternary Operator:**

```java
class TernaryOperator {
    public static void main(String[] args) {
        int x = 10, y = 19, max;
        max = x >= y ? x : y; // Ternary operator
        System.out.println("Bigger number is: " + max);
    }
}
```

### **Explanation:**
- **Ternary operator** checks if the condition `x >= y` is true. If true, it returns `x`; otherwise, it returns `y`.
