package oo.day02;

public class Doctor extends Person {
    double salary;

    Doctor(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
        // super.salary = salary; 错误父类不能访问子类的成员变量
    }

    void cut() {
        System.out.println(name + "在给病人做手术");
    }

}
