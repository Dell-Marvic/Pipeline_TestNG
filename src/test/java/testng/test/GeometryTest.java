package testng.test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import testng.test.Circle;
import testng.test.Point;
import testng.test.Sphere;
import testng.test.TestListener;

@Listeners(TestListener.class)
public class GeometryTest 
{

    private Point pointA;
    private Point pointB;

    public GeometryTest() {}

    @BeforeSuite
    public void beforeSuite() 
    {
        System.out.println("[BeforeSuite] Initialisation générale de la suite de tests");
    }

    @BeforeTest
    public void beforeTest(ITestContext context) 
    {
        System.out.println(" [BeforeTest] Lancement du test : " + context.getName());
    }

    @BeforeGroups("distance")
    public void beforeDistanceGroup() 
    {
        System.out.println("[BeforeGroups] Initialisation pour le groupe 'distance'");
    }

    @BeforeClass
    public void setup() 
    {
        pointA = new Point(0, 0);
        pointB = new Point(3, 4);
        System.out.println(" [BeforeClass] Points initialisés");
    }

    @Test(groups = "distance")
    public void testDistanceBetweenPoints() 
    {
        double dist = pointA.distance(pointB);
        System.out.println("Distance calculée : " + dist);
        Assert.assertEquals(dist, 5.0, 0.001, "La distance doit être 5.0");
    }

    @Test
    public void testSegmentLength() 
    {
        Segment s = new Segment(new Point(1, 2), new Point(4, 6));
        Assert.assertEquals(s.length(), 5.0, 0.001);
    }

    @Test(dataProvider = "circleData")
    public void testCirclePerimeterAndArea(double radius) 
    {
        Circle c = new Circle(new Point(0, 0), radius);
        Assert.assertEquals(c.perimetre(), 2 * Math.PI * radius, 0.001);
        Assert.assertEquals(c.surface(), Math.PI * radius * radius, 0.001);
    }

    @DataProvider(name = "circleData")
    public Object[][] circleDataProvider() 
    {
        return new Object[][] 
        {
            {1.0}, {2.0}, {3.0}
        };
    }

    @Test(groups = "3d")
    public void testSphereSurfaceAndVolume() 
    {
        Sphere s = new Sphere(new Point(0, 0), 3);
        Assert.assertEquals(s.surface(), 4 * Math.PI * 9, 0.001);
        Assert.assertEquals(s.volume(), (4.0 / 3.0) * Math.PI * 27, 0.001);
    }

    @AfterClass
    public void tearDown() 
    {
        System.out.println(" [AfterClass] Nettoyage après les tests de cette classe");
    }


}