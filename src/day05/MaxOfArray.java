package day05;

import java.util.Random;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\n" + "max:" + max);
    }
}
