package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // Relational Operator
        int x = 9, y = 8;
        boolean result = x>y;                                       // As the relational operators returns true or false value, we are storing it in a boolean variable
        System.out.println("\nx>y: " + result);
        result = x<y;
        System.out.println("x<y: " + result);
        result = x>=y;
        System.out.println("x>=y: " + result);
        result = x<=y;
        System.out.println("x<=y: " + result);
        result = x==y;
        System.out.println("x==y: " + result);
        result = x!=y;
        System.out.println("x!=y: " + result);
    }
}
