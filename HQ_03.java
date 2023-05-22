import java.util.Scanner;

public class HQ_03 {
   public static boolean Palindrome(String s)
   {
       if(s.length()==0||s.length()==1){return true;}
       if(s.charAt(0)==s.charAt(s.length()-1))
       {
           return Palindrome(s.substring(1,s.length()-1));
       }
       return false;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String s = sc.nextLine();
        System.out.println(Palindrome(s));
    }
}
