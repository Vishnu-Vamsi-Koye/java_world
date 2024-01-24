package oops_world.Abstraction.Abstract;

import static java.lang.Math.round;

public class CalculateAreaofShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.about();
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of circle :-"+round(circle.Area()));
        System.out.println("Area of Rectangle :-"+rectangle.Area());
    }
}
