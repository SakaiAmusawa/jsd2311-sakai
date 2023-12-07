package basic.homework.day04;

/*
for循环：输出5次"行动是成功的阶梯"、输出9的乘法表(1到9、1/3/5/7/9、9到1)、累加1到100的和
 */
public class Day04_BasicPart4 {
    public static void main(String[] args) {
        //(1)
        for (int i = 0; i < 5; i++) {
            System.out.println("行动是成功的阶梯");
        }
        //(2)-1
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "*9=" + i * 9);
        }
        //(2)-2
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i + "*9=" + i * 9);
        }
        //(2)-3
        for (int i = 9; i >= 1; i--) {
            System.out.println(i + "*9=" + i * 9);
        }
        //(3)
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
