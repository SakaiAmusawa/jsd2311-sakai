package oo.day02;

public class Student extends Person {
    String stuID;
    String className;

    //无参构造
    Student() {

    }

    //有参构造
    Student(String stuID, String name, int age, String address, String className) {
        //调用父类的构造方法，super() 必须放在第一行
        super(name, age, address);
        this.stuID = stuID;
        this.className = className;
    }

    void study() {
        System.out.println(name + " in learning");
    }

}
