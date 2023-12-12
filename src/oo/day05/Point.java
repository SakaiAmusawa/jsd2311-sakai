package oo.day05;

/*
标准JavaBean的配置：1.私有的成员变量，公开的getter和setter方法
                 2. 包含一个无参的构造方法
 */
public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
