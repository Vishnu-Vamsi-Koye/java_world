package oops_world.Polymorphism.Method_Overloading;

public class Solution {
    public static void main(String[] args) {
        Calcy cal=new Calcy();
        int sum=cal.add(2,3);
        int sum1=cal.add(2,3,5);
        System.out.println("Addition of two numbers :" +sum);
        System.out.println("Addition of three numbers :" +sum1);
    }
}
