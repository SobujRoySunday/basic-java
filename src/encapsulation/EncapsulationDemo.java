package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Mobile mb = new Mobile("Apple", 10000);
        // int price = mb.price; // Not possible
        int price = mb.getPrice();
        System.out.println("Price is: " + price);
    }
}
