package summary.oo;

public class Person {
    String name;
    int age;
    String address;

    public Person() {
        System.out.println("无参构造");
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("全参构造");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("含参构造");
    }

    public void eat() {
        System.out.println(name + "在吃🍜");
    }
}
