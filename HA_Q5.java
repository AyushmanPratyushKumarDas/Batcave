import java.util.Scanner;

public class HA_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		System.out.println("Enter the element of 2d array");
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				a[i][j]= (int)(Math.random()*2);
			}
		}
		for(int i = 0;i<r;i++)
		{
			for(int j = 0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int max =0,index=0;
		for(int i = 0;i<a.length;i++)//rows
		{ int count = 0;
			for(int j = 0;j<a[0].length;j++)//columns
			{
				if(a[i][j]==1) 
				{
					count++;
				}
				if(count>max)
				{
					count = max;
					index = i;
				}	
			}
		}
		int max1 = 0,index1 = 0;
		for(int i = 0;i<a[0].length;i++)//column
		{ int count = 0;
			for(int j = 0;j<a.length;j++)//row
			{
				if(a[i][j]==1) 
				{
					count++;
				}
				if(count>max1)
				{
					count = max1;
					index1 = i;
				}	
			}
		}
		System.out.println("the index has max count in row:"+index);
		System.out.println("the index has max count in column:"+index1);
		
	}

}
