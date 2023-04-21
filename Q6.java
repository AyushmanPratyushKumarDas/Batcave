import java.util.Scanner;

abstract  class shape {
    int x,y,z;
    abstract void area();
}
class circle extends shape
{
    circle(int x)
    {
       this.x = x;
    }
    void area()
    {
        System.out.println(3.14*(double)(x*x));
    }
}
class tringle extends shape
{
    tringle(int x,int y)
    {
        this.x=x;this.y=y;
    }
    void area()
    {
        System.out.println(0.5*(double)(x*y));
    }
}
class square extends shape
{
    square(int x,int y)
    {
        this.x = x;this.y=y;
    }
    void area()
    {
        System.out.println(x*y);
    }
}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        int r = sc.nextInt();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int h = sc.nextInt();int b = sc.nextInt();
        square sq = new square(s1,s2);
        tringle ti = new tringle(h,b);
        circle c = new circle(r);
        sq.area();ti.area();c.area();

    }
}
