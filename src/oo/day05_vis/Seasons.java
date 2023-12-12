package oo.day05_vis;

public enum Seasons {
    SPRING("春天", "万物苏醒"),
    SUMMER("夏天", "百花齐放"),
    AUTUMN("秋天", "硕果累累"),
    WINTER("冬天", "银装素裹");
    private String seasonName;
    private String seasonDesc;

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    Seasons(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
