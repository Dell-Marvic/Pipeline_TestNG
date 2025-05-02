package testng.test;

public class Sphere
{
    private Point centre;
    private double rayon;

    public Sphere(Point centre, double rayon)
    {
        this.centre = centre;
        this.rayon = rayon;
    }

    public double volume()
    {
        return (4.0 / 3.0) * Math.PI * Math.pow(rayon, 3);
    }

    public double surface()
    {
        return 4 * Math.PI * Math.pow(rayon, 2);
    }

    public Point getCentre()
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

    public void setRadius(double rayon) 
    {
        this.rayon = rayon;
    }
}