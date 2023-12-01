package day03.BranchStructureDemo;

public class IfElseDemo {
    public static void main(String[] args) {
        //满500元打8折，不满500元打9折
        double price = 1000;
        if (price > 500) {
            price *= 0.8;
        } else {
            price *= 0.9;
        }
        System.out.println("结算金额为：" + price);

        //判断成绩是否合法
        double score = 101;
        if (score >= 0 && score <= 100) {
            System.out.println("成绩合法");
        } else {
            System.out.println("成绩不合法");
        }
    }
}
