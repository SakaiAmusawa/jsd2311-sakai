package summary;

public class Sum {
    public static void main(String[] args) {
        int times = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                times++;
            }
        }
        System.out.println(times);
        System.out.println(sum);
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        System.out.println(total);
    }
}
