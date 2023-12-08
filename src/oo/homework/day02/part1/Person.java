package oo.homework.day02.part1;

/*
Person类：name、age、address、Person(参)、eat()、sleep()，sayHi()
 */
public class Person {
    String name;
    int age;
    String address;
    Person(){

    }
    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void eat() {
        System.out.println(name + "eat food");
    }

    void sleep() {
        System.out.println(name + "sleeping");
    }

    void sayHi() {
        System.out.println("my name is " + name + " im " + age + " years old,and i living in " + address);
    }
}
