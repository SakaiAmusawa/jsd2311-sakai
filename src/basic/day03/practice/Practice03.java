package basic.day03.practice;

import java.util.Scanner;

/*
题目：
编写一个程序，根据用户输入的成绩判断其所获得的等级。90分以上为"A"，80-89分为"B"，70-79分为"C"，60-69分为"D"，60分以下为"E"。

提示：
使用嵌套的if-else if-else语句来判断成绩所属范围并输出相应的等级。
可以利用Scanner类获取用户输入的成绩。
 */
public class Practice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
