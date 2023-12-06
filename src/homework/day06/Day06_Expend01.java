package homework.day06;

import static sakai.DividingLine.dividingLine;

/*
定义一个方法getMaxOfArray()，用于获取数组元素的最大值，并返回，测试方法
定义一个printArrayData()，用于输出整型数组的每一个元素的值，测试方法
 */
public class Day06_Expend01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 5, 21, 5, 95, 0};
        int max = getMaxOfArray(arr);
        System.out.println(max);
        dividingLine();
        printArrays(arr);
    }

    public static int getMaxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void printArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();
    }
}
