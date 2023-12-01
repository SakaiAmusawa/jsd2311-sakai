package day03;

public class OperDemo {
    public static void main(String[] args) {
        //a++的值为a ++a的值为a+1,a++ 在使用时先返回当前值再执行自增，而 ++a 在使用时会先执行自增再返回值。
/*
        //不被使用的情况下
        int a = 5;
        int b = 5;
        a++;
        ++b;
        System.out.println(a);
        System.out.println(b);*/

/*        //被使用的情况下
        int a = 5;
        int b = 5;
        int c = a++;
        int d = ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/

       /* //--在不被使用的情况下
        int a = 5;
        int b = 5;
        a--;
        --b;
        System.out.println(a);
        System.out.println(b);*/

        //--在被使用的情况下
        int a = 5;
        int b = 5;
        int c = a--;
        int d = --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
