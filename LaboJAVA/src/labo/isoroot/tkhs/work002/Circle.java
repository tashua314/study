package labo.isoroot.tkhs.work002;

import java.util.Random;

public class Circle implements Form {

    private double radius;
    private static final int MAX_SIZE = 10;

    public Circle() {
        Random random = new Random();
        this.radius = random.nextInt(MAX_SIZE) + 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {

        double area = radius * radius * Math.PI;

        return area;
    }

    public String getDescription() {

        StringBuilder str = new StringBuilder();
        str.append("円\n");
        str.append("半径：" + radius);
        str.append("\n面積：" + getArea());

        return str.toString();

    }

}
