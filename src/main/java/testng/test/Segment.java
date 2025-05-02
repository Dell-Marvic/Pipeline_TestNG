package testng.test;

public class Segment
{
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length()
    {
        return p1.distance(p2);
    }
}