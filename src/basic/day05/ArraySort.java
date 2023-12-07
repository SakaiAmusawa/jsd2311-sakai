package basic.day05;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        for (int i : arr
        ) {
            System.out.println(i);
        }
        Arrays.sort(arr);
        System.out.println("升序排列后：");
        for (int i : arr
        ) {
            System.out.println(i);
        }
        System.out.println("降序输出：");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
