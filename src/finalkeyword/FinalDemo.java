package finalkeyword;

// final with class stops inheritance
public class FinalDemo {
    // final with method stops method overriding
    public static void main(String[] args) {
        final int number = 8;
        // number = 9; // Not possible
        System.out.println(number);
    }
}
