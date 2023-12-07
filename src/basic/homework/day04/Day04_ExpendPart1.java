package basic.homework.day04;

import java.util.Scanner;

//接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
public class Day04_ExpendPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number to judging negative or positive values");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("+");
        } else if (number < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }
}
