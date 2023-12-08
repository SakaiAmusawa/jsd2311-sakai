package oo.day02;

public class Doctor extends Person {
    double salary;

    Doctor(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    void cut() {
        System.out.println(name + "在给病人做手术");
    }

}
