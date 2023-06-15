import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Sll
{
    static Node head = null;
    Scanner sc = new Scanner(System.in);
    public Node[] create_sll(int n)
    {
        Node n1[]=new Node[n];
        for(int i =0;i<n;i++)
        {
            System.out.println("enter elements");
            int a = sc.nextInt();
            n1[i]=new Node(a);
        }
        head = n1[0];
        for(int i = 0;i< n1.length;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                if(j==(i-1))
                {
                    n1[j].next=n1[i];
                }
            }
        }
        return n1;
    }
    void Display()
    {
        Node p =  head;
        while(p!=null)
        {
            System.out.println(p.data+" ");
            p=p.next;
        }
    }
    Node search(int a)
    {
        Node p = head;
        int pos=0;
        if(a==0)
        {
            pos = a+1;
            System.out.println(p.data+" ");
            return p;
        }
        else if(a==1)
        {
            pos = a+1;
            System.out.println(p.next.data+" ");
            return p.next;
        }
        else
        {
            while(a>1)
            {
                a--;
                p=p.next;
            }
            p=p.next;
            System.out.println(p.data);
            return p;
        }

    }
    void sorting(Node n[])
    {
        int l = n.length;
        Node p = head;Node q = head.next;
        for(int i =0;i<l;i++){
            for(int j=0;j<l;j++)
            {
                if(p.data>q.data)
                {
                    p=n[j];
                    n[i].next=n[j];
                    n[j].next=null;
                }
            }
        }
        Display();
    }
}

public class search_node {
    public static void main(String[] args) {
        Node n[] =null;
        Sll s = new Sll();
        n=s.create_sll(5);
        //s.Display();
        //s.search(1);
        s.sorting(n);
    }
}
