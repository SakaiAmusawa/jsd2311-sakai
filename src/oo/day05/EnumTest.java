package oo.day05;

public class EnumTest {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();//获取所有的枚举对象
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }


/*        Seasons s = Seasons.WINTER;
        switch (s) {
            case SPRING:
                System.out.println("春");
                break;
            case SUMMER:
                System.out.println("夏");
                break;
            case AUTUMN:
                System.out.println("秋");
                break;
            case WINTER:
                System.out.println("冬");
        }*/
    }
}
