package oo.homework.day04.part1;

/**
 * Fish类：继承Animal、实现Swim接口，重写eat()、重写swim()
 */
public class Fish extends Animal implements Swim {
    public Fish() {

    }

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println(age + " years old " + color + "color " + name + " eating 🦐");
    }

    @Override
    public void swim() {
        System.out.println(name + "are swimming in the sea");
    }
}
