package homework.day05;

import java.util.Scanner;

/*
利用for循环计算：打印字符*组成的直角三角形，输出结果如下所示：

*
***
*****
*******
*********
***********
 */
public class Day05_ExpendPart3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        for (int i = 0; i <= line; i++) {
            //强调 在类似应用情况中 外循环控制列 内循环控制行 本例中当前行中比后一行少两列-1个* 所以条件为2*i-1
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
