package stageSummary;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("你吃什么：");
        int days = scanner.nextInt();
        switch (days) {
            case 1:
            case 2:
            case 3:
                System.out.println("noodles");
                break;
            case 4:
            case 5:
                System.out.println("rice");
                break;
            case 6:
            case 7:
                System.out.println("Hamburg");
                break;
        }
    }
}
