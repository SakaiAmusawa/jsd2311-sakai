package oo.homework.day04.part2;

interface Inter {
}

interface InterInter {
    void show();
}

public class InnerTest {
    public static void main(String[] args) {
        Inter o1 = new Inter() {
        };
        Inter o2 = new Inter() {
        };
        InterInter o3 = new InterInter() {
            public void show() {
                System.out.println("showTime");
            }
        };
        o3.show();
        InterInter o4 = new InterInter() {
            public void show() {
                System.out.println("time to show");
            }
        };
        o4.show();
    }
}