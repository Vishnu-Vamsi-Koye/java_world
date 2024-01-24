package oops_world.Abstraction.Abstract;

//Abstraction in Java is like playing with toys. When you have a remote-controlled car, you don't need to know how the car's engine works;
// you just press buttons on the remote to make it go forward, backward, or turn.
// The details of how the car works inside are hidden, and you interact with it using simple actions.

/*Note: We cannot create an instance of an abstract class using the new keyword.
The abstract class Shapes can only be used as a base class for concrete subclasses, and you need to create an instance of one of those subclasses*/


public abstract class Shapes {
    abstract double Area();

    void about()
    {
        System.out.println("We can be able to use area method to get area of any shape given");
    }

}
