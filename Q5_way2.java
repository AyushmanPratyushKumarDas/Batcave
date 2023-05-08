class Deposit
{
    long principal;
    int time;
    double rate;
    double total_amt;
    Deposit()
    {
    	this.principal=1000;
    	this.time=1;
    	this.rate=5;
    }
    Deposit(long principal,int time,double rate)
    {
        this.principal=principal;
        this.time=time;
        this.rate=rate;
    }
    Deposit(long principal,int time){
       this(); //call a consturctor using this keyword the the line must be the first line of that method or constructor..
       this.principal=principal; //this is overriding
       this.time=time; //this is overriding
       
    }
    Deposit(long principal,double rate)
    {
    	this();
        this.principal=principal;
        this.rate=rate;
    }
    void display()
    {
        System.out.println(principal+" "+time+" "+rate);
    }
    void cal_amt()
    {
        this.total_amt=this.principal+(this.principal*this.rate*this.time)/100.0;
        System.out.println(total_amt);
    }


}
public class Q5_way2 {

	public static void main(String[] args) {
		Deposit d = new Deposit();
		d.cal_amt();
		Deposit d1 = new Deposit(5000L,5.0);
		d1.cal_amt();

	}

}
