package basic.homework.day05;

//利用for循环计算：求8的阶乘，并输出
public class Day05_ExpendPart2 {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 8; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
