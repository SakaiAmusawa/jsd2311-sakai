package day03.operationDemo;

import java.util.Random;

import static sakai.DividingLine.dividingLine;

//条件运算符（三目运算符）
public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int flag = a > b ? 1 : -1;//判断a是否大于b，如果大于flag值为1，否则flag的值为-1
        System.out.println(flag);
        dividingLine();

        //找最大值
        Random random = new Random();
        int c = random.nextInt(100);
        int d = random.nextInt(100);
        System.out.println(c);
        System.out.println(d);
        int max = c > d ? c : d;
        System.out.println(max);
        //找最小值
        int min = c < d ? c : d;
        System.out.println(min);

    }
}
