import java.util.Scanner;

class product
{
    int pi;String pname;
    static int tot_price=0;
    product(int pi,String pname)
    {
    	this.pi=pi;this.pname=pname;
    }
    void display()
    {
    	System.out.println(pi+" "+pname);
    }
}
public class Q4_way2 {

	public static void main(String[] args) {
		product p[]=new product[3];
		int z = 0;
		for(int i =0;i<3;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter price...");
			int x = sc.nextInt();
			System.out.println("enter name...");
			String y = sc.next();
			p[i]=new product(x,y);
			z=z+x;
		}
		for(int i =0;i<3;i++)
		{
			p[i].display();

		}
		product.tot_price=z;
		System.out.println("total price is "+product.tot_price);
		
	}

}
