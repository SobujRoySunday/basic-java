class TypeCasting {
    public static void main(String[] args) {
        byte numByte = 127;
        int intNumber = numByte; // Implicit Conversion
        System.out.println("Byte to Int Number: " +  intNumber); // Byte to Int Conversion

        intNumber = 258;
        numByte = (byte)intNumber; // Explicit Conversion/Casting
        System.out.println("Int to Byte: " + numByte); // numByte = (byte)(num%256)

        float numFloat = 5.6f;
        intNumber = (int)numFloat; // Casting to Integer from Float
        System.out.println("Float to Int Number: " + intNumber); // Removes the part after decimal point

        numByte = 10;
        byte anotherNumberByte = 30;
        intNumber = numByte*anotherNumberByte; // Type Promotion
        System.out.println("Promoted Number: " + intNumber); // As the answer of the operation exceeds size of byte, so it promotes to int
    }
}
