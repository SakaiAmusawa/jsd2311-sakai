package day03.operationDemo;

//赋值运算符的演示
public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        //赋值运算符自带强转功能
        int a = 5;
        a += 10;//a=a+10 a=(int)(a+10)
        System.out.println(a);

        a *= 2;//a=a*2 a=(int)(a*2)
        System.out.println(a);
        a /= 6;//a=a/6 a=(int)(a/6)
        System.out.println(a);

/*        //小面试题
        short s = 5;
        s=s+10;
        s+=10;
        解析：
        short s = 5; 5时int类型的数据可以直接赋值给short类型
        s = s + 10; 报错 s是short类型 但10是int类型 所以结果会转为int类型 但是结果要赋值给 s 它是short类型 所以需要强转 为：s = (short)(s+10)
        s+=10;正确 是应为 赋值运算符自带强转效果
        */
    }
}
