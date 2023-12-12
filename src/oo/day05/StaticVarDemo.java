package oo.day05;

public class StaticVarDemo {
    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
        staticVar.show();
        StaticVar staticVar1 = new StaticVar();
        staticVar1.show();
        System.out.println(StaticVar.b);//静态变量的访问常常用类名去访问
    }
}
