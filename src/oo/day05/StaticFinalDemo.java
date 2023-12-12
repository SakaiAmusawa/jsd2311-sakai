package oo.day05;

public class StaticFinalDemo {

    public static void main(String[] args) {
        String name = Loo.NAME;
        System.out.println(name);
        double pi = Loo.PI;
        System.out.println(pi);

    }

    class Loo {
        //常量由static final共同修饰，具有两者的特点，即：不可修改、只能用类名.的方法访问
        public static final String NAME = "SakaiAmusawa";
        public static final double PI = 3.1415926;
    }
}
