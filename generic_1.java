public class generic_1 {

    <T> void m1(T t1,T t2)
    {
        if(t1.equals(t2))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        generic_1 g1 = new generic_1();
        Integer i = 1;
        Integer j = 1;
        String s = "1";
        String s2 = String.valueOf(j);
        //object class is parent of all classes
        g1.<Object>m1(s,s2);

    }
}
