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

        /* e = 100000000L;//100000000L为长整型直接量
        long f = e * 1000 * 2;
        System.out.println(e);
        System.out.println(f);
        long g = 1000000000 * 3 * 10;//溢出
        long h = 10000000000L * 2;
        //long h = 10000000000 * 2; 编译错误，10000000000超出int范围，不加L默认为in。
        System.out.println(g);
        System.out.println(h);
         */

        /*
        //double类型在计算时可能发生舍入误差，所以在需要高精度计算时不得使用double类型。
        double j = 3.14;
        float k = 3.14f;

        System.out.println(3.12 - 2.15);//发生舍入误差
        System.out.println(4.5-1.5);
        System.out.println(6.7-1.2);
        System.out.println(3.6-1.2);//发生舍入误差
        */

        /*
        //boole占一个字节，只能储存true false
        boolean a = true;
        boolean b = false;
        */

        //char类型占2个字符
        // ASCII码： 'a':97 'A':65 '0':48
        char char1 = '男';
        char char2 = ' ';//空格符
        char char3 = 97;//ASCII符
        char char4 = '\'';//使用转义符才可以正常输出特殊符号
        char char5 = '\\';
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);
        System.out.println(char4);
        System.out.println(char5);
    }
}
