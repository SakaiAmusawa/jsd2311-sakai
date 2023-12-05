package homework.day05;

//利用for循环计算：求数字1到100之内，所有偶数的和，并输出
public class Day05_ExpendPart1 {
    public static void main(String[] args) {
        //我的方法
        /*int sum = 0 ;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum +=i;
            }

        }
        System.out.println("sum:"+sum);*/
        //简化后的方法
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
