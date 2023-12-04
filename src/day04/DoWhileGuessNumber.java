package day04;

import java.util.Random;
import java.util.Scanner;

public class DoWhileGuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.println("please enter a number to guess the really number:");
            guess = scanner.nextInt();
            if (guess > number) {
                System.out.print("big,");
            } else if (guess < number) {
                System.out.print("small,");
            } else {
                System.out.print("get");
            }
        } while (guess != number);

    }
}
