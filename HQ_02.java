import java.util.Arrays;
import java.util.Scanner;

public class HQ_02 {
    public static int binarySearch(int []a, int b,int high,int low)
    {
        if(low>high)
        {
            return -1;
        }
        int mid = (high+low)/2;
        if(a[mid]==b)
        {
            return mid;
        }
        else if(a[mid]>b)
        {
            return binarySearch(a,b,high,mid-1);
        }
        else
            return binarySearch(a,b,mid+1,low);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = {11,22,33,44,55};
        System.out.println(binarySearch(a,44,5,1));
    }
}
