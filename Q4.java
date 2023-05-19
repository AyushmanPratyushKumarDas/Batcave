import java.util.Scanner;

public class Q4 {

    public static <E> void PrintArray( E[] inputArray)
    {
        for (int i =0;i<inputArray.length;i++)
        {
            System.out.println(inputArray[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a[]=new Integer[5];
        String b[]=new String[5];
        System.out.println("enter array elements");
        for (int i = 0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Integer array content");
        PrintArray(a);
        System.out.println("enter array elements");
        for (int i = 0;i<b.length;i++)
        {
            b[i]=sc.next();
        }
        System.out.println("String array content");
        PrintArray(b);
    }
}
