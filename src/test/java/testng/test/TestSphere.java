package testng.test;

import org.testng.Assert;
import org.testng.annotations.*;




public class TestSphere
{

    @BeforeClass
    public void debut()
    {
        System.out.println("Début du test sphere");
    }

    @Test
    public void testSphere() 
    {
    Sphere s = new Sphere(new Point(0, 0), 3);
    double surface = s.surface();
    double volume = s.volume();
    System.out.println("Surface calculée : " + surface);
    System.out.println("Volume calculé : " + volume);

    Assert.assertEquals(surface, 4 * Math.PI * 9, 0.001);
    Assert.assertEquals(volume, (4.0 / 3.0) * Math.PI * 27, 0.001);
    }

    @AfterClass
    public void fin()
    {
        System.out.println("===============================================================================");
    }
}