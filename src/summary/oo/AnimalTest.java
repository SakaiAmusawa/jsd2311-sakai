package summary.oo;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Pig();//向上造型
        animal.eat();
        animal.fly();
        Pig pig = new Pig();
        pig.fly();
        pig.swim();
    }
}
