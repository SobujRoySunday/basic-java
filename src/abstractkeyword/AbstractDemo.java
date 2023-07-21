package abstractkeyword;

abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}

class DysoniumWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Car myCar = new Car();
        // Car myCar = new WagonR();
        Car myCar = new DysoniumWagonR();
        myCar.playMusic();
        myCar.drive();
        myCar.fly();
    }
}
