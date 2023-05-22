import java.util.Scanner;
class InvalidBalanceException extends Exception
{
    @Override
    public String toString() {
        return "Balance cannot be less than 0";
    }
}
class Bank
{
    int Acc_no,balance_of_cost;
    String name;
    static Scanner sc =new Scanner(System.in);
    void input_and_display() throws Exception
    {
        System.out.println("enter the name");
        name = sc.nextLine();
        System.out.println("enter account number");
        Acc_no=sc.nextInt();
        System.out.println("enter balance");
        balance_of_cost = sc.nextInt();
        if (balance_of_cost<=0){
            throw new InvalidBalanceException();
        }
        else
        {
            System.out.println("name:"+name+"/n"+
                    "account number:"+Acc_no+"/n"+
                    "Balance of customer:"+balance_of_cost);
        }
    }
}
public class HQ_01 {
    public static void main(String[] args) throws Exception {
        Bank b = new Bank();
        b.input_and_display();
    }
}
