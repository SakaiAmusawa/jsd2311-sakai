package oo.homework.day02.part1;

/*
继承Person、salary，Teacher(参)、teach()，重写sayHi()方法
 */
public class Teacher extends Person {
    double salary;

    Teacher(){

    }
    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    void sayHi() {
        System.out.println("my name is " + name + " im " + age + " years old,and i living in " + address+" my salary is "+salary);
    }
}
