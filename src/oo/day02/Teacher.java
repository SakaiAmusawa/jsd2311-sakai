package oo.day02;

public class Teacher extends Person {
    double salary;

    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    void teach() {
        System.out.println(name + "正在讲课");
    }
}
