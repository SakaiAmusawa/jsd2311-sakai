package oo.day02;

public class OverrideDemo {
    public static void main(String[] args) {
        //方法被重写时，看对象的类型执行方法
        Student zjw = new Student("周佳伟", 24, "潍坊", "20231101", "jsd2311");
        zjw.sayHi();
        Teacher sm = new Teacher("孙敏", 28, "潍坊", 6000);
        sm.sayHi();
        Doctor DrWang = new Doctor("王子健", 36, "潍坊", 8000);
        DrWang.sayHi();

    }
}
