public class Q1_a_2018 {
    public static void main(String[] args) {
        int i,j,k,x=5;
        for (i=1;i<=2;i++)
            for (j=1;j<=i;j++)
                for (k=1;k<=j;k++){
                    x=x+1;
                    System.out.println(x+""+i+""+j+""+k);
                }
    }
}
