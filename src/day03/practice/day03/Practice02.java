package day03.practice.day03;

import java.util.Scanner;

/*        设计一个程序，检查一个输入的整数是否是偶数。如果是偶数，输出“这是一个偶数”，否则输出“这是一个奇数”。

        提示：
        使用取余运算符（%）来判断一个数是否能被2整除。
        使用if-else语句来根据判断条件输出相应的信息。*/
public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数判断奇偶：");
        int Number = scanner.nextInt();
        if (Number % 2 == 0) {
            System.out.println("这是一个偶数");
        } else {
            System.out.println("这是一个奇数");
        }
    }
}
