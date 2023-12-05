package homework.day04;

import java.util.Scanner;

/*
CommandBySwitch命令解析程序：

要求：接收用户输入的命令，依据命令做不同的操作

Guessing猜数字之while版：

要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用while来实现。

Guessing猜数字之do...while版

要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用do...while来实现。

for循环：输出5次"行动是成功的阶梯"、输出9的乘法表(1到9、1/3/5/7/9、9到1)、累加1到100的和
 */
public class Day04_BasicPart2 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (guess != number) {
            if (guess > number) {
                System.out.println("big");
            } else {
                System.out.println("small");
            }
            System.out.println("input again:");
            guess = scanner.nextInt();
        }
        System.out.println("get");
    }
}
