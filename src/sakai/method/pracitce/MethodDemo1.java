package sakai.method.pracitce;
/*
练习题目：
编写一个方法，接受一个整数数组作为参数，并返回数组中所有元素的平均值。
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        double avg = avgArrays(arr);
        System.out.println(avg);
    }

    public static double avgArrays(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double avg;
        avg = (double) total / arr.length;
        return avg;
    }
}
