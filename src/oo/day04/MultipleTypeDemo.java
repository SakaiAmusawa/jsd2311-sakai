package oo.day04;

import static sakai.DividingLine.dividingLine;

public class MultipleTypeDemo {
    public static void main(String[] args) {
        Master master = new Master();
        Dog dog = new Dog("小黑", 5, "黑色");
        Animal chick = new Chick("小黄", 1, "黄色");
        Animal fish = new Fish("小金", 2, "金色");
        dog.lookHome();
        master.feed(dog);//在传参的同时，系统自动做了向上造型
        master.feed(chick);
        master.feed(fish);
        dividingLine();


        Animal[] animals = new Animal[3];
        animals[0] = new Dog("doge", 2, "yellow");
        animals[1] = new Chick("gu", 1, "white");
        animals[2] = new Fish("blu", 1, "golden");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].name);
            animals[i].eat();

            if (animals[i] instanceof Chick) {
                Chick chick1 = (Chick) animals[i];
                chick1.layEggs();
            }
            if (animals[i] instanceof Fish) {
                Fish fish1 = (Fish) animals[i];
                fish1.eat();
            }
            if (animals[i] instanceof Swim) {
                Swim s = (Swim) animals[i];
                s.swim();
            }
        }
        /*
        //向下造型演示（与强制类型转换类似）

        Chick chick1 = (Chick) chick;
        //完成向下造型后，可以调用该类中独有的反法了和成员变量了
        chick1.layEggs();

        //向下造型的条件：1.要强转成类型是该类型 2.继承或实现了接口的类型
        if (chick instanceof Fish) {
            Fish fish1 = (Fish) fish;
        }*/
    }
}
