package day06;

import java.util.Random;

import static sakai.DividingLine.dividingLine;

public class MethodDemo {
    public static void main(String[] args) {
        hello();
        hello("sakai amusawa", 24);
        hello(24, "竹林飲茶人");
        /*
        hello()
        hello(String int)
        hello(int String)
        这是方法的重载：在同一类中，方法名相同，但是方法的参数不同，我们称之为方法重载
        绑定：编译过程中编译器会自动根据参数去绑定方法
        方法的签名：方法的名称 和参数列表
         */
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
        for (int j : arr1) {
            System.out.println(j);
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
    public static void hello(String name, int age) {
        if (age > 60) {
            return;//在没有返回值的方法中return表示结束方法，剩余语句不再生效
        }
        System.out.println("Hello,everyone! my name is " + name + " 今年" + age + "岁了");
    }

    public static void hello(int age, String name) {
        if (age > 60) {
            return;//在没有返回值的方法中return表示结束方法，剩余语句不再生效
        }
        System.out.println("Hello,everyone! my name is " + name + " 今年" + age + "岁了");
    }

    //public static int hello(){return 1;} 错误方法的重载与返回值的类型无关 只与方法的签名有关
    //public  static void hello(){String location;} 错误方法的重载与 变量的名称无关 只要变量的类型一直就会发生错误
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
        int sum;
        sum = num1 + num2;
        return sum;
        //return sum 返回的是sum的值
    }

    public static int product(int num1, int num2) {
        int num;
        num = num1 * num2;
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
