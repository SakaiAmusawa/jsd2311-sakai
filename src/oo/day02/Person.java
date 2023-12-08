package oo.day02;

public class Person {
    String name;
    int age;
    String address;


    void eat() {
        System.out.println(name + "正在吃东西");
    }

    void sayHi() {
        System.out.println("hello everyone,my name is " + name + "," + age + " years old , live in :" + address);
    }
}
