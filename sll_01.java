import java.util.Scanner;

public class sll_01 {
    int info;
     sll_01 link;
  static sll_01 head = null;
    static Scanner sc = new Scanner(System.in);
    public static void create_sLL()
    {
        sll_01 n1 = new sll_01();
        System.out.println("enter info ");
        n1.info= sc.nextInt();
        n1.link=null;
        head = n1; //locating the object
        System.out.println("want more nodes(y/n)");
        char c = sc.next().charAt(0);
        while(c!='n')
        {
            sll_01 n2 = new sll_01();
            System.out.println("enter info ");
            n2.info= sc.nextInt();
            n2.link=null;
            n1.link=n2;
            n1=n2;
            System.out.println("want more nodes(y/n)");
            c = sc.next().charAt(0);
        }
    }

    //counting the nodes in a linked node
    public static int countnode()
    {
        int count = 0;
        sll_01 temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.link;
        }
        return count;
    }
    public static void display()
    {
        sll_01 temp = head;
        System.out.println("start="+head);
        while(temp!=null)
        {
            System.out.print("["+temp.info+" "+temp.link+"]"+"------>");
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        create_sLL();
       // System.out.println(countnode());
        display();
    }
}
