import java.util.Scanner;

public class array_2D_1 {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        int b[][]=new int[3][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array of a");
        for (int i = 0;i<a.length;i++) {//rows
            for (int j = 0;j<a[0].length;j++){//column
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter array of b");
        for (int i = 0;i<b.length;i++) {//row
            for (int j = 0;j<b[0].length;j++){//column
                b[i][j]= sc.nextInt();
            }
        }
        for (int i = 0;i<a.length;i++) {//row
            for (int j = 0;j<a[0].length;j++){//column
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0;i<b.length;i++) {//row
            for (int j = 0;j<b[0].length;j++){//column
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        //multiplication
        int c[][]=new int[a[0].length][b.length];
        for(int i = 0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<b.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];

                }
            }
        }
        System.out.println("multiplied array");
        for (int i = 0;i<c.length;i++) {//row
            for (int j = 0;j<c[0].length;j++){//column
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
