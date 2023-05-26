public class Q5 {
    public static int sum_of_digits(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        if(sum<10){return sum;}
        else
            return sum=sum_of_digits(sum);
    }
    public static void main(String[] args) {

        System.out.println(sum_of_digits(9294));
    }
}
