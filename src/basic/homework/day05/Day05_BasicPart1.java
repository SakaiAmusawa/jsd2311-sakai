package basic.homework.day05;

//1. MultiTable九九乘法表
//
//   要求：输出九九乘法表
public class Day05_BasicPart1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
