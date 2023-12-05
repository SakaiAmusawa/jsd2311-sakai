package day05;

import java.util.Arrays;
import java.util.Random;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        int max = arr[0];
        int min = arr[0];
        /*
        执行过程：

        假设：数组为：int[] arr = {62,31,33,92}
        max = arr[0] = 62
        i = 1 true
             62<31 false
        i = 2 true
             62<33 false
       i = 3 true
            62<92 true
            max=92
       i = 4 false for结束
         */
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\n" + "max:" + max);
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min:" + min);

        //数组扩容,数组扩容后成为一个新的数组
        arr = Arrays.copyOf(arr, arr.length + 1);
        //进行扩容后arr.length变为11
        arr[arr.length - 1] = max;
        for (int j : arr
        ) {
            System.out.println(j);
        }
    }
}
