package oo.homework.day02.part2;

/*
name、age、color、Animal(参)、drink()、eat()
 */
public class Animal {
    String name;
    int age;
    String color;

    Animal() {

    }

    Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void drink() {
        System.out.println(age + "岁的" + name + "在喝水");
    }

    void eat() {
        System.out.println(age + "岁的" + color + "色的" + name + "在干饭");
    }

}
