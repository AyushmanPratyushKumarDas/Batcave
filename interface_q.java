interface i
{
    abstract public void m1();
    abstract public void m2();
}
abstract class a implements i
{
    public void m1()
    {
        System.out.println("m1");
    }
}
 class b extends a
{
    public void m2()
    {
       // super.m1();
        System.out.println("m2");
    }
}
public class interface_q {
    public static void main(String[] args) {
        b b1 = new b();
        b1.m2();b1.m1();
    }
}
