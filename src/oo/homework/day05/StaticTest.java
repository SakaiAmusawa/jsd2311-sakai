package oo.homework.day05;

import static sakai.DividingLine.dividingLine;

public class StaticTest {
    public static void main(String[] args) {
        StaticVar staticVar = new StaticVar();
        staticVar.show();
        StaticVar staticVar1 = new StaticVar();
        staticVar1.show();
        StaticVar staticVar2 = new StaticVar();
        staticVar2.show();

        dividingLine();

        //先执行static{}中的内容，应为静态语句块在类加载时被执行
        StaticBlock staticBlock = new StaticBlock();
        staticBlock.bye();
    }
}
