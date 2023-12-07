package basic.day04.practice;

//1到100的累加和（结果：5050）
public class AccumulationByFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
