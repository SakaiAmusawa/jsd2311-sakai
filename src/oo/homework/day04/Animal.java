package oo.homework.day04;

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
        System.out.println("那个" + age + "岁" + color + "色的" + name + "在喝水");
    }

    abstract void eat();
}
