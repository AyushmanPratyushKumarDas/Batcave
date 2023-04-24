import java.util.Scanner;

public class Q10 {
	
	public static double sumColumn(double[][]m,int columnIndex) 
	{ double sum = 0;
		for(int i = 0;i<m.length;i++)//the loop will run number of rows times
		{
			sum = sum+m[i][columnIndex];
		
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		int r = sc.nextInt();
		int c = sc.nextInt(); //column
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
		for(int i = 0;i<a[0].length;i++)
		{
			System.out.println("the sum of the members of "+i+"th column is "+Q10.sumColumn(a,i));
		}
		
		

	}

}
