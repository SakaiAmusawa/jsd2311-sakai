package summary.oo;

public abstract class Animal {
    public void eat() {
        System.out.println("animal eating");
    }

    public void play() {
        System.out.println("animal playing");
    }

    public abstract void fly();

    public abstract void swim();
}
