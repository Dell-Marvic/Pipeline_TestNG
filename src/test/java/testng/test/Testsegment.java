package testng.test;

import org.testng.Assert;

import testng.test.Point;

import org.testng.annotations.*;

public class Testsegment 
{
    @BeforeClass
    public void debut()
    {
        System.out.println("Début du test segment");
    }


    @Test
    public void testSegment() 
    {
        Segment s = new Segment(new Point(1, 2), new Point(4, 6));
        System.out.println("La distance entre les points A et B est de :" + s.length());
        Assert.assertEquals(s.length(), 5.0, 0.001);
    }

    @AfterClass
    public void fin()
    {
        System.out.println("===============================================================================");
    }
}
