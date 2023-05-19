import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class q2 extends Exception {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
        System.out.println("enter 4 colors");
        String a[] = new String[4];
        for(int i = 0;i<a.length;i++)
        {
            a[i]=sc.nextLine();
        }
        System.out.println("character a 100th position of a[1]");
        try{
            System.out.println(a[1].charAt(100));
        }
         catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException");
        }
        System.out.println("enter another number");
        try{
            a[4]="blow";
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }
        System.out.println("the colors are...");
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
