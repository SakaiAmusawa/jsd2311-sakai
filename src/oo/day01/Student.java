package oo.day01;


public class Student {
    String stuId;
    String name;
    int age;
    String className;

    //带数理解 Student zjw = new Student("3016", "sakai", 24, "JSD2311")
    // stuId = 3016 name = zjw age =24 className =jsd2311
    Student(String stuId, String name, int age, String className) {
        this.stuId = stuId;//this.stuId 在本例中就是 zjw 所以 zjw.stuId = stuId
        this.name = name;//zjw.name = name
        this.age = age;//zjw.age =age
        this.className = className;//zjw.className = className
    }

    //构造方法可以重载
    Student() {

    }

    void study() {//            sakai
        System.out.println(name + "正在学习");
    }

    void sayHi() {//                     sakai                24                                jsd2311                     3016
        //                     xd                   24                                jsd2210                     0250
        System.out.println("我是" + name + "，今年" + age + "岁了" + ",我的班级是" + className + "，学号是" + stuId);
    }

    void playWith(String anotherName) {
        System.out.println(name + "在和" + anotherName + "玩");
    }

    void graduationYears() {
        int years;
        years = this.age + 3;
        System.out.println(name + "在" + years + "岁毕业");
    }
}

