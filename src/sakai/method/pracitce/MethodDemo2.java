package sakai.method.pracitce;

import java.util.Scanner;

/*
练习题目：
创建一个方法，接受一个整数作为参数，返回该整数的阶乘。在计算阶乘时，使用循环实现。
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数查看它的阶乘：");
        int number = scanner.nextInt();
        int factorial = factorial(number);
        System.out.println(factorial);
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
