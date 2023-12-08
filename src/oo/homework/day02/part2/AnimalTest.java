package oo.homework.day02.part2;

/*
AnimalTest：创建3个Dog对象、3个Chick对象、2个Fish对象，并测试
 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小鸠", 1, "白色");
        Dog dog1 = new Dog("大胡子", 2, "卡其色");
        Dog dog2 = new Dog("大黑", 5, "黑色");
        dog.eat();
        dog.lookHome();
        dog1.eat();
        dog2.lookHome();

        Chick chick = new Chick("咕咕", 2, "黄色");
        Chick chick1 = new Chick("嘎嘎", 2, "白色");
        Chick chick2 = new Chick("叽叽", 2, "？");
        chick.drink();
        chick.eat();
        chick1.eat();
        chick2.eat();

        Fish fish = new Fish("泡泡", 3, "金色");
        Fish fish1 = new Fish("波波", 2, "红色");
        fish.eat();
        fish1.eat();
    }
}
