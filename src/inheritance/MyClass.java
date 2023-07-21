package inheritance;

public class MyClass extends Object {
    public MyClass() {
        System.out.println("In myClass");
    }

    public MyClass(int number) {
        System.out.println("In myClass int");
    }

    public MyClass(String string) {
        // nothing :/
    }

    public void printBoss(){
        System.out.println("I am the Boss");
    }

    public void showCredits() {
        System.out.println("Written credits by Sobuu");
    }
}
