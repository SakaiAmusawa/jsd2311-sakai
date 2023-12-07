package sakai.method.pracitce;

import java.util.Scanner;

/*
练习题目：
编写一个Java方法，根据商品单价和数量计算商品总价。允许输入单价和数量，然后返回总价。考虑使用double类型以处理小数。
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入商品的价格：");
        double price = scanner.nextDouble();
        System.out.println("输入商品的个数：");
        int quantity = scanner.nextInt();
        double total = totalPrice(price, quantity);
        System.out.println("商品的总价为：" + total);
    }

    public static double totalPrice(double price, int quantity) {
        double total;
        total = quantity * price;
        return total;
    }
}
