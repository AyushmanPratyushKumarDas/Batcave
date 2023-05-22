import java.util.Scanner;

public class Q8 {
    public static int reverse(int n)
    {
        if(n<10){return n;}
        int powOfTen = (int)(Math.pow(10,String.valueOf(n).length()-1));
        int rev =((n%10)*powOfTen)+reverse(n/10);//recursive step
        return rev;
        //String.valueOf(n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("the reversed number="+reverse(n));
    }
}
