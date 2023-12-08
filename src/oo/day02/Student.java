package oo.day02;

public class Student extends Person {
    String stuID;
    String className;

    //无参构造
    Student() {

    }

    //有参构造
    Student(String stuID, String name, int age, String address, String className) {
        this.stuID = stuID;
        super.name = name;
        super.age = age;
        super.address = address;
        this.className = className;
    }

    void study() {
        System.out.println(name + " in learning");
    }

}
