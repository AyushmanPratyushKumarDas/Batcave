import java.util.Scanner;

public class sll_create_way_2{
    int info;
    static sll_create_way_2 link = null;
    static Scanner sc = new Scanner(System.in);
    public static void create_sLL() {
        sll_create_way_2 p[] = new sll_create_way_2[4];
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    p[i] = new sll_create_way_2();
                    System.out.println("enter info ");
                    p[i].info = sc.nextInt();
                    p[i].link = null;
                    link = p[i];
                }

                if (j == (i - 1)) {
                    p[j] = new sll_create_way_2();
                    System.out.println("enter info ");
                    p[j].info = sc.nextInt();
                    p[j].link = null;
                    p[i] = p[j];
                }

            }
        }
    }

    public static void main(String[] args) {
        create_sLL();
    }
}
