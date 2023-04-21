import java.util.Scanner;

class Deposit
{
    long principal;int time;double rate;double total_amt;
    Deposit(){}
    Deposit(long principal,int time,double rate)
    {
        this.principal=principal;this.time=time;this.rate=rate;
    }
    Deposit(long principal,int time){
        this.time=time;this.principal=principal;
    }
    Deposit(long principal,double rate)
    {
        this.principal=principal;this.rate=rate;
    }
    void display()
    {
        System.out.println(principal+" "+time+" "+rate);
    }
    void cal_amt()
    {
        total_amt=principal+(principal*rate*time)/100;
        System.out.println(total_amt);
    }


}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the values: ");
        long x = sc.nextLong();int y = sc.nextInt();double z = sc.nextDouble();
        Deposit d = new Deposit(x,y,z);
        d.display();d.cal_amt();
    }
}
