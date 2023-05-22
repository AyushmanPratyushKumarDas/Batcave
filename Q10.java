import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
    public static String Reversal(String s)
    {
        int n = s.length();
      if(s==null){return s;}
      if(n<=1){return s;}
      String re = s.charAt(n-1)+Reversal(s.substring(0,n-1));
      return re;
      //suppose s = "ayushman";
      //s.substring(0,n-1)=>"ayushma"....this is the
        //fundamental step of this recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.next();
        System.out.println(Reversal(s));
    }
}
