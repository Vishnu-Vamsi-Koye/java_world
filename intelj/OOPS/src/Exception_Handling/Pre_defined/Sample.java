package Exception_Handling.Pre_defined;

public class Sample {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=0;
        String s="Hello World";
        try{
            s.charAt(50);
            c=a/b;
            System.out.println("Division excuted and value is:"+c);
        }
        catch (Exception e)
        {
            System.out.println("Expection we got is :- "+e);
        }
        finally {
            System.out.println("Thanks for performing Calculations");
        }
    }
}
