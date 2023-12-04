package day04;

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter command:");
        int command = scanner.nextInt();
        System.out.println("command:" + command);
    }
}
