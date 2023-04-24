import java.util.Scanner;

public class Q2 {
	
	public static void weight(double w,double z)
	{
		double x = w/Math.pow(z, 2);
		if(x<18.5)
			System.out.println("Underweight");
		else if(x>=18.5 && x<=24.9)
			System.out.println("Normal Weight");
		else if(x>=25 && x<=29.9)
			System.out.println("Overweight");
		else if(x>=30)
			System.out.println("gym jao or get oscar");
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight");
		double x = sc.nextDouble();
		System.out.println("Enter height");
		double y = sc.nextDouble();
		weight(x,y);
		

	}

}
