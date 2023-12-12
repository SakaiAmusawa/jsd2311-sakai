package oo.homework.day05;

public class StaticVar {
    int a;
    static int b;

    public StaticVar() {
        a++;
        b++;
    }

    void show() {
        System.out.println(a + "," + b);
    }
}
