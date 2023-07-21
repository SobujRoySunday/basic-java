package statickeyword;

public class Mobile {
    // Value of static variable will be common for all objects and can be accessed by class name
    static String name;
    private String brand;
    private int price;

    // This block is executed whenever ClassLoader loads this class
    static {
        name = "SmartPhone";
    }

    public Mobile(String brand, int price) {
        // Using this keyword we can access the instance variables
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Prints the value of the static variable 'name'.
     * This method can only access static variables.
     */
    public static void showName() {
        System.out.println(name);
    }
}