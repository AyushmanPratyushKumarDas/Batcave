import java.util.Scanner;

public class Q9 {
    public static int  nth_Fibonacci(int m,int n)
    { //according to question put m=n;
        if(m==0){return 0;}
        if(m==1){return 1;}
        int fibA = nth_Fibonacci(m-1,n);
        int fibB = nth_Fibonacci(m-2,n);
        int fn = fibA+fibB;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the position");
        int pos = sc.nextInt();
        System.out.println(nth_Fibonacci(num,pos));
    }
}
