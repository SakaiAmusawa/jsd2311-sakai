package oo.day05;

public class StaticBlockTest {
    public static void main(String[] args) {
        //加载类时自动执行静态块（类只被加载一次）：StaticBlock 时加载
        StaticBlock staticBlock1 = new StaticBlock();
        StaticBlock staticBlock2 = new StaticBlock();
        StaticBlock staticBlock3 = new StaticBlock();

    }
}
