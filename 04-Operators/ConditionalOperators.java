class ConditionalOperators {
    public static void main(String[] args) {
        // Conditional operators help to join two different relations, with method and/or/not
        int x = 9, y = 8;

        boolean result = (x>y && x<y); // And             
        System.out.println("\nx>y and x<y: " + result);
        
        result = (x>y || x<y); // Or
        System.out.println("x>y or x<y: " + result);
        
        result = !(x>y); // Not(Unary Operator)
        System.out.println("Not x>y: " + result);
    }
}
