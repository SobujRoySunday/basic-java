package operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10, y = 19, max;
        max = x>=y?x:y;
        System.out.println("Bigger number is: " + max);
    }
}
