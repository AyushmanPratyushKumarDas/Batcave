import java.util.Scanner;

class  MarksOutOfBoundException extends Exception
{
    MarksOutOfBoundException(String msg)
    {
        super(msg);
    }

    @Override
    public String toString() {
        return "Mark can't be greater than 100";
    }
}

public class Q3 {
    public static void main(String[] args) throws MarksOutOfBoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Mark");
        int m = sc.nextInt();
        if(m>100)
        {
           throw new MarksOutOfBoundException("out of range");
        }
        else
        {
            System.out.println("the mark is "+m);
        }

    }
}
