package oo.day05;

public class StaticMethod {
    int a;
    static int b;

    void show() {
        //一般情况下方法中有隐式this,通常情况下省略
        System.out.println(this.a);
        //静态变量通过方法名调用 eg: StaticMethod.b ,通常情况下省略
        System.out.println(b);
    }

    static void Test() {
        //静态方法中没有隐式的this传递
        //没有this的传递意味着没有对象
        //而实例需要通过对象访问
        //所以下面的语句发生编译错误
        //System.out.println(a);//编译错误，静态方法中不能访问实例对象
        System.out.println(b);
    }

    //在sum中不需要访问对象的方法/属性，所以认为sum()的操作与对象无关，可以设计为静态方法
    static int sum(int num1, int num2) {
        int num = num1 + num2;
        return num;
    }
}
