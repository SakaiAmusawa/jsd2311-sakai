package day06;

import java.util.Scanner;

public class CalAvg {
    public static void main(String[] args) {
        System.out.println("请输入共有多少位评委");
        int n = judgesNumber();
        double[] scores = inputScore(n);
        double avg = avg(scores);
        System.out.println("平均分为：" + avg);
    }

    public static double[] inputScore(int n) {
        double[] scores = new double[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请第" + (i + 1) + "位评委打分");
            scores[i] = scanner.nextDouble();
        }
        return scores;
    }

    /*    public static double avg(double[] scores) {
            double total = 0;
            double sum = maxMinSum(scores);
            for (int i = 0; i < scores.length; i++) {
                total += scores[i];
            }
            double avg = (total - sum) / (scores.length - 2);
            return avg;
        }

        public static double maxMinSum(double[] scores) {
            double max = scores[0];
            double min = scores[0];
            for (int i = 0; i < scores.length; i++) {
                if (max < scores[i]) {
                    max = scores[i];
                }
                if (min > scores[i]) {
                    min = scores[i];
                }
            }
            double maxMinSum = max + min;
            return maxMinSum;
        }*/
    public static double avg(double[] scores) {
        double avg ;
        double total = 0;
        double max = scores[0];
        double min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        avg = (total - max - min) / (scores.length - 2);
        return avg;
    }

    public static int judgesNumber() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n < 3) {
            System.out.println("error,please input again:");
            n = scanner.nextInt();
        }
        return n;
    }
}
