package day04;
//命令解析工具

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please select function: 1.存款 2.取款 3.余额查询 4.退卡");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                System.out.println("存款");
                break;
            case 2:
                System.out.println("取款");
                break;
            case 3:
                System.out.println("余额查询");
                break;
            case 4:
                System.out.println("退卡成功！");
                break;
            default:
                System.out.println("error!");
        }
    }
}
