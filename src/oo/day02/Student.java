package oo.day02;

public class Student extends Person {
    String stuID;
    String className;

    //无参构造
    Student() {

    }
    public Student(String name, int age, String address, String stuID, String className) {
        super(name, age, address);//调用父类的构造方法，super() 必须放在第一行
        this.stuID = stuID;
        this.className = className;
    }

    void study() {
        System.out.println(name + " in learning");
    }

    @Override
    void sayHi() {
        System.out.println("hello everyone,my name is " + name + "," + age + " years old , live in :" + address + " form " + className + " class, and my ID is " + stuID);
    }
}
