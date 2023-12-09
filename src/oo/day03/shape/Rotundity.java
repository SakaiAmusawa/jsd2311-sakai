package oo.day03.shape;

public class Rotundity extends Shape implements showInfo {
    double radius;

    public Rotundity(double radius) {
        this.radius = radius;
    }

    @Override
    double doArea() {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    double doPerimeter() {
        double perimeter;
        perimeter = Math.PI * radius * 2;
        return perimeter;
    }

    @Override
    public void showShapeInfo() {
        System.out.println("半径：" + radius);
        System.out.println("面积:" + doArea());
        System.out.println("周长：" + doPerimeter());
    }
}
