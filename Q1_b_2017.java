public class Q1_b_2017 {
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5};
        Integer b[]=a;
        b[3]=8;
        a[4]=9;
        for (int i = 0;i<a.length;i++)
        {
            a[i]=a[i]*b[i+1];
        }
        for (int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
