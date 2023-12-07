package basic.homework.day06;

import java.util.Scanner;

/*
综合练习一：

- 需求:<<主持人大赛>>有N位评委给选手打分

- 选手的最终得分为:去掉最高分和最低分之后的N-2位评委的平均分
- 要求:使用方法实现
 */
public class Day06_Basic02 {
    public static void main(String[] args) {
        System.out.println("judges input score ,please");
        int[] scores = judgesScore(8);
        double avg = avg(scores);
        System.out.println("average score : " + avg);
    }

    public static int[] judgesScore(int judgesNumber) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[judgesNumber];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("pleas the number " + (i + 1) + " judges input your scores");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static double avg(int[] arr) {
        double avg;
        int total = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        avg = (double) (total - max - min) / (arr.length - 2);
        return avg;
    }
}
