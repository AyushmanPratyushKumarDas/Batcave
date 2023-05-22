import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {
    public static long Factorial(long n)
    {
       if(n==0){return 1;}//base step
        long f1 = Factorial(n-1);
        long fn = n*f1;//recursive step
        return fn;
    }
    public static int power(int x,int n){
        if(n==0){return 1;}
            int mul = power(x,n-1);
            int m = x*mul;
        return m;
    }
    public static int Gcd(int m,int n)//important
    {
        if(n==0) {return m;}
           int rem = Gcd(n,m%n);//m%n=gives reminder
        return rem;
    }
    public static int Binary(int n) {
        if(n==0){return 0;}
        int bin = 2;
        int rem = (n%2)+10*(Binary(n/2));
        return rem;
    }
    public static int Product(int m,int n)
    {
        if(m==0||n==0) {return 0;}
        int p1 = Product(m,n-1);
        int p = m+p1;
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("find factorial of a number");
        long n = sc.nextLong();
        System.out.println(Factorial(n));
        System.out.println("find power");
        int x = sc.nextInt();int N = sc.nextInt();
        System.out.println(power(x,N));
        System.out.println("find gcd");
        int m = sc.nextInt();int b = sc.nextInt();
        System.out.println(Gcd(m,b));
        System.out.println("find binary form");
        int o = sc.nextInt();
        System.out.println(Binary(o));
        System.out.println("find product");
        int l = sc.nextInt();int k = sc.nextInt();
        System.out.println(Product(l,k));
    }
}
