package testng.test;

public class Circle
{
    private Point centre;
    private double rayon;

    public Circle(Point centre, double rayon)
    {
        this.centre = centre;
        this.rayon = rayon;
    }

    public double surafce()
    {
        return Math.PI * rayon * rayon;
    }

    public double perimetre()
    {
        return 2 * Math.PI * rayon;
    }

    public Point getCenter()
    {
        return centre;
    }

    public void setCentre(Point centre)
    {
        this.centre = centre;
    }

    public double getRayon()
    {
        return rayon;
    }

    public void setRayon(double rayon) 
    {
        this.rayon = rayon;
    }
}