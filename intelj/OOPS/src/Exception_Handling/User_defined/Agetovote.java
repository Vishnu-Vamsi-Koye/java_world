package Exception_Handling.User_defined;

public class Agetovote {
    void vote(int age) throws tooyoungertovote
    {
        if (age<18)
        {
            throw new tooyoungertovote("You need to wait untill you grown upto 18years");
        }
        else
        {
            System.out.println("You can Vote");
        }

    }

}
