package day02;

//基本数据类型的演示
public class DataTypeDemo {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a / 2); //结果为2，余数无条件舍弃
        System.out.println(2 / a); //结果0，int类型无法储存小数类型
        System.out.println(a / 2.0); //结果2.5，当包含double类型时，会自动转换

        int d = 888888;
        d = d * 999999;
        System.out.println(d);//超出int范围，发生溢出。

    }
}
