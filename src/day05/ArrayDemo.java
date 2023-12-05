package day05;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] i = new int[5];//创建一个整形数字 数组名为i 包含5个元素
        double[] d = new double[10];//创建一个double型数组 数组名为d 包含10个元素
        boolean[] b = new boolean[2];//创建一个boolean类型数组 数组名为b 包含2个元素

        //数组的初始化
        int[] arr1 = new int[5];//只声明元素个数，不声明具体元素 此时元素为默认值
        int[] arr2 = {1, 2, 3, 4, 5};//直接声明元素
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
        int[] arr4;
        arr4 = new int[]{1, 2, 3, 4, 5};
    }
}
