import java.util.Scanner;

public class Hq04 {
    public static double[][] addmatrix(double a[][], double b[][])
    {
        int n = a.length; //a.length==b.length
        double [][] c = new double[n][n];

        System.out.println("add two matrix.........");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the given matrix is....");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


        return c;
    }
        public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ineger");
        int n = sc.nextInt();
        double [][]a = new double[n][n];
        double [][]b = new double[n][n];
            System.out.println("enter matrix a");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = sc.nextDouble();
                }
            }
            System.out.println("enter for matrix b");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j <b.length; j++) {
                    b[i][j] = sc.nextDouble();
                }
            }
            Hq04.addmatrix(a,b);


        }

}
