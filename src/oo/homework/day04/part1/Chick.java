package oo.homework.day04.part1;

public class Chick extends Animal {
    public Chick() {

    }

    public Chick(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println(age + " years old " + color + "color " + name + " eating rice");
    }

    void layEggs() {
        System.out.println(name + "are laying Eggs ");
    }
}
