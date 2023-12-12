package oo.day05;

public class StaticBlock {
    static {
        System.out.println("static block");
    }

    StaticBlock() {
        System.out.println("Construction method");
    }
}
