package homework.Day04;

import java.util.Scanner;

//接收用户输入的年份year和月份month，计算该年该月的天数，并输出
public class Day04_ExpendPart02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input years:");
        int years = scanner.nextInt();
        System.out.println("input months");
        int months = scanner.nextInt();
        int days = 0;
        switch (months) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if ((years % 4 == 0 && years % 100 != 0) || years % 400 != 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        System.out.println(years + "years" + months + "months has " + days + "days");
    }
}
