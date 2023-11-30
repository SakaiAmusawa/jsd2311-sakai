package homework;

public class day02 {
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

    }
}
