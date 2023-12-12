package summary.oo;

import static sakai.DividingLine.dividingLine;

public class PersonTest {
    public static void main(String[] args) {
        Person h = new Person();
        System.out.println(h.name);
        System.out.println(h.age);
        System.out.println(h.address);
        h.eat();
        dividingLine();
        Person zjw = new Person("sakai", 24, "cn");
        System.out.println(zjw.name);
        System.out.println(zjw.age);
        System.out.println(zjw.address);
        zjw.eat();
        dividingLine();
        Person sakai = new Person("周佳伟");
        System.out.println(sakai.name);
        System.out.println(sakai.age);
        System.out.println(sakai.address);
        sakai.eat();
    }
}
