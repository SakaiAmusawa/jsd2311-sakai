package day06;

import java.util.Random;

import static sakai.DividingLine.dividingLine;

public class MethodDemo {
    public static void main(String[] args) {
        hello();
        hi("sakai amusawa", 66);
        goodbye("zt", 9999);
        sleep("sakai", 10);
        dividingLine();

        //声明一个变量a(切记，a的类型必须与方法内的类型一致)  sum()是调用方
        int a = sum(99, 3016);
        System.out.println("参数的和为：" + a);
        int b = product(99, 3016);
        System.out.println("参数的积为：" + b);
        int m = 10;
        int n = 5;
        int sum = sum(m, n);
        int product = product(m, n);
        System.out.println(sum + " " + product);
        dividingLine();

        int[] arr1 = generateArray();
        //模拟操作
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        dividingLine();
        int[] arr2 = generateArray();
        foreachArrays(arr2);
        dividingLine();
        int[] arr3 = generateCustomArrays(8, 100);
        foreachArrays(arr3);
    }

    //无返回值无参数
    public static void hello() {
        System.out.println("Hello,everyone! my name is sakai amusawa");
    }

    //无返回值有参数
    public static void hi(String name, int age) {
        if (age > 60) {
            return;//在没有返回值的方法中return表示结束方法，剩余语句不再生效
        }
        System.out.println("Hello,everyone! my name is " + name + " 今年" + age + "岁了");
    }

    public static void goodbye(String name, int day) {
        if (day <= 365 * 3) {
            System.out.println("bye " + name + ",see you in " + day + " days");
        } else {
            System.out.println(name + " farewell forever");
        }
    }

    public static void sleep(String name, int time) {
        System.out.println(name + " you should go to sleep at " + time + " o‘clock");
    }

    //有返回值有参数
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
        //return sum 返回的是sum的值
    }

    public static int product(int num1, int num2) {
        int num = num1 * num2;
        return num;
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static int[] generateCustomArrays(int arrayLength, int max) {
        Random random = new Random();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max + 1);
        }
        return arr;
    }

    public static void foreachArrays(int[] arr) {
        for (int j : arr
        ) {
            System.out.println(j);
        }
    }
}
