package oops_world.Abstraction.Abstract;

public class Circle extends Shapes {
    private double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double Area() {
        return Math.PI*radius*radius;
    }
}
