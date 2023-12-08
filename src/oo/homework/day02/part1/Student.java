package oo.homework.day02.part1;

/*
继承Person、className、stuId，Student(参)、study()，重写sayHi()方法
 */
public class Student extends Person {
    String className;
    String stuID;

    Student(){

    }

    public Student(String name, int age, String address, String className, String stuID) {
        super(name, age, address);
        this.className = className;
        this.stuID = stuID;
    }

    void study() {
        System.out.println(name + "in learning");
    }
    void sayHi(){
        System.out.println("my name is " + name + " im " + age + " years old,and i living in " + address+" form "+className+" ID is "+stuID);
    }
}
