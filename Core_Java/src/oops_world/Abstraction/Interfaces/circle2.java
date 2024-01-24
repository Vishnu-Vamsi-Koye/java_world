package oops_world.Abstraction.Interfaces;

class circle2 implements Shape1, Shape2 {
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void shapename() {
        System.out.println("Area and Perimeter of Circle");
    }
}