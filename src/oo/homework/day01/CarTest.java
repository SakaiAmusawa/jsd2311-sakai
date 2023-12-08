package oo.homework.day01;

public class CarTest {
    public static void main(String[] args) {
        Car carTesla = new Car("Tesla", "black", 25);
        carTesla.start();
        carTesla.run();
        carTesla.stop();

        Car carByd = new Car("Byd", "white", 15);
        carByd.start();
        carByd.run();
        carByd.stop();
    }
}
