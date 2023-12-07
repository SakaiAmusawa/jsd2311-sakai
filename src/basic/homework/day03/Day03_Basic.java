package basic.homework.day03;

import static sakai.DividingLine.dividingLine;

public class Day03_Basic {
    public static void main(String[] args) {
        //运算符的练习：算术、关系、逻辑、赋值、字符串连接、条件
        //算数运算符
        int a = 5, b = 10, c = 5;
/*        int ao_1 = a++;
        int ao_2 = ++a;
        System.out.println(ao_1);//自增后置那么ao_1的值等于a本身，然后自增1，最后a=6
        System.out.println(ao_2);//自增前置那么ao_2的值等于a自加后的值，也就是7
        System.out.println(a);
        dividingLine();*/

        //关系运算符：== != > < >= <=
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a + c >= b);
        System.out.println(b - a <= c);
        dividingLine();

        //逻辑关系运算符 && || !
        System.out.println(a < b && b < c);//false false ---> false
        System.out.println(a + b > c && a < b);//true true --->true
        System.out.println(a == c && a + c > b);//true false --->false
        dividingLine();

        System.out.println(a > b || b > c);//false true --->true
        System.out.println(a == c || b == a);//true false--->true
        System.out.println(a + b > 20 || a + c > 10);//false false--->false
        dividingLine();

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(a + c == b));//!(5+5=10)为false
        System.out.println(!(a > b));//true
        dividingLine();

        //赋值运算符
        a += 10;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 6;
        System.out.println(a);
        a %= 5;
        System.out.println(a);
        a += 5;
        System.out.println(a);
        dividingLine();

        //条件运算符 boolean?a:b
        int j = a > b ? a : b; // a>b 为true返回a 为false返回b
        int k = a + c > b ? 1 : 0;//0
        System.out.println(j);
        System.out.println(k);

    }
}
