package statickeyword;

public class StaticDemo {
    public static void main(String[] args) {
        try {
            // Only loads the class but not instantiate it
            Class.forName("Mobile");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }

        Mobile mobile = new Mobile("Apple", 100000);
        Mobile.showName();
        System.out.println(mobile.getBrand() + " : " + mobile.getPrice());
    }
}