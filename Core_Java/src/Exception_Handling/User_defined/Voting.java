package Exception_Handling.User_defined;

public class Voting {
    public static void main(String[] args) {
        Agetovote ag=new Agetovote();
        try {
            ag.vote(15);
        } catch (tooyoungertovote e)
        {
            System.out.println(e);

        }
        finally {
            System.out.println("Thanks for Partispating in voting");
        }
    }
}
