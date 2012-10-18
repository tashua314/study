package labo.isoroot.tkhs.work002;

import java.util.Random;

public class Rectangle  implements Form{

    private double longSide;
    private double shortSide;
    private static final int MAX_SIZE = 10;

    public Rectangle() {
        Random random = new Random();
        this.longSide = random.nextInt(MAX_SIZE)+1;
        this.shortSide = random.nextInt(MAX_SIZE)+1;
    }

    public Rectangle(double longSide, double shortSide) {
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public double getLongSide() {
        return longSide;
    }

    public double getShortSide() {
        return shortSide;
    }

    public double getArea() {

        double area = longSide * shortSide;

        return area;
    }

    public String getDescription() {

        StringBuilder str = new StringBuilder();
        str.append("長方形\n");
        str.append("長辺：" +  longSide);
        str.append(", 短辺：" +  shortSide);
        str.append("\n面積：" + getArea());

        return str.toString();
    }

}
