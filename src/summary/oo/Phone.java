package summary.oo;

public class Phone {
    String brand;
    double price;
    double size;
    String color;

    Phone() {

    }

    Phone(String brand, double size, double price, String color) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void callPhone() {
        System.out.println("......");
    }

    public void sendMessage() {
        System.out.println("......");
    }

    public void lookShow() {
        System.out.println("......");
    }
}
