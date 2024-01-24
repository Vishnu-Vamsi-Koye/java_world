package oops_world.Abstraction.Interfaces;

/*
When to Use Which:
Abstract Classes:

Use abstract classes when you want to provide a common base class with shared implementation for its subclasses.
When you need to declare fields (variables) that are shared among subclasses.
When you want to provide a common constructor for subclasses.

Interfaces:

Use interfaces when you want to define a contract that multiple classes can implement.
When you want to achieve multiple inheritance of type.
When you want to provide a common set of methods for unrelated classes.
 */

    interface Shape2 {
        double calculateArea();
        double calculatePerimeter();
    }




