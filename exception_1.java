class ganduException extends Exception
{
    ganduException(String s)
    {super(s);}
    //@Override
    //public String toString() {
     //   return "bro wtf r u doin";
    }

public class exception_1 {
    public static void main(String[] args)throws ganduException {
        int num = 100;

        if(num<100)
        {
            throw new ganduException("nope");
        }
    }
}
