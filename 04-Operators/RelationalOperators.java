package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // As the relational operators returns true or false value, we are storing it in a boolean variable
        int x = 9, y = 8;

        boolean result = x>y; // Greater than
        System.out.println("\nx>y: " + result);

        result = x<y; // Less than
        System.out.println("x<y: " + result);

        result = x>=y; // Greater than or equal to
        System.out.println("x>=y: " + result);

        result = x<=y; // Less than or equal to
        System.out.println("x<=y: " + result);

        result = x==y; // Equal to
        System.out.println("x==y: " + result);

        result = x!=y; // Not equal to
        System.out.println("x!=y: " + result);
    }
}
