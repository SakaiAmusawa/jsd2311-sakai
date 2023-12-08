package oo.homework.day02.part1;

/*
继承Person、title，Doctor(参)、cut()
 */
public class Doctor extends Person {
    String title;

    public Doctor() {
    }

    public Doctor(String name, int age, String address, String title) {
        super(name, age, address);
        this.title = title;
    }

    void cut() {
        System.out.println(title + name + "正在做手术");
    }
}
