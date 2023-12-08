package oo.homework.day02.part2;

/*
继承Animal，重写eat()、lookHome()
 */
public class Dog extends Animal {
    Dog(){

    }
    Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println("那个叫" + name + color + "的小狗今年" + age + "岁了，他在吃🥩");
    }

    void lookHome() {
        System.out.println(name + "在看家");
    }
}
