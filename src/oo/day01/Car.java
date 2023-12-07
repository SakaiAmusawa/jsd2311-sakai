package oo.day01;

public class Car {
    String brand;
    String color;
    double price;

    Car() {

    }

    Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    void start() {
        System.out.println(color + price + "万元的" + brand + "启动!!!");
    }

    void run() {
        System.out.println(color + price + "万元的" + brand + "跑起来了");
    }

    void stop() {
        System.out.println(color + price + "万元的" + brand + "停下了");
    }

    void broken() {
        System.out.println("悲剧发生了！" + color + brand + "自燃了，" + price + "万元打水漂了");
    }
}
