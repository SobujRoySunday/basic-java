package literals;

public class LiteralsExample {
    public static void main(String[] args) {
        // Literals
        int number = 0b101;                                         // Binary Literal
        System.out.println("Binary Number: " + number);
        number = 0x7E;                                              // Hexadecimal Literal
        System.out.println("Hexadecimal Number: " + number);
        number = 10_00_00_000;                                      // Lengthy Numbers Literal
        System.out.println("Lengthy Number: " + number);
        double numDouble = 65;                                      // Int Literal for Double
        System.out.println("Integer in Double: " + numDouble);
        numDouble = 12e10;                                          // Exponential Literal
        System.out.println("Exponential: " + numDouble);
    }
}
