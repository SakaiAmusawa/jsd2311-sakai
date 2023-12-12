package oo.homework.day04.part1;

/**
 * - Animal类：name、age、color、Animal(参)、drink()、eat()
 */
public abstract class Animal {
    String name;
    int age;
    String color;

    public Animal() {

    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void drink() {
        System.out.println("that " + age + " years old " + color + " color " + name + " are drinking water");
    }

    abstract void eat();
}
