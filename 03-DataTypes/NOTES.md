## **1. Data Types in Java**

Data types define the size and type of values that can be stored in a variable. Java is a statically-typed language, meaning each variable must be declared with a data type before use. There are two types of data types in Java:
- **Primitive Data Types**
- **Non-Primitive Data Types (Reference Types)**

### **Primitive Data Types:**
Java has 8 primitive data types, each of which serves different purposes:

1. **Integer Types:**
   - **byte**: 1 byte (8 bits) – stores whole numbers from **-128** to **127**.
   - **short**: 2 bytes (16 bits) – stores whole numbers from **-32,768** to **32,767**.
   - **int**: 4 bytes (32 bits) – stores whole numbers from **-2,147,483,648** to **2,147,483,647**.
   - **long**: 8 bytes (64 bits) – stores whole numbers from **-9,223,372,036,854,775,808** to **9,223,372,036,854,775,807**.

2. **Floating-Point Types (Decimal Numbers):**
   - **float**: 4 bytes (32 bits) – stores fractional numbers, accurate to about 6-7 decimal digits.  
     Example: `3.142F`
   - **double**: 8 bytes (64 bits) – stores fractional numbers, accurate to about 15-16 decimal digits.  
     Example: `3.142`

3. **Character Type:**
   - **char**: 2 bytes (16 bits) – stores a single character using Unicode.  
     Example: `'a'`, `'\n'`, `'\u00A9'` (Unicode for ©)

4. **Boolean Type:**
   - **boolean**: 1 bit – stores either `true` or `false`.  
     Example: `true`, `false`

### **Example of Primitive Data Types:**

```java
class DataTypes {
    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 1000000; // -2,147,483,648 to 2,147,483,647
        long aLargeNumber = 1000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // decimal types
        double aDouble = 3.142; // Double precision floating-point number
        float aFloat = 3.142F; // Single precision floating-point number

        // boolean type
        boolean isWeekend = false; // true or false

        // character type
        char aCharacter = 'a';
        char newLineCharacter = '\n';
        char copyrightSymbol = '\u00A9'; // Unicode for copyright symbol

        System.out.println("This is copyright symbol: " + copyrightSymbol);
    }
}
```

### **Key Points:**
- **Integers (byte, short, int, long)** store whole numbers.
- **Floats and Doubles** store decimal numbers. `double` has higher precision than `float`.
- **char** stores a single character or Unicode values.
- **boolean** stores a logical value, either `true` or `false`.

---

## **2. Type Casting in Java**

Type casting is converting one data type into another. There are two types of type casting in Java:
1. **Implicit Casting (Widening Conversion)**:  
   Automatically converts a smaller data type to a larger one.  
   Example: `byte → short → int → long → float → double`

2. **Explicit Casting (Narrowing Conversion)**:  
   Requires manual conversion when converting a larger data type to a smaller one.  
   Example: `double → float → long → int → short → byte`

### **Example of Type Casting:**

```java
class TypeCasting {
    public static void main(String[] args) {
        // Implicit Conversion
        byte numByte = 127;
        int intNumber = numByte; // Byte to Int Conversion (Implicit)
        System.out.println("Byte to Int Number: " +  intNumber);

        // Explicit Conversion
        intNumber = 258;
        numByte = (byte) intNumber; // Int to Byte Conversion (Explicit)
        System.out.println("Int to Byte: " + numByte); // (byte)(258 % 256) = 2

        // Float to Int (Explicit)
        float numFloat = 5.6f;
        intNumber = (int) numFloat; // Casting Float to Int
        System.out.println("Float to Int Number: " + intNumber); // Removes decimal

        // Type Promotion in Expressions
        numByte = 10;
        byte anotherNumberByte = 30;
        intNumber = numByte * anotherNumberByte; // Type Promotion (byte to int)
        System.out.println("Promoted Number: " + intNumber); // Result exceeds byte range, promoted to int
    }
}
```

### **Explanation:**

1. **Implicit Casting (Widening Conversion)**:  
   ```java
   int intNumber = numByte;
   ```
   In this case, `byte` is automatically converted to `int`. This is a **safe conversion** because the range of `int` is larger than `byte`, so no data loss occurs.

2. **Explicit Casting (Narrowing Conversion)**:  
   ```java
   numByte = (byte) intNumber;
   ```
   Here, `int` is explicitly cast to `byte`. Since the `int` value (258) is larger than what `byte` can hold (-128 to 127), the value is truncated and wraps around. Thus, `258 % 256 = 2`, so the result is `2`.

3. **Casting `float` to `int`**:  
   ```java
   intNumber = (int) numFloat;
   ```
   Casting from `float` to `int` truncates the decimal part, meaning `5.6f` becomes `5`.

4. **Type Promotion in Expressions**:  
   ```java
   intNumber = numByte * anotherNumberByte;
   ```
   In arithmetic expressions involving smaller data types like `byte`, `short`, and `char`, Java promotes them to `int` to avoid overflow issues. The result of `10 * 30` exceeds the `byte` range, so it's promoted to `int`.

### **Key Points:**
- **Implicit casting** is automatic when converting from a smaller to a larger data type.
- **Explicit casting** is needed when converting from a larger to a smaller data type, which may lead to data loss.
- **Type promotion** occurs in expressions where smaller types are promoted to `int` or larger types to avoid overflow.
