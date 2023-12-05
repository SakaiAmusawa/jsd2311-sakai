package day05;

public class Test {
    public static void main(String[] args) {
        int c = 0 ;
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    break;
                }
                c++;
            }
        }
        System.out.println(c);
    }
}
