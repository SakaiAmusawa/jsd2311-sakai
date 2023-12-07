package basic.day04;

public class ForDemo {
    public static void main(String[] args) {
        //for循环中的循环变量的作用域仅在当前循环中---特殊记忆
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "*9=" + i * 9);
        }
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i + "*9=" + i * 9);
        }
        /*
        执行过程:
        i=1 true 1*9=9  i+=2;
        i=3 true 3*9=27 i+=2;
        i=5 true 5*9=45 i+=2;
        i=7 true 7*9=63 i+=2;
        i=9 true 9*9=81 i+=2;
        i=11 false
         */
        for (int i = 9; i > 0; i--) {
            System.out.println(i + "*9=" + i * 9);
        }
        /*
        执行过程：
        i=9 true 9*9=81 i--;
        i=8 true 8*9=72 i--;
        ......
        i=2 true 2*9=18 i--;
        i=1 true 1*9=9  i--;
        i=0 false
         */
    }
}
