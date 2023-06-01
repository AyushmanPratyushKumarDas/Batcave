interface a1
{
    public void m1();
}
interface a2 extends a1
{
    public void m2();
}
class c implements a2{
    public void m1(){
        System.out.println("m1");
    }
    public void m2()
    {
        System.out.println("m2");
    }
}

public class interface_q2 {
    public static void main(String[] args) {
        c c1 = new c();
        c1.m1();c1.m2();
        String s1 = "omm";
        String s2 = "om";
        //String s2 = s1;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
