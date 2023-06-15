import java.util.Scanner;

public class node {
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class sll
{
    Scanner sc = new Scanner(System.in);
    node head = null;
    /*void create()
        {
            System.out.println("enter element");
            int s = sc.nextInt();
            node n1 = new node(s);
            head=n1;
            System.out.println("want more nodes?(y/n)");
            char c = sc.next().charAt(0);
            while(c!='n')
            {
                System.out.println("enter element");
                int s1 = sc.nextInt();
                node n2 = new node(s1);
                n1.next=n2;
                n1=n2;
                System.out.println("want more nodes?(y/n)");
                c = sc.next().charAt(0);
            }

        }*/



    node create_node(int n)
    {
        node n1 = new node(n);
        return n1;
    }
    void create_sll()
    {
        System.out.println("enter elements");
        int s = sc.nextInt();
        node n1 = create_node(s);
        head=n1;
        System.out.println("want more nodes?(y/n)");
        char c = sc.next().charAt(0);
        while(c!='n')
        {
            System.out.println("enter element");
            int s1 = sc.nextInt();
            node n2 = create_node(s1);
            n1.next=n2;
            n1=n2;
            System.out.println("want more nodes?(y/n)");
            c = sc.next().charAt(0);
        }

    }



    void display_node()
    {
        node n = head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }

    }
    int counte(){
        node n = head;
        int count=0;
        while(n!=null)
        {
            count++;
            n=n.next;
        }
        return count;
    }
    void insert_beg(int a)
    {
        node n = create_node(a);
        if(head==null)
            head=n;
        else
        {
            n.next=head;
            head=n;
        }
        display_node();
    }
    void insert_end(int a)
    {
        if(head==null) insert_beg(a);
        else
        {
            node n = create_node(a);
            node p = head;
            while(p.next!=null)
            {
                p=p.next;
                p.next=n;
            }
            display_node();
        }
    }

    void insert_any(int a,int i)
    {
        if(head==null) insert_beg(a);
        else if (i>=counte()) insert_end(a);
        else
        {
            node n = create_node(a);
            node p = head;
            while(i>1){
                i--;
                p=p.next;
            }
            n.next=p.next;//actual insertion
            p.next=n;
            display_node();
        }
    }
    void delete_start()
    {
        node p = head;
        head=p.next;
        p.next=null;
        p=null;
        display_node();
    }
    void delete_end()
    {
        node p = head;
        while(p.next.next!=null) // before two nodes..
        {
            p=p.next;
        }
        p.next=null;
        display_node();
    }

    void delete_any(int i)
    {
        if(head==null|| i==0) delete_start();
        else if(i>=counte()) delete_end();
        else
        {
            node p = head;
            while(i>1)
            {
                i--;
                p=p.next;
            }

            node temp = p.next.next;
            p.next.next=null;
            p.next=temp;


            display_node();
        }
    }
    void delete_any_way_02(int n)
    {
        node p = head;
        for(int i=1;i<=(n-1) && p.next!=null;i++ )
        {
            p=p.next;
        }
        node temp = p.next.next;
        p.next.next=null;
        p.next=temp;
        display_node();
    }
    void reverse()
    {
        node p,q,r;
        p=null;
        q=head;
        r=head.next;
        q.next=null;
        while(r!=null)
        {
           p=q;
           q=r;
           r=r.next;
           q.next=p;

        }
        head=q;
        display_node();
    }

}
class a
{
    public static void main(String[] args) {
        sll n = new sll();
        n.create_sll();
        //n.delete_end();
        //n.delete_any_way_02(3);
        //n.reverse();
    }
}
