package oo.day01;

import static sakai.DividingLine.dividingLine;

public class CarTest {
    public static void main(String[] args) {
        Car carBenz = new Car("宝马", "黑色", 25.0);
        carBenz.start();
        carBenz.run();
        carBenz.stop();
        dividingLine();
        //记过一次，无参的构造方法需要赋值否则为默认值
        Car carTESLA = new Car();
        carTESLA.brand = "TESLA";
        carTESLA.color = "红色";
        carTESLA.price = 30;
        carTESLA.start();
        carTESLA.broken();
        dividingLine();

        Car carGTR = new Car("GTR", "白色", 70.5);
        carGTR.start();
        carGTR.run();

        Car carUnKnow = new Car();
        carUnKnow.broken();
    }
}
