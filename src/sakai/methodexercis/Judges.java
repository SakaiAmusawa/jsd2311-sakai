package sakai.methodexercis;

import java.util.Random;

/*
练习题 1：平均分计算
编写一个Java程序，在主方法中模拟评委给选手打分的情景。通过调用方法实现以下功能：

创建一个名为 calculateAverage 的方法，该方法接收一个评委打分的数组，返回去掉最高分和最低分之后的平均分。
在 main 方法中，生成一个评委评分的数组，并调用 calculateAverage 方法计算最终的平均分并输出结果。
 */
public class Judges {
    public static void main(String[] args) {
        int[] arr = assignmentArrays();
        double avg = calculateAverage(arr);
        System.out.println(avg);
    }

    public static int[] assignmentArrays() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public static double calculateAverage(int[] arr) {
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
        avg = (double) ((total - max - min) / (arr.length - 2));
        return avg;
    }
}
