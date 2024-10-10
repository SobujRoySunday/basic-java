## **Variables in Java**

### **Introduction to Variables:**
Variables are containers for storing data values. In Java, each variable must be declared with a specific data type that determines the kind of data the variable can hold. Java supports different types of variables based on scope and lifetime.

### **Types of Variables:**
In Java, there are primarily three types of variables:

1. **Instance Variables (Non-static Fields):**
   - Belong to an instance of a class (object).
   - Created when an object of the class is created and destroyed when the object is destroyed.
   - Declared inside a class but outside any method, constructor, or block.
   
2. **Class Variables (Static Fields):**
   - Declared with the `static` keyword.
   - Shared among all instances of a class.
   - Belong to the class, not to any specific object.
   - Initialized only once when the class is loaded into memory.

3. **Local Variables:**
   - Declared inside a method, constructor, or block.
   - Created when the method is called and destroyed when the method exits.
   - Accessible only within the method/block they are declared in.

### **Example: Java Variables**

Here’s a simple example that demonstrates variable declaration and usage, including local and static variables.

```java
class Variables {
    static String organizationName = "FeedFrame"; // class variable declaration

    public static void main(String[] args) {
        String name = "Sorbopriyo Roy"; // local variable declaration
        System.out.println("I am " + name);

        // Re-assigning the local variable
        name = "Sobuj"; // variable re-assignment
        System.out.println("My nickname is " + name);

        // Accessing the static variable
        System.out.println("My organization name is " + organizationName);
    }
}
```

### **Explanation of the Example:**

- **Class Variable (`static`)**:  
  ```java
  static String organizationName = "FeedFrame";
  ```
  This is a **static variable**. It belongs to the class itself rather than to any specific object, meaning that it can be accessed directly without creating an instance of the class. In this case, the `organizationName` is initialized with the value `"FeedFrame"` and remains the same for all instances of the `Variables` class.

- **Local Variable**:  
  ```java
  String name = "Sorbopriyo Roy";
  ```
  This is a **local variable** declared inside the `main` method. It is assigned the value `"Sorbopriyo Roy"`. Local variables are accessible only within the method or block they are declared in.

- **Variable Re-assignment**:  
  ```java
  name = "Sobuj";
  ```
  The local variable `name` is re-assigned with a new value `"Sobuj"`. Variable re-assignment allows the variable to hold different values during execution.

- **Accessing the Class Variable**:  
  ```java
  System.out.println("My organization name is " + organizationName);
  ```
  The **static variable** `organizationName` is accessed directly without needing an instance of the `Variables` class, demonstrating how static variables can be used throughout the class.

### **Key Points:**
- **Static variables** can be accessed using the class name or directly within the class. They are common for all objects.
- **Local variables** are only accessible inside the method/block in which they are defined.
- **Variable re-assignment** is changing the value of an already declared variable.

### **Variable Declaration Syntax:**
```java
type variableName = value;
```
- `type`: Data type of the variable (e.g., `int`, `String`, `double`).
- `variableName`: Name of the variable (e.g., `name`, `age`).
- `value`: Initial value assigned to the variable.

### **Scope of Variables:**
- **Instance variables**: Scope is throughout the class (accessible by methods of the class).
- **Class (Static) variables**: Scope is throughout the class and accessible by all objects.
- **Local variables**: Scope is limited to the method/block in which they are defined.

### **Best Practices:**
- Always initialize variables to avoid unpredictable behavior.
- Use meaningful variable names to enhance code readability.
- Keep in mind the scope of the variable to prevent accidental overwriting or conflicts.