package testng.test;

import org.testng.Assert;
import testng.test.Point;

import org.testng.annotations.*;

public class Testpoint 
{

    @BeforeClass
    public void debut()
    {
        System.out.println("Début du test de point");
    }

    @Test
    public void testPoints()
    {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double dist = a.distance(b);
        System.out.println("La distance entre les points A et B est de :" + dist);
        Assert.assertEquals(dist, 5.0, 0.001, "La distance doit être 5.0");
    }

    @AfterClass
    public void fin()
    {
        System.out.println("===============================================================================");
    }
    
}
