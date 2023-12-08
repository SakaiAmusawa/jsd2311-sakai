package oo.day02.practice;

public class Chick extends Animal {

    public Chick() {
    }

    Chick(String name, int age, String color) {
        super(name, age, color);
    }

    void layEggs() {
        System.out.println(age + "岁的" + color + "小鸡" + name + "在下蛋");
    }

    void eat() {
        System.out.println(name + "在吃小米");
    }
}
