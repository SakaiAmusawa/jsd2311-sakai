package oo.day02;

public class Teacher extends Person {
    double salary;

    public Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    void teach() {
        System.out.println(name + "正在讲课");
    }

    @Override
    void sayHi() {
        System.out.println("hello everyone,my name is " + name + "," + age + " years old , live in :" + address + " 工资是每月" + salary);
    }
}
