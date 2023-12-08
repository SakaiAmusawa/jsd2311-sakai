package oo.day01.practice;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择要办理的业务：1.存钱 2.取钱 3.查询 4.退出");
        int command = scanner.nextInt();
        choose(command);
    }

    public static void choose(int command) {
        BankAccount zjw = new BankAccount("02263016", "zjw", 3500.50);
        Scanner scanner = new Scanner(System.in);
        while (command != 4) {
            if (command >= 1 && command <= 3) {
                switch (command) {
                    case 1:
                        System.out.println("input your money:");
                        double money = scanner.nextDouble();
                        zjw.deposit(money);
                        break;
                    case 2:
                        System.out.println("draw how much:");
                        double draw = scanner.nextDouble();
                        zjw.withdraw(draw);
                        break;
                    case 3:
                        zjw.checkBalance();
                        break;
                    default:
                        System.out.println("error");

                }
            } else {
                System.out.println("error");
            }
            System.out.println("请选择要办理的业务：1.存钱 2.取钱 3.查询 4.退出");
            command = scanner.nextInt();
        }

    }
}
