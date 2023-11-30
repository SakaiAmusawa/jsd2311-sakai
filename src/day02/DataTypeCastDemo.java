package day02;

public class DataTypeCastDemo {
    public static void main(String[] args) {
/*        int a = 5;
        long b = a;
        int c = (int) b;//强制类型转换

        long d = 5;//自动
        System.out.println(d);
        double e = 5;//自动
        System.out.println(e);//将5赋值给double类型的e所以输出结果为5.0

        long f = 10000000000L;
        int g = (int) f;
        System.out.println(g);//强制转换类型会导致数据的溢出
        double j = 3.14;
        int k = (int) j;
        System.out.println(k);//强制类型转换会导致数据的精度损失*/

        /*
        //1)
        int a = 5;
        double a_1 = (double) a;
        System.out.println(a_1);
        //2)
        double b = 3.6;
        int b_1 = (int)b;
        System.out.println(b_1);
         */

        //byte char short型数据参与运算时，系统会将其自动转会为int类型在运算
        byte b1 = 1;
        byte b2 = 5;
        byte b3 = (byte) (b1 + b2);//byte b3 = b1 + b2 此时b1 b2被系统自动转换为int类型 但是b3是byte类型所以报错需要强制转换为byte类型

        System.out.println('2'+'2');//答案为100，应为'2'的ASCII码的值相加
        System.out.println('2');//输出2，应为没有参与运算 所以直接输出原类型
    }
}
