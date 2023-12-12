package oo.day05_vis;

import static sakai.DividingLine.dividingLine;

public class SeasonsEnumTest {
    public static void main(String[] args) {
        Seasons seasonsWinter = Seasons.WINTER;
        System.out.println(seasonsWinter.getSeasonName() + "," + seasonsWinter.getSeasonDesc());
        Seasons seasonsSummer = Seasons.SUMMER;
        System.out.println(seasonsSummer + seasonsSummer.getSeasonName());
        dividingLine();

        Seasons[] seasons = Seasons.values();
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getSeasonName() + "," + seasons[i].getSeasonDesc());
        }
    }
}
