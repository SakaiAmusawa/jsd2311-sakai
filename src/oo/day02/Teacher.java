package oo.day02;

public class Teacher extends Person {
    double salary;

    Teacher(String name, int age, String address, double salary) {
        this.salary = salary;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void teach() {
        System.out.println(name + "正在讲课");
    }
}
