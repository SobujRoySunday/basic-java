package casting;

class A{
    public void show1(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B");
    }
}

public class Casting {
    public static void main(String[] args) {
        // UpCasting
        A obj = (A) new B();
        obj.show1();

        // DownCasting
        B obj1 = (B) obj;
        obj1.show2();
    }
}