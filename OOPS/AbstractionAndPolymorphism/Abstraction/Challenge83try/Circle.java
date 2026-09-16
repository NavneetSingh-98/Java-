package OOPS.AbstractionAndPolymorphism.Abstraction.Challenge83try;

public class Circle extends Shape{

    public static final double radius = 0;
    private final double radiusInCms;

    public Circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    @Override
    public double calculateArea() {
       return Math.PI * Math.pow(radiusInCms, 2);
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }
}
