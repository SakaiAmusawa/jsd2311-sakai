package oo.homework.day04;

/**
 * Test：创建Animal数组并填充Dog/Chick/Fish对象，遍历数组：
 * 输出每个动物的名字，让每个动物吃饭、喝水
 * 若为Dog，则让它看家。若为Chick，则让它下蛋。若能游泳，则让它游泳。
 * 创建Master对象、Dog对象、Fish对象、Chick对象，并喂养动物
 */

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("charil", 3, "black");
        animals[1] = new Chick("ji", 1, "yellow");
        animals[2] = new Fish("bulu", 2, "red");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();
            if (animals[i] instanceof Dog dog) {
                dog.lookHome();
            }
            if (animals[i] instanceof Chick chick) {
                chick.layEggs();
            }
            if (animals[i] instanceof Swim swim) {
                swim.swim();
            }
            Master master = new Master();
            System.out.print("the master is feeding ");
            master.feed(animals[i]);
            System.out.println();
        }

    }
}
