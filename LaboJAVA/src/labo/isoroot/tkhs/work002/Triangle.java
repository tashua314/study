package labo.isoroot.tkhs.work002;

import java.util.Random;

public class Triangle implements Form{
    private double base;
    private double height;
    private static final int MAX_SIZE = 10;

    public Triangle() {
        Random random = new Random();
        this.base = random.nextInt(MAX_SIZE)+1;
        this.height = random.nextInt(MAX_SIZE)+1;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {

        return base;
    }

    public double getHeight() {

        return height;
    }

    public double getArea() {

        return base * height / 2;
    }

    public String getDescription() {

        StringBuilder str = new StringBuilder();
        str.append("三角形\n");
        str.append("底辺：" + base + "　高さ：" + height);
        str.append("\n面積：" + getArea());

        return str.toString();
    }


}
