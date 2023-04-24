import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("the array is: ");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		int max = arr[0];int min = arr[n-1];
		int count_max=1;
		int count_min=1;
		int min_i=0;int max_i=0;

		for(int i = 0;i<arr.length;i++)
		{
			if(min>arr[i]) {
				min=arr[i];
				count_min=1;
				min_i=i;
				
			}
			else if(arr[i]==min)
			{
				count_min++;
				min_i=i;
			}
			if(max<arr[i]) {
				max=arr[i];
				count_max=1;
				
			}
		}
		System.out.println("the minimum element "+arr[0] +" occures "+count_min+" times and the maximum element "+arr[n-1] +" occurs "+count_max+" times");

		
		
		

	}

}
