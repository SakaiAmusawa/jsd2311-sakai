package day03.practice;

public class Practice {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int z = (x++ > 10) ? y++ : x--;
        System.out.println(z + ", " + x + ", " + y);
        //z = 11 x = 10 y = 20

        int num1 = 8, num2 = 6;
        boolean result = ((num1++ > 7) && (num2-- > 5));
        System.out.println(result + ", " + num1 + ", " + num2);
        //true 9 5

        int num = 15;
        boolean check = num > 10 && num % 2 == 0 || num % 3 == 0;//true false || true
        System.out.println(check);//true

        int number = 45;
        String result1 = "";

        if (number % 5 == 0) {
            result1 += "可被 5 整除 ";
        } else if (number % 9 == 0) {
            result1 += "可被 9 整除 ";
        } else {
            result1 += "不能被 5 或 9 整除 ";
        }

        System.out.println(result1);


    }
}
