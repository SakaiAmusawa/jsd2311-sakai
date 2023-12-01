package day03.operationDemo;
// 逻辑与运算符 && 、 || 、 ！ 示例

import static sakai.DividingLine.dividingLine;

public class LogicalOperatorDemo {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 5;
        // 逻辑与运算符 &&
        boolean b1 = a >= c && c <= b;//true&&true = true
        System.out.println(b1);

        System.out.println(a > b && a == c);//false&&true = false
        System.out.println(a == c && a > c);//true&&false = false
        System.out.println(a + b < 10 && b + c < 10);//false&&false =false
        System.out.println(b + c != a + c && a != b);//true&&true = true
        dividingLine();

        //实际应用的情况 判断年龄是否在18到50之间
        int age = 24;
        System.out.println(age >= 18 && age <= 50);//true&&true = true
        dividingLine();

        //判断成绩是否在60到100之间
        int score = 70;
        System.out.println(score >= 60 && score <= 100);
        dividingLine();

        // 逻辑与运算符 ||
        System.out.println(a == b || a == c);//false||true =true
        System.out.println(a > b || b > c);//false||true = true
        System.out.println(a != b || a + c > b);//true||true = true
        System.out.println(b == a || b - a != c);//false||false = false
        dividingLine();

        //||的实际应用,判断成绩是否合法（在0~100之内）
        System.out.println(score < 0 || score > 100);//false不在该范围内 合法，true在该范围内 不合法
        dividingLine();

        //逻辑运算符 !(!的优先级高，所以使用时注意后面的运算加括号)
        System.out.println(!(a > b));//a>b:false !a>b :true
        System.out.println(!(a == c));//a==c:true !a==c:false
        dividingLine();

        //短路与、短路或
        System.out.println(a > b && a++ > 2);//a>b为false 发生短路后面的程序不执行所以a++不再生效 a的值为5
        System.out.println(a);

        System.out.println(a < b || a++ > 2);//a<b为true 发生短路后面的程序不执行所以a++不再生效，a的值为5
        System.out.println(a);

    }
}
