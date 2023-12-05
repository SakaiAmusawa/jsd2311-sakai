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
public class Day04_BasicPart1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个1~4之间的数生成‘hello’的一部分，输入其他数字输出hi");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println("H");
                break;
            case 2:
                System.out.println("e");
                break;
            case 3:
                System.out.println("ll");
                break;
            case 4:
                System.out.println("o");
                break;
            default:
                System.out.println("Hi");
        }
    }
}
