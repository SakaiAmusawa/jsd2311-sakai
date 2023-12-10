package oo.day03.shape;

import static sakai.DividingLine.dividingLine;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.showShapeInfo();
        dividingLine();
        Rotundity rotundity = new Rotundity(3);
        rotundity.showShapeInfo();
    }
}
