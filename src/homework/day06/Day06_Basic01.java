package homework.day06;

import java.util.Random;

import static sakai.DividingLine.dividingLine;

/*
方法的练习：

- 要求：

  - 定义say()无参无返回值方法，调用测试
  - 定义say()有一个参无返回值方法，调用测试
  - 定义say()有两个参无返回值的方法，调用测试
  - 定义sum()两个参有返回值方法，调用测试
  - 定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试
 */
public class Day06_Basic01 {
    public static void main(String[] args) {
        say();
        say("sakai");
        say("sakai", 24);
        int a = sum(5, 10);
        System.out.println(a);
        dividingLine();
        int[] arr = generateRandomArrays(10, 50);
        for (int i : arr
        ) {
            System.out.println(i);
        }
    }

    public static void say() {
        System.out.println("Hello");
    }

    public static void say(String name) {
        System.out.println("Hello," + name);
    }

    public static void say(String name, int age) {
        System.out.println("Hello," + name + " are you" + age + " years old");
    }

    public static int sum(int num1, int num2) {
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public static int[] generateRandomArrays(int arrayBounds, int max) {
        int[] arr = new int[arrayBounds];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max + 1);
        }
        return arr;
    }

}
