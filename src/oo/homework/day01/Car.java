package oo.homework.day01;

/*
 Car类和CarTest类：

   - Car类：brand(品牌)，color，price，构造方法()，start()、run()、stop()

   - CarTest类：创建对象，访问测试
 */
public class Car {
    String brand;
    String color;
    double price;

    Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    void start() {
        System.out.println("价值" + price + "万元的" + color + " " + brand + " 启动!!!");
    }

    void run() {
        System.out.println("价值" + price + "万元的" + color + " " + brand + " 跑起来了");
    }

    void stop() {
        System.out.println("价值" + price + "万元的" + color + " " + brand + " 停下了");
    }
}
