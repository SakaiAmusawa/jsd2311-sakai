package oo.day02.practice;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("小鸠", 1, "白色");
        Chick chick = new Chick("咯咯", 2, "黄色");
        Fish fish = new Fish("泡泡", 2, "红色");

        dog.eat();
        dog.drink();
        dog.lookHome();
        chick.eat();
        chick.layEggs();
        fish.eat();
        fish.showFish();
    }
}
