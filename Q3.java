import java.util.Scanner;

public class Q3 {
	public  void checknum(int n)
	{
		int b=0,m=1;
		while(n>0)
		{
			int rem = n%10;
			b=b+rem;
			m=m*rem;
			n=n/10;
		}
		if(b==m)
			System.out.println("Spy number hai re baba");
		else
			System.out.println(" spy number nahi hai vro");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3 q = new Q3();
		Scanner sc = new Scanner(System.in);
		System.out.println("number dal vro");
		int x = sc.nextInt();
		q.checknum(x);

	}

}
