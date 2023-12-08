package oo.day02.practice;

public class Animal {
    String name;
    int age;
    String color;

    Animal() {

    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void eat() {
        System.out.println(name + "eating");
    }

    void drink() {
        System.out.println(name + "drink water");
    }
}
