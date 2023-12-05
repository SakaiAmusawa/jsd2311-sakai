package homework.day05;

import java.util.Arrays;
import java.util.Random;

//对数组进行升序排列，并输出排序后的结果
public class Day05_BasicPart4 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 18, 95, 45};
        Arrays.sort(arr);
        for (int i : arr
        ) {
            System.out.println(i);
        }
        Random random = new Random();
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
        }
        Arrays.sort(arr2);
        for (int i : arr2
        ) {
            System.out.println(i);
        }
    }
}
