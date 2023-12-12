package oo.homework.day05;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point();
        p.setName("周佳伟");
        p.setX(50);
        p.setY(60);

        System.out.println(p.getName());
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
