package inheritance;

public class InheritanceDemo extends MyClass {
    public InheritanceDemo() {
        /**
         * Even if we do not mention, there is always one method,
         * which is super(), that calls the constructor of the parent class or super class.
         */
        System.out.println("In InheritanceDemo");
    }

    public InheritanceDemo(int number) {
        this(); // This method calls the constructor of the same class
        System.out.println("In InheritanceDemo int");
    }

    public static void main(String[] args) {
        InheritanceDemo obj = new InheritanceDemo(5);
        obj.printBoss();
    }
}
