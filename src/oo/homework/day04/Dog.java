package oo.homework.day04;

public class Dog extends Animal implements Swim {
    public Dog() {

    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    void lookHome() {
        System.out.println(name + "are looking home");
    }

    @Override
    void eat() {
        System.out.println(age + " years old " + color + "color " + name + "is eating met");
    }

    @Override
    public void swim() {
        System.out.println(age + " years old " + color + "color " + name + "is swimming");
    }
}
