package homework.day05;

import java.util.Random;

//MaxOfArray求数组元素最大值并放在最后一个元素的下一个位置
public class Day05_BasicPart3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int j : arr
        ) {
            System.out.println(j);
        }
        int maxOfArray = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxOfArray < arr[i]) {
                maxOfArray = arr[i];
            }
        }
        System.out.println("max:" + maxOfArray);
    }
}
