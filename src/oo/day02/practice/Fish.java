package oo.day02.practice;

public class Fish extends Animal {

    public Fish() {
    }

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    void showFish() {
        System.out.println(color + "小鱼" + name + "我已经养了" + age + "年了");
    }
    void eat(){
        System.out.println(name+"吃🦐");
    }
}
