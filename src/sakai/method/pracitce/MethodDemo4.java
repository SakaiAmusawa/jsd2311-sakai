package sakai.method.pracitce;

import java.util.Scanner;

/*
90分以上为"A"，80-89分为"B"，70-79分为"C"，60-69分为"D"，60分以下为"E"。
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的成绩：");
        int score = scanner.nextInt();
        String judge = judgeScore(score);
        System.out.println(judge);
    }

    public static String judgeScore(int score) {
        String judge;
        if (score >= 90) {
            judge = "A";
        } else if (score >= 80) {
            judge = "B";
        } else if (score >= 70) {
            judge = "C";
        } else if (score >= 60) {
            judge = "D";
        } else {
            judge = "E";
        }
        return judge;
    }
}
