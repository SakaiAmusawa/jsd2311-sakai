package day03.practice.day03;

/*
给定一个整数数组 numbers，编写一个程序来计算数组中所有奇数的乘积。如果数组中没有奇数，则输出 1。

例如：

int[] numbers = {2, 3, 5, 7, 10};
 */
/*public class Practice06 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 7, 10};
        int number = 1;
        int time = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                time++;
                if (time == numbers.length) {
                    System.out.println("1");
                }
            } else if (numbers[i] % 2 == 1) {
                number *= numbers[i];
            }
        }
        System.out.println(number);
    }
}*/
public class Practice06 {
    public static void main(String[] args) {
        //int[] numbers = {2, 3, 4, 5, 7, 10};
        //int[] numbers = {2, 4, 10};
        int[] numbers = {2, 3, 4, 5, 7, 10};
        int product = 1; // 初始乘积为 1
        boolean hasOdd = false; // 假设数组中没有奇数

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) { // 判断是否为奇数
                product *= numbers[i]; // 如果是奇数，乘以当前奇数
                hasOdd = true; // 发现了奇数
            }
        }
        if (!hasOdd) { // 如果数组中没有奇数
            product = 1; // 将乘积设为 1
        }

        System.out.println(product); // 输出最终乘积
    }
}

