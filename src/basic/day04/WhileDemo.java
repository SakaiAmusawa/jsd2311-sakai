package basic.day04;

//while结构的演示
public class WhileDemo {
    public static void main(String[] args) {
        //（1）行动是成功的阶梯
        int num = 0;
        while (num < 5) {
            System.out.println("行动是成功的阶梯");
            num++;
        }
        //（2）1到9的乘法表
        int num1 = 1;
        while (num1 <= 9) {
            System.out.println(num1 + "*9=" + num1 * 9);
            num1++;
        }
        /*
        执行过程
        num1 = 1    num1<=9(true)   1*9 num++
        num1 = 2    num1<=9(true)   2*9 num++
        ......
        num1 = 8    num1<=9(true)   8*9 num++
        num1 = 9    num1<=9(true)   9*9 num++
        num1 = 10   num1<=9(false)
         */
    }
}
