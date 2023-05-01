import java.util.Scanner;

class complex
{
	int real,img;
	/*complex(int i,int j)
	{
		
	}*/
	void setdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the data..");
		real=sc.nextInt();
		img = sc.nextInt();
	}
	void display()
	{
		System.out.println("the complx number is "+real+"+"+img+"i");
	}
	public static complex add(complex c1,complex c2) 
	{
		complex c = new complex();
		c.img=c1.img+c2.img;
		c.real=c1.real+c2.real;
		System.out.println("the added number is "+c.real+"+"+c.img+"i");
		return c;
	}
}

public class Q2_way2 {
	public static void main(String[] args) {
		complex c1 = new complex();
		complex c2 = new complex();
		c1.setdata();c2.setdata();
		c1.display();c2.display();
		complex.add(c1, c2);

	}

}
