import java.util.Scanner;

public class HA_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the line");
		int n = sc.nextInt();
		String[] a= new String[n];
		sc.nextLine();
		System.out.println("enter the String");
		for(int i = 0;i<a.length;i++)
		{
			a[i]=sc.nextLine();
		}
		System.out.println("output");
		for(int i = 0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("reversal output");
		for(int i = a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
