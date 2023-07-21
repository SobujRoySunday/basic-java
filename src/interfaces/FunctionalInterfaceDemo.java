package interfaces;

@FunctionalInterface
interface A{
    void show();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
}
