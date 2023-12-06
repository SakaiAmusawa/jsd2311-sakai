package day06;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(1000) + 1;
        System.out.println(number);//作弊

        int times = 0;
        while (times <= 10) {
            System.out.println("guess");
            int guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("big");
                times++;
            } else if (guess < number) {
                System.out.println("small");
                times++;
            } else {
                System.out.println("get");
                times++;
                System.out.println("total" + times + "  times to get the true number");
            }
            if (times > 10) {
                System.out.println("you fail");
            }
        }
    }
}
