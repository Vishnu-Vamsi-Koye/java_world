package oops_world.Polymorphism.Method_Overloading;

public class Calcy {
    public int add(int a,int b)
    {
      return  a+b;
    }
    public int add(int a,int b, int c)
    {
        return a+b+c;
    }
    public int sub(int a,int b)
    {
        if (a>b)
        {
            return  a-b;
        }else
        {
            return  b-a;
        }

    }
    public int mul(int a,int b)
    {
        return  a*b;
    }
    public int mul(int a,int b, int c)
    {
        return a*b*c;
    }
    public int div(int a,int b)
    {
        if (a>b)
        {
            return  a/b;
        }else
        {
            return  b/a;
        }

    }
}
