import java.util.Scanner;

class complex
{
    int real,imag;
    public complex(int i, int i1) {}
    void setdata()
    {
        Scanner sc  =new Scanner(System.in);
        real = sc.nextInt();
        imag = sc.nextInt();
        int n = sc.nextInt();
    }
    void display ()
    {
        System.out.println("The number is: "+real+"+"+imag+"i");
    }
    public static complex add(complex n1,complex n2)
    {
        complex c = new complex(0,0);
        c.real = n1.real+n2.real;
        c.imag = n1.imag+ n2.imag;
         return c;
    }
}
public class Q2 {
    public static void main(String[] args) {

    }
}
