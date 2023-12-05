package homework.day05;
//定义数组，包含10个元素，随机生成数据(范围自拟)，查找最大值和最小值，并输出
import java.util.Random;

public class Day05_ExpendPart4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i : arr
        ) {
            System.out.println(i);
        }
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("mix:" + max);
        System.out.println("min:" + min);
    }
}
