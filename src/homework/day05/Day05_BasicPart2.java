package homework.day05;

import java.util.Arrays;

import static sakai.DividingLine.dividingLine;

//数组小代码练习：声明、初始化、访问、遍历、复制
public class Day05_BasicPart2 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4;
        arr4 = new int[5];
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        dividingLine();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        dividingLine();
        //数组的复制有两种方法：1 System.arraycopy(原数组，原数组复制起始下标，目标数组，目标数组的粘贴起始下标，复制元素的个数)
        //2 Arrays.copyOf(原数组，目标数组的长度) 该操作可以对数组进行扩容
        System.arraycopy(arr2, 2, arr4, 0, 3);
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        dividingLine();
        arr1 = Arrays.copyOf(arr2, arr1.length + 1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
