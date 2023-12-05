package day05;

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrayTest = new int[5];
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = random.nextInt(10);
            System.out.println(arrayTest[i]);
        }
        for (int i = 0; i < arrayTest.length; i++) {
            for (int j = 1; j < arrayTest.length - 1; j++) {
                if (arrayTest[j] < arrayTest[i]) {
                    int temp = arrayTest[j];
                    arrayTest[j] = arrayTest[i];
                    arrayTest[i] = temp;
                }
            }
            System.out.println(arrayTest[i]);
        }
    }
}
