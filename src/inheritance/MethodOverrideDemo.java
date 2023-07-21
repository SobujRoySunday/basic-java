package inheritance;

public class MethodOverrideDemo extends MyClass {
    /**
     * Overrides the showCredits() method from class A.
     * Prints the written credits by Shikhu.
     */
    @Override
    public void showCredits() {
        System.out.println("Written credits by Shikhu");
    }

    public static void main(String[] args) {
        new MethodOverrideDemo().showCredits();;
    }
}
