package oo.day04;


public class Fish extends Animal implements Swim {

    public Fish() {
    }

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    void showFish() {
        System.out.println(color + "小鱼" + name + "我已经养了" + age + "年了");
    }

    @Override
    void eat() {
        System.out.println(name + "吃🦐");
    }

    @Override
    public void swim() {
        System.out.println(age + "岁的" + color + "小鱼" + name + "在游泳");
    }
}
