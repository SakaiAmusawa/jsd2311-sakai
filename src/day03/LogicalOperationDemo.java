package day03;

import static sakai.DividingLine.dividingLine;

public class LogicalOperationDemo {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 5;
        boolean b1 = a >= c && c <= b;//true&&true = true
        System.out.println(b1);

        System.out.println(a > b && a == c);//false&&true = false
        System.out.println(a == c && a > c);//true&&false = false
        System.out.println(a + b < 10 && b + c < 10);//false&&false =false
        System.out.println(b + c != a + c && a != b);//true&&true = true
        dividingLine();

        //实际应用的情况 判断年龄是否在18到50之间
        int age = 24;
        System.out.println(age >= 18 && age <= 50);//true&&true = true
        dividingLine();

        //判断成绩是否在60到100之间
        int score = 70;
        System.out.println(score >= 60 && score <= 100);

    }
}
