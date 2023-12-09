package oo.day03.practice;

public abstract class BasicInfo {
    public String name;
    public int age;
    public double salary;

    public BasicInfo() {

    }

    public BasicInfo(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void clockInAtWork() {
        System.out.println(name + "已签到");
    }

    void clockInAfterWork() {
        System.out.println(name + "已签退");
    }

    public String Info() {
        System.out.println("------Info------");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        return "----------------";
    }

    abstract void work();
}
