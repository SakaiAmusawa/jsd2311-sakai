package oo.day03;

import oo.day03.practice.DirectorOfTeachingAndResearch;

public class ArrayDemo {
    public static void main(String[] args) {
        DirectorOfTeachingAndResearch[] director = new DirectorOfTeachingAndResearch[2];
        director[0] = new DirectorOfTeachingAndResearch("zjw", 24, 6500);

        System.out.println(director[0].editingBooks());
        System.out.println(director[0].Info());

    }
}
