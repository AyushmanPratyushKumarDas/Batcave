public class Q2_b_2017 {
    static boolean isOdd(int n)
    {
        /*if((n&1)!=0)
            return true;
        else
            return false;*/
        String  s = Integer.toBinaryString(n);
        if(s.charAt(s.length()-1)!='0')
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isOdd(90));
    }
}
