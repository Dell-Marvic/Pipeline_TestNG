package testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;



public class GeometryTest 
{

    // @BeforeTest
    // public void debut()
    // {
    //     System.out.println("Début du test");
    // }

    @Test
    public void testPoints()
    {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double dist = a.distance(b);
        Assert.assertEquals(dist, 5.0, 0.001, "La distance doit être 5.0");
    }

    @Test
    public void testSegment() 
    {
        Segment s = new Segment(new Point(1, 2), new Point(4, 6));
        Assert.assertEquals(s.length(), 5.0, 0.001);
    }

    @Test
    public void testCircle() 
    {
        Circle c = new Circle(new Point(0, 0), 2);
        Assert.assertEquals(c.perimetre(), 2 * Math.PI * 2, 0.001);
        Assert.assertEquals(c.surafce(), Math.PI * 4, 0.001);
    }

    @Test
    public void testSphere() 
    {
        Sphere s = new Sphere(new Point(0, 0), 3);
        Assert.assertEquals(s.surface(), 4 * Math.PI * 9, 0.001);
        Assert.assertEquals(s.volume(), (4.0 / 3.0) * Math.PI * 27, 0.001);
    }

    @Test
    public void testSphereSurfaceAndVolume() 
    {
    Sphere s = new Sphere(new Point(0, 0), 3);
    double surface = s.surface();
    double volume = s.volume();
    System.out.println("Surface calculée : " + surface);
    System.out.println("Volume calculé : " + volume);

    Assert.assertEquals(surface, 4 * Math.PI * 9, 0.001);
    Assert.assertEquals(volume, (4.0 / 3.0) * Math.PI * 27, 0.001);
}
}