package oo.day01;

public class StudentTest {
    public static void main(String[] args) {
        Student zjw = new Student();
        zjw.stuId = "3016";
        zjw.name = "sakai";
        zjw.age = 24;
        zjw.className = "jsd2311";

        zjw.study();
        zjw.sayHi();
        zjw.playWith("pc");
        zjw.graduationYears();


        Student zt = new Student();
        zt.stuId = "0926";
        zt.name = "zt";
        zt.age = 24;
        zt.className = "ys2019";

        zt.study();
        zt.sayHi();
        zt.playWith("yx");
        zt.graduationYears();

        Student xd = new Student();
        xd.stuId = "0250";
        xd.name = "唐雪东";
        xd.age = 24;
        xd.className = "jsd2210";

        xd.sayHi();
        xd.playWith("shit");

        //创建了一个学生对象
        //给所有成员变量赋默认值（引用类型的默认值为null）
        Student hh = new Student();
        hh.sayHi();
    }
}
