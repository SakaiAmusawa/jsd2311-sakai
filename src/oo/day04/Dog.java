package oo.day04;


public class Dog extends Animal implements Swim {
    Dog() {
    }

    Dog(String name, int age, String color) {
        super(name, age, color);
    }

    void lookHome() {
        System.out.println(age + "岁的" + color + "小狗" + name + "在看家");
    }

    @Override
    void eat() {
        System.out.println(name + "在吃骨头");
    }

    @Override
    public void swim() {
        System.out.println(age + "岁的" + color + "小狗" + name + "在游泳");
    }
}
