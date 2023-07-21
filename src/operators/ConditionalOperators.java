package operators;

public class ConditionalOperators {
    public static void main(String[] args) {
        // Conditional Operators
        int x = 9, y = 8;
        boolean result = (x>y && x<y);                                      // Conditional operators help to join two different relations, with method and/or/not
        System.out.println("\nx>y and x<y: " + result);
        result = (x>y || x<y);
        System.out.println("x>y or x<y: " + result);
        result = !(x>y);
        System.out.println("Not x>y: " + result);
    }
}
