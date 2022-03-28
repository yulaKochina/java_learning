package ru.yuko.java_learning.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yuko.java_learning.sandbox.Square;

public class SquareTests {

    @Test
    public void testArea(){
        Square s = new Square(6);
        Assert.assertEquals(s.area(), 36);
    }

}
