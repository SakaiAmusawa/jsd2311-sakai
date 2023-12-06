package homework.day06;

import java.util.Random;
import java.util.Scanner;

/*
综合练习二：

- 完成猜数字小游戏
- 要求：使用while(true)自造死循环实现
 */
public class Day06_Basic03 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your guess number:");
        int guess = scanner.nextInt();
        while (true) {
            if (guess > number) {
                System.out.println("big");
            } else if (guess < number) {
                System.out.println("small");
            } else {
                System.out.println("get");
                break;
            }
            guess = scanner.nextInt();
        }

    }
}
