package day03.practice.day03;

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
    }
}
