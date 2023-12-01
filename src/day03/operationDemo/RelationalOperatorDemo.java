package day03.operationDemo;

//关系运算符的演示
public class RelationalOperatorDemo {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 5;
        boolean b1 = a == c;
        System.out.println(b1);

        System.out.println(a + c == b);//true
        System.out.println(a % 2 > 1);//false a%2的值为1
        System.out.println(a != c);//false
        System.out.println(a + c > b);//false
        System.out.println((b % a) > c);//false
        System.out.println(a++ > 5);//false
        System.out.println(a);//a的值为6
        System.out.println(a++ > 5);//true
        System.out.println(a);

    }
}
