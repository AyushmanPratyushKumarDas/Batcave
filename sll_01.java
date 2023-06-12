import java.util.Scanner;

public class sll_01 {
    int info;
    static sll_01 link = null;
    static Scanner sc = new Scanner(System.in);
    public static void create_sLL()
    {
        sll_01 n1 = new sll_01();
        System.out.println("enter info ");
        n1.info= sc.nextInt();
        n1.link=null;
        link = n1; //locating the object
        System.out.println("want more nodes(y/n)");
        char c = sc.next().charAt(0);
        while(c!='n')
        {
            sll_01 n2 = new sll_01();
            System.out.println("enter info ");
            n2.info= sc.nextInt();
            n1.link=null;
            n2=n1;
            System.out.println("want more nodes(y/n)");
            c = sc.next().charAt(0);
        }
    }

    public static void main(String[] args) {
        create_sLL();
    }
}
