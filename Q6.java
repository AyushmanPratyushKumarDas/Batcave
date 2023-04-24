import java.util.Scanner;

public class Q6 {
	public static int sum(int n)
	{
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			sum= sum+rem;
			n=n/10;
			
		}
		
		return sum;
	   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int x = sc.nextInt();
		while(x>9)
		{
			x=sum(x);
		}
		
		System.out.println(x);
		

	}

}
