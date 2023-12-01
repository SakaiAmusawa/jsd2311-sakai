package day03.practice.day03;


import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
        1. 运算符练习题
        题目：
        编写一个程序，接受用户输入的两个整数，然后计算并输出它们的和、差、积和商。

         提示：
        使用Scanner类来获取用户输入。
        使用基本的算术运算符来执行加法、减法、乘法和除法。
        注意处理除数为0的情况。

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int NumberOne = scanner.nextInt();
        System.out.println("输入第二个数：");
        int NumberTwo = scanner.nextInt();

        System.out.println("和：" + (NumberOne + NumberTwo));
        System.out.println("差：" + (NumberOne - NumberTwo));
        System.out.println("积：" + (NumberOne * NumberTwo));
        if (NumberTwo == 0) {
            System.out.println("error");
        } else {
            System.out.println("商：" + (NumberOne / NumberTwo));
        }
    }
}
