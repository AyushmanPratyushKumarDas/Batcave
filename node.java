import java.util.Scanner;

public class node {
    int info;
    node link;
    node head = null;
    static Scanner sc = new Scanner(System.in);
    public void createNode()
    {
        node n1 = new node();
        System.out.println("enter info");
        n1.info= sc.nextInt();
        n1.link=null;
        head=n1;
        System.out.println("want more nodes (y/n)");
        char c = sc.next().charAt(0);
        while(c!='n')
        {
            node n2 = new node();
            System.out.println("enter info");
            n2.info= sc.nextInt();
            n2.link=null;
            n1.link=n2;
            n1=n2;
            System.out.println("want more nodes (y/n)");
            c = sc.next().charAt(0);
        }
    }

    public int counte()
    {
        int count = 0;
        node next=head;
        while(next!=null)
        {
            count=count+1;
            next=next.link;
        }
        return count;
    }
    public static void main(String[] args) {
        node n1= new node();
        n1.createNode();
        System.out.println(n1.counte());
    }
}
