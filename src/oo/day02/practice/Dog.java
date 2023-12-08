package oo.day02.practice;

public class Dog extends Animal {
    Dog() {
    }

    Dog(String name, int age, String color) {
        super(name, age, color);
    }

    void lookHome() {
        System.out.println(age + "岁的" + color + "小狗" + name + "在看家");
    }

    void eat() {
        System.out.println(name + "在吃骨头");
    }
}
