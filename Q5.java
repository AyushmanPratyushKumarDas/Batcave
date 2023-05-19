import java.util.Scanner;

public class Q5 {
    public static <T> int count(T[] array, T item)
    {
        int count =0;
        for(int i =0;i<array.length;i++) {
            if (array[i] == item) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a[]=new Integer[5];
        String b[]=new String[5];
        System.out.println("enter array elements");
        for (int i = 0;i<a.length;i++)
        {
            a[i]=sc.nextInt();}
        int t = 4;
        System.out.println("Number of times "+t
                +" present in the array is "+count(a,t));
        System.out.println("enter array elements");
        for (int i = 0;i<b.length;i++)
        {
            b[i]=sc.next();
        }
        String s = "RRR";
        System.out.println("Number of times "+s
                +" present in the array is "+count(b,s));
    }
}
