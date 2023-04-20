import java.util.Scanner;

class complex
{
    int real,imag;
    public complex(int i, int i1)
    {

    }
    void setdata()
    {
        Scanner sc  =new Scanner(System.in);
        real = sc.nextInt();
        imag = sc.nextInt();

    }
    void display ()

    {
        System.out.println("The  c0mplex number is: "+real+"+"+imag+"i");
    }
    public static complex add(complex n1,complex n2)
    {
        complex cn = new complex(0,0);
        cn.real = n1.real+ n2.real;
        cn.imag = n1.imag+n2.imag;
        System.out.println(cn.real+"+"+ cn.imag+"i");
        return cn;

    }


  
}
public class Q2 {
    public static void main(String[] args) {
        complex c = new complex(0,0);
        complex c1 = new complex(0,0);
        c.setdata();
        c.display();
        c1.setdata();
        c.display();
        c1.display();
        System.out.println("the sum is: ");
        complex.add(c,c1);





    }
}
