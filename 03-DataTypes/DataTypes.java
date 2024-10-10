class DataTypes {
    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 1000000; // -2,147,483,648 to 2,147,483,647
        long aLargeNumber = 1000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // decimal types
        double aDouble = 3.142; // 4.9e-324 to 1.7976931348623157e308
        float aFloat = 3.142F; // 1.4e-45 to 3.4028235e38

        // boolean type
        boolean isWeekend = false; // true or false

        // character type
        char aCharacter = 'a';
        char newLineCharacter = '\n';
        char copyrightSymbol = '\u00A9';

        System.out.println("This is copyright symbol: " + copyrightSymbol);
    }
}