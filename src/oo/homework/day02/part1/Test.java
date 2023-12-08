package oo.homework.day02.part1;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("周佳伟", 24, "潍坊", "jsd2311", "231101");
        stu.study();
        stu.eat();
        stu.sayHi();

        Teacher teacher = new Teacher("孙敏", 28, "潍坊", 6500);
        teacher.sayHi();

        Doctor dc = new Doctor("王", 38, "潍坊", "主治医生");
        dc.cut();
    }
}
