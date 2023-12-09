package oo.day03.shape;

public class Rectangle extends Shape implements showInfo {
    double length;
    double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    double doArea() {
        double area;
        area = length * wide;
        return area;
    }

    @Override
    double doPerimeter() {
        double perimeter;
        perimeter = (2 * length) + (2 * wide);
        return perimeter;
    }

    @Override
    public void showShapeInfo() {
        System.out.println("长：" + length);
        System.out.println("宽：" + wide);
        System.out.println("面积:" + doArea());
        System.out.println("周长：" + doPerimeter());
    }
}
