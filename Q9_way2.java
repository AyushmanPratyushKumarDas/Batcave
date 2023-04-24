import java.util.Scanner;

class a
{
	int r,c,sum;int a[][] = new int[r][c];
	void input_array()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		 r = sc.nextInt();
		 c = sc.nextInt();
		System.out.println("Enter the element of 2d array");
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
	}
	void show_array() {
		
		System.out.println("the 2d array is: ");
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
				if(i==j) 
				{
					sum=sum+a[i][j];
				}
			}
			System.out.println();
		}
		
	}
	void display_sum()
	{
		System.out.println("the sum of the diagonal elements:"+sum);
	}
	
}

public class Q9_way2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1 = new a();
		a1.input_array();
		a1.show_array();
		a1.display_sum();

	}

}
