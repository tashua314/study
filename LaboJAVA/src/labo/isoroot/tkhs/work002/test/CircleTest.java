package labo.isoroot.tkhs.work002.test;

import static org.junit.Assert.assertEquals;
import labo.isoroot.tkhs.work002.Circle;

import org.junit.Test;

public class CircleTest {

    @Test
    public void test() {
        Circle circle = new Circle(3);

        double ans = circle.getArea();

        System.out.println(3*3*Math.PI);
        System.out.println(ans);
        assertEquals( 3*3*Math.PI, ans, 0.001);
    }

}
