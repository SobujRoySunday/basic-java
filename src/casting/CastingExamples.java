package casting;

public class CastingExamples {
    public static void main(String[] args) {
        // Type Conversion and Casting
        byte numByte = 127;
        int number = numByte;                                       // Implicit Conversion
        System.out.println("\nByte to Int Number: " +  number);     // Byte to Int Conversion
        number = 258;
        numByte = (byte)number;                                     // Explicit Conversion/Casting
        System.out.println("Int to Byte: " + numByte);              // numByte = (byte)(num%256)
        float numFloat = 5.6f;
        number = (int)numFloat;                                     // Casting to Integer from Float
        System.out.println("Float to Int Number: " + number);       // Removes the part after decimal point
        numByte = 10;
        byte numByte1 = 30;
        number = numByte*numByte1;                                  // Type Promotion
        System.out.println("Promoted Number: " + number);           // As the answer of the operation exceeds size of byte, so it promotes to int
    }
}
