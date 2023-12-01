package day03.BranchStructureDemo;

import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
        //满2000打5折，满1000打7折，满500打8折，不满500打9折

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入您购买物品的金额：");
        double price = scanner.nextDouble();

        if (price >= 2000) {
            price *= 0.5;
        } else if (price >= 1000) {
            price *= 0.7;
        } else if (price >= 500) {
            price *= 0.8;
        } else {
            price *= 0.9;
        }
        System.out.println("结算金额为：" + price);
    }
}
