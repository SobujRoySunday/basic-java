package interfaces;

interface A{
    // final static
    int age = 18;
    String school = "CMS";

    // public abstract
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{

    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }

    public void run(){
        System.out.println("Running");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        obj.run();
        
        /**
         * Normal Interface
         * Functional Interface
         * Marker Interface - Blank Interface
         */
    }
}
