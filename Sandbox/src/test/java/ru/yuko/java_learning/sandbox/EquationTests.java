package ru.yuko.java_learning.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

    @Test
    public void testEquation1(){
        Equation e = new Equation(1, 1 ,1);
        Assert.assertEquals(e.rootNumber(), 0);
    }

    @Test
    public void testEquation2(){
        Equation e = new Equation(2, 4 ,2);
        Assert.assertEquals(e.rootNumber(), 1);
    }

    @Test
    public void testEquation3(){
        Equation e = new Equation(2, 6 ,3);
        Assert.assertEquals(e.rootNumber(), 2);
    }
}
