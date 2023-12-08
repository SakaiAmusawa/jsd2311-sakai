package oo.homework.day01;

public class StudentTest {
    public static void main(String[] args) {
        //使用构造方法
        Student zjw = new Student("周佳伟", 24, "jsd2311", "3016");
        zjw.study();
        zjw.sayHi();
        zjw.playWith("咪咪崽");

        Student sakai = new Student("sakai", 24, "unKnow", "1999226");
        sakai.study();
        sakai.sayHi();
        sakai.playWith("周佳伟");

        //使用默认的构造方法
        Student nobody = new Student();
        nobody.name = "Mr.nobody";
        nobody.age = 18;
        nobody.className = "xx";
        nobody.stuId = "zero";
        nobody.sayHi();

        //模拟无参，使用默认值
        Student x = new Student();
        x.sayHi();
    }
}
