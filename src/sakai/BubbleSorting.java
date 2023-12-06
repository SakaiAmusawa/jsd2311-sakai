package sakai;

//冒泡排序的尝试
public class BubbleSorting {
    public static void main(String[] args) {
        //声明一个数组
        int[] array = new int[]{25, 33, 16, 20, 78, 92, 13, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i : array
        ) {
            System.out.println(i);
        }
    }
}
