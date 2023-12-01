package day03.BranchStructure;

public class IfDemo {
    public static void main(String[] args) {
        //满500元打8折
        double price = 650;
        if (price >= 500) {
            price *= 0.8;
        }
        System.out.println("结算金额为：" + price);

        //判断成绩是否合法
        double score = 70.5;
        if (score >= 0 && score <= 100) {
            System.out.println(score + "为合法成绩");
        }
        System.out.println("......");
    }
}
