package basic.day04;

import java.util.Random;
import java.util.Scanner;

public class WhileGuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        int attempts = 0;
        System.out.println("guess number please enter your answer");
        //System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (guess != number) {
            if (guess > number) {
                System.out.println("big,please enter again:");
            } else {
                System.out.println("small,please enter again:");
            }
            attempts++;
            guess = scanner.nextInt();
        }
        attempts++;
        System.out.println("Correct answer!!!" + "total:" + attempts + "time,you get the true number");
        /*
          执行过程：
          生成一个随机数 eg:90
          输出一句话：guess number please enter your answer
          创建一个扫描仪 scanner 用于接受输入的数字inNumber eg:50
          判断50!=90,所以进入while循环 50<90所以输出："small,please enter again:"
          猜测次数加一
          重新输入一个数 eg:90
          guess = number 不执行while直接直接到最后
          猜测次数加一
          输出猜对了，程序结束
         */
    }
}
