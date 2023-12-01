package day03.operationDemo;

//字符串链接符的演示
public class StringConnectorDemo {
    public static void main(String[] args) {
        String name = "zjw";
        int age = 24;
        System.out.println("大家好，我叫" + name + "，今年" + age + "岁了.");
        System.out.println(name + "我今年" + age + "岁");

        //字符串连接符的特点：同化性:在字符串连接中，如果一个操作数是字符串，另一个操作数可以是任何非字符串类型，如数字、字符、对象等。Java会自动将非字符串类型转换为字符串类型，然后进行连接操作。
        System.out.println(10 + 20 + "" + 30);//结果为3030-------String
        System.out.println("" + 10 + 20 + 30);//结果为102030-----String
        System.out.println(10 + 20 + 30 + "");//结果为60---------String
        //可以看出10+20=30 当到+""时，30被同化变为String类型，然后+30就成了两个字符串进行连接

    }
}
