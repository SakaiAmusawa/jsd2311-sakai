package oo.homework.day02.part2;

/*
继承Animal，重写eat()、layEggs()
 */
public class Chick extends Animal {
    Chick(){

    }
    Chick(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println("那个叫" + name + color + "的🐥今年" + age + "岁了，他在吃米");
    }

    void layEggs() {
        System.out.println(name + "正在下蛋");
    }
}
