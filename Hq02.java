import java.util.Scanner;

public class Hq02 { //this is actually q1.
     static void check(int a,int b,int c)
    {
        if((a+b)==c)
        {
            System.out.println(a+"+"+b+"="+c);
        }
        else if(a==(b-c))
        {
            System.out.println(a+"="+b+"-"+c);
        }
        else if ((a*b)==c)
        {
            System.out.println(a+"*"+b+"="+c);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[] a= new int[3];
        System.out.println("enter three numbers");
        for (int i = 0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("the numbers are...");
        for (int i = 0;i<3;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("the relation is...");
        Hq02.check(a[0],a[1],a[2]);

    }
}
