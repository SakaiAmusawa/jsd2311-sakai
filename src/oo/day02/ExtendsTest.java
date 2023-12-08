package oo.day02;

public class ExtendsTest {
    public static void main(String[] args) {
        Student zjw = new Student("sakai", 24, "潍坊", "***", "jsd2311");
        zjw.sayHi();
        zjw.study();

        Teacher lm = new Teacher("孙敏", 28, "潍坊", 6000);
        lm.eat();
        lm.sayHi();
        lm.teach();

        Doctor dcWang = new Doctor("王医生", 30, "未知", 8000);
        dcWang.sayHi();
        dcWang.cut();
        dcWang.eat();
    }
}
