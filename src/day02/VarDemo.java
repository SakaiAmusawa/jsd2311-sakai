package day02;

//变量演示
public class VarDemo {
    public static void main(String[] args) {
        // 1)声明一个变量
        int a;
        int b, c, d;

        // 2)变量的初始化
        int e = 10;
        int f;
        f = 20;
        int g = 30, h = 40;

        // 3)变量的访问/使用
        int j = 1;
        int k = j + 4; //用j的值加上4以后赋值给k
        System.out.println(k);

        j = j + 9; //j在本身的基础上增加
        System.out.println(j);
        int balance = 1000;
        balance = balance - 500;
        System.out.println(balance);

        //变量的命名规范
        //允许：数字、字母、_ 、$(不得以数字开头)
        int A1;
        int _A;
        int _$;
        int a$;
        int a1;
        //关于命名规范问题详情见笔记note_sakai中关于命名规范的部分
    }
}
