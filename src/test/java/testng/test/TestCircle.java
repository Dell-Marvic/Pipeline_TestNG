package testng.test;

import org.testng.Assert;
import testng.test.Circle;
import testng.test.Point;

import org.testng.annotations.*;

public class TestCircle 
{
    @BeforeClass
    public void debut()
    {
        System.out.println("Début du test cercle");
    }


    @Test
    public void testCircle() 
    {
        Circle c = new Circle(new Point(0, 0), 2);
        Assert.assertEquals(c.perimetre(), 2 * Math.PI * 2, 0.001);
        System.out.println("Le périmetre du cercle est de :" + c.perimetre());
        Assert.assertEquals(c.surface(), Math.PI * 4, 0.001);
        System.out.println("La surface du cercle est de :" + c.surface());
    }

    @AfterClass
    public void fin()
    {
        System.out.println("===============================================================================");
    }


}
