package homework.day02;

import static sakai.DividingLine.dividingLine;

public class Day02 {
    public static void main(String[] args) {
     /*   变量的练习：

        - 声明一个变量，一次声明多个变量。
        - 声明变量直接初始化，先声明变量，而后再给变量初始化。
        - 声明整型变量g，声明另一个整型变量h并赋值为g+10，输出变量h的值。

        - 在g本身基础之上增10，输出变量g的值。
        - 声明一些正确的和错误的变量名。*/

        //声明一个变量
        int a;
        //一次声明多个变量
        int b, c;
        //声明变量直接初始化，先声明变量，而后再给变量初始化
        int d = 5;
        int e;
        e = 5;
        //声明整形变量g，声明另一个整型变量h并赋值为g+10，输出变量h的值。
        int g = 5;
        int h = g + 10;
        System.out.println(h);
        //在g本身基础之上增10，输出变量g的值。
        g = g + 10;
        System.out.println(g);
        //正确的变量
        int q;
        int _q;
        int $q;
        int q1;
        //错误的变量
        /*
        int 1q;
        int @q;
        ......
        int class 关键词禁止使用
         */
        dividingLine();
    /*
    基本数据类型的练习：int

   - 声明初始化两个以上整数变量，并且输出两个整数变量的除法结果
   - 声明两个很大的变量，然后相加，输出运算结果，测试运算溢出现象

     */

        int a1 = 5;
        int a2 = 2;
        System.out.println(a1 / a2);

        int a3 = 2000000000;
        int a4 = 300000000;
        System.out.println(a3 + a4);//溢出
        dividingLine();
        /*
        基本数据类型的练习：long

   - 声明初始化两个以上的长整型变量
   - 声明变量存储几个较大数据的运算，演示：若有可能溢出建议将L设计在第1个数字后。

         */
        long b1 = 2000000000L;
        long b2 = 30000000000L;
        long b3 = 1000000000000L * 2000 * 1000;
        System.out.println(b3);
        dividingLine();

        /*
        基本数据类型的练习：double

   - 声明初始化两个以上的浮点型变量
   - 声明几个浮点型变量并将它们做数学操作，演示double运算的舍入误差问题
         */
        double c1 = 3.16;
        double c2 = 2.14;
        double c3 = 4.6;
        System.out.println(c1 - c2);
        System.out.println(c1 + c2);
        System.out.println(c1 + c3);
        System.out.println(c1 - c3);
        dividingLine();

        /*
        5. 基本数据类型的练习：boolean

   - 声明初始化两个以上的布尔型变量
         */
        boolean d1 = true;
        boolean d2 = false;

        /*
        6. 基本数据类型的练习：char

   - 声明初始化五个以上的字符型变量
   - 声明字符型变量，演示转义符
         */

        char char1 = '男';
        char char2 = 'm';
        char char3 = '3';
        char char4 = 'A';
        char char5 = ' ';

        char char6 = '\'';
        System.out.println(char6);
        char char7 = '\\';
        System.out.println(char7);//通过转义符来达到输出特殊符号的目的
        dividingLine();

        /*
        基本数据类型的转换：两种方式

   - 声明几个变量，演示自动类型转换和强制类型转换的语法
   - 声明一个较大类型的长整型变量，演示强转可能会发生的溢出问题
   - 声明一个较大精度的浮点型变量，演示强转可能会发生的丢失精度问题
         */
        int e1 = 5;
        long e2 = e1;
        int e3 = (int) e2;

        int e4 = (int) 5.2;
        System.out.println(e4);

        long e5 = 100000000000L;
        int e6 = (int) e5;
        System.out.println(e6);

        double e7 = 3.16;
        int e8 = (int) e7;
        System.out.println(e8);
        dividingLine();
        /*
        8. 基本数据类型的转换：两点规则

   - 声明两个byte型变量b1和b2，并赋值为直接量
   - 声明一个byte型变量，并赋值为b1与b2的和

         */
        byte f1 = 1;
        byte f2 = 5;
        byte f3 = (byte) (f1 + f2);
        System.out.println(f3);

        byte f4 = '1';
        byte f5 = 'A';
        System.out.println(f4);
        System.out.println(f5);
        byte f6 = (byte) (f4 + f5);
        System.out.println(f6);

    }
}
