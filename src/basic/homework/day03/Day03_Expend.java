package basic.homework.day03;

import java.util.Scanner;

import static sakai.DividingLine.dividingLine;

public class Day03_Expend {
    public static void main(String[] args) {
        //(1)声明两个整型变量a和b并分别赋值，找到a和b中的最大值，并输出。用两种方式实现：条件运算符、if..else分支结构。
        int a = 5;
        int b = 10;

        //条件运算符
        int maxConditional = a > b ? a : b;
        System.out.println("最大值为:" + maxConditional);

        //if...else
        if (a > b) {
            System.out.println("最大值为:" + a);
        } else {
            System.out.println("最大值为:" + b);
        }
        dividingLine();


        //(2)声明一个整型变量year并存储年份，判断其是平年还是闰年，若是闰年则输出"某某某年是闰年"，否则输出"某某某年是平年"。
        /*
        闰年的判断公式:
        1)4年一闰，百年不闰，就是：能被4整除，并且，不能被100整除
        或者
        2)400年再闰，就是：能被400整除
        */
        int year = 1999;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "是平年");
        }
        dividingLine();


        //(3)成绩等级判断：
        /*
                注：考虑成绩的合法性：当不合法成绩时，输出"成绩不合法"
                A:成绩大于等于90
                B:成绩大于等于80并且小于90
                C:成绩大于等于60并且小于80
                D:成绩小于60
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入成绩：");
        double score = scanner.nextDouble();
        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 60) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        } else {
            System.out.println("成绩不合法");
        }
        dividingLine();


    }
}
