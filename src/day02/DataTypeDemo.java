package day02;

//基本数据类型的演示
public class DataTypeDemo {
    public static void main(String[] args) {
        /*
        int a = 5;
        System.out.println(a / 2); //结果为2，余数无条件舍弃
        System.out.println(2 / a); //结果0，int类型无法储存小数类型
        System.out.println(a / 2.0); //结果2.5，当包含double类型时，会自动转换

        int d = 888888;
        d = d * 999999;
        System.out.println(d);//超出int范围，发生溢出。
        */

        long e = 100000000L;//100000000L为长整型直接量
        long f = e * 1000 * 2;
        System.out.println(e);
        System.out.println(f);
        long g = 1000000000 * 3 * 10;//溢出
        long h = 10000000000L * 2;
        //long h = 10000000000 * 2; 编译错误，10000000000超出int范围，不加L默认为in。
        System.out.println(g);
        System.out.println(h);
    }
}
