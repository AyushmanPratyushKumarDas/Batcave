import java.util.Scanner;

public class Q9 {
	public static double sumMAjorDiagonal(double[][]m) 
	{ double sum = 0;
		for(int i = 0;i<m.length;i++)
		{
				sum=sum+m[i][i];
		
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		int r = sc.nextInt();
		int c = sc.nextInt();
		double[][] a = new double[r][c];
		System.out.println("Enter the element of 2d array");
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("the 2d array is....");
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("the sum is.....");
		System.out.println(Q9.sumMAjorDiagonal(a));



	}

}
