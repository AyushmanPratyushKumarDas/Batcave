public class ese_hi {
    public static void main(String[] args) {
       String s = "omm";
        System.out.println(s.length());
        int n = 12345;
        String s1 = String.valueOf(n);
        int length = s1.length();
        String s2 = s1.substring(0,length-1);
        System.out.println(s2);
    }
}
