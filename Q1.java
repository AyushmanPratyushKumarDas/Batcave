import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number greater than 2");
		int m = sc.nextInt();
		int n=0;
		while(m>2)
		{
			m=m/2;
			n++;
			
		}
		System.out.println(n);
				
	}
}

	


