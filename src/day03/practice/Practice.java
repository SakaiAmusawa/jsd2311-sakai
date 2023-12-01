package day03.practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*
        编写一个程序，根据输入的考试分数判断并输出评级。评级标准如下：

        如果分数大于等于 90 分，则评级为 A。
        如果分数大于等于 80 分且小于 90 分，则评级为 B。
        如果分数大于等于 70 分且小于 80 分，则评级为 C。
        如果分数大于等于 60 分且小于 70 分，则评级为 D。
        如果分数小于 60 分，则评级为 F。
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个成绩：");
        double score = scanner.nextDouble();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("成绩错误");
        }

    }
}
