package basic.day03.practice;

import java.util.Random;
import java.util.Scanner;

/*
题目：
编写一个程序，生成两个1到10之间的随机整数，然后计算第一个数除以第二个数的余数，并提示用户猜测这个余数是多少。根据用户的猜测给出提示，直到猜中为止，并输出猜测次数。

提示：
使用java.util.Random类生成1到10之间的随机数。
利用算术运算符计算第一个数除以第二个数的余数。
利用循环（比如while或do-while）来让用户多次猜测，直到猜中为止。
在用户每次猜测后，根据猜测的数值给出提示。例如，如果猜测的余数大于实际余数，输出“猜大了”，反之输出“猜小了”。
记录用户猜测的次数，并在猜对时输出猜测次数。
 */
public class Practice04 {
    public static void main(String[] args) {
        Random random = new Random();
        int dividend = random.nextInt(10) + 1;
        int divisor = random.nextInt(10) + 1;
        int remainder = (dividend % divisor);
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你猜的数：");
        int numberIn = scanner.nextInt();
        int time = 0;
        while (true) {
            if (numberIn >= 0 && numberIn <= 10) {
                break;
            } else {
                System.out.println("请输入一个合法数据：");
                numberIn = scanner.nextInt();
            }
        }
        while (true) {
            if (numberIn > remainder) {
                System.out.println("大了");
                time++;
                System.out.println("再输入一个数：");
                numberIn = scanner.nextInt();
            } else if (numberIn == remainder) {
                System.out.println("猜中了");
                time++;
                System.out.println("共猜了" + time + "次");
                break;
            } else {
                System.out.println("小了");
                time++;
                System.out.println("再输入一个数：");
                numberIn = scanner.nextInt();
            }
        }
    }
}

