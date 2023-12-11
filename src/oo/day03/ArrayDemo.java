package oo.day03;

import oo.day03.practice.DTR;

public class ArrayDemo {
    public static void main(String[] args) {
        DTR[] director = new DTR[2];
        director[0] = new DTR("zjw", 24, 6500);

        System.out.println(director[0].editingBooks());
        System.out.println(director[0].Info());

    }
}
