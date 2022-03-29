package ru.yuko.java_learning.pointDistanceTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yuko.java_learning.pointDistance.Point;

public class PointDistanceTests {

    @Test
    public void testZeroPoint() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Assert.assertEquals(p1.distance(p2), 0.0);
    }

    @Test
    public void testPositivePoint() {
        Point p1 = new Point(3, 0);
        Point p2 = new Point(3, 3);
        Assert.assertEquals(p1.distance(p2), 3.0);
    }

    @Test
    public void testNegativePoint() {
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(-3, -3);
        assert ((p1.distance(p2)>=2.82)&&(p1.distance(p2)<=2.8285));
    }
}
