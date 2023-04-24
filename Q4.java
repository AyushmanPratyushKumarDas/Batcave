import java.util.Scanner;

public class Q4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a[] = new char[3];
		System.out.println("enter characters");
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(i);
		}
		for(int i =0;i<a.length;i++)
			for(int j =0;j<a.length;j++)
				for(int k =0;k<a.length;k++)
				{
					if(i!=j && i!=k && j!=k)
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
	
				
		
	}

}
