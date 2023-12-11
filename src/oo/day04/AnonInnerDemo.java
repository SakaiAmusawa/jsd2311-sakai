package oo.day04;

public class AnonInnerDemo {
    public static void main(String[] args) {
        //    Inter o1 = new Inter() {};该代码做了两件事
        //  - 创建了一个派生类，但是没有名字
        //  - 为该派生类创建了一个对象，名为o1 ，向上造型为Inter类型
        //  注：new Inter() {};是在创建派生类的对象
        Inter o1 = new Inter() {
        };
        InterDemo interDemo = new InterDemo() {
            public void show() {
                System.out.println("showTime");
            }
        };
        interDemo.show();

    }
}

interface Inter {

}

interface InterDemo {
    void show();
}