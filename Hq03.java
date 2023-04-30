import java.util.Formattable;
import java.util.Scanner;

public class Hq03 {
    static void dotProduct(int[]a,int[]b,int[]c)
    { // length of all array should be same
        System.out.println("let's store the dot product in another array");
        for (int i = 0;i<c.length;i++)
        {
            c[i]=a[i]*b[i];
        }
        System.out.println("the multiplied array is");
        for (int i = 0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        System.out.println("enter integers in the given array a");
        for (int i = 0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        System.out.println("enter integers in the given array b");
        for (int i = 0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("print a and b");
        System.out.println("array a is..");
        for (int i = 0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("array b is..");
        for (int i = 0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Hq03.dotProduct(a,b,c);

    }
}
