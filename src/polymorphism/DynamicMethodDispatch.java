package polymorphism;

public class DynamicMethodDispatch extends MyClass {
    public void show(){
        System.out.println("In DynamicMethodDispatch");
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();

        obj = new DynamicMethodDispatch();
        obj.show();
    }
}
