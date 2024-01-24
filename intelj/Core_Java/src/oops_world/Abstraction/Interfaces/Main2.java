package oops_world.Abstraction.Interfaces;

import org.w3c.dom.css.Rect;

public class Main2 {
    public static void main(String[] args) {
        circle2 cir= new circle2();
        cir.setRadius(5.0);
        Rectangle2 rect= new Rectangle2();
        rect.setLength(10);
        rect.setWidth(5);
        cir.shapename();
        System.out.println(cir.calculateArea());
        System.out.println(cir.calculatePerimeter());
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());

    }
}
