package interfaces;

@FunctionalInterface
interface MyInterface{
    int lambdaShow(int n);
}

public class LambaExpression {
    public static void main(String[] args) {
        MyInterface obj = (int n) -> n+5;
        int n = obj.lambdaShow(5);
        System.out.println(n);
    }
}
