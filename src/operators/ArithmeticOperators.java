package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int x=10, y=9;
        int number = x+y;                                           // Addition
        System.out.println("\nAddition: " + number);
        x++;                                                        // Increment
        number = x-y;                                               // Subtraction
        System.out.println("Subtraction: " + number);
        y--;                                                        // Decrement
        number = x*y;                                               // Multiplication
        System.out.println("Multiplication: " + number);
        number = x/y;                                               // Division
        System.out.println("Division: " + number);
        number = x%y;                                               // Modulus
        System.out.println("Modulus: " + number);
    }
}
