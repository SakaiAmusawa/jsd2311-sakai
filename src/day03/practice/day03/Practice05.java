package day03.practice.day03;
/*
编写一个程序，根据给定的价格和数量计算总金额，如果购买数量超过10件，则总金额打9折。
 */

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goodsTime = 0;
        int priceTotal = 0;
        while (true) {
            System.out.println("输入商品编号：");
            int goods = scanner.nextInt();
            if (goods < -1 || goods > 100) {
                System.out.println("error!请重新输入：");
                goods = scanner.nextInt();
            }
            if (goods == -1) {
                break;
            }
            goodsTime++;
            System.out.println("输入商品价格");
            int price = scanner.nextInt();
            if (price <= 0) {
                System.out.println("error!请重新输入：");
                price = scanner.nextInt();
            }
            priceTotal += price;

        }
        System.out.println("购买了" + goodsTime + "件商品");
        if (goodsTime >= 10) {
            priceTotal *= 0.9;
        }
        System.out.println("结算金额为:" + priceTotal);
    }
}
