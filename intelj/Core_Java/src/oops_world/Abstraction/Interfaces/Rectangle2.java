package oops_world.Abstraction.Interfaces;

public class Rectangle2 implements Shape1,Shape2 {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    @Override
    public void shapename() {
        System.out.println("Area and Perimeter of Circle");
    }
}
