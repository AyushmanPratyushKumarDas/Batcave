import java.util.Scanner;

class node
{
    protected int regd_no;
    protected float mark;
    protected node next;
    node(int regd_no,float mark)
    {
        this.regd_no=regd_no;
        this.mark=mark;
        this.next=null;
    }
}
public class LinkedList {
    static Scanner sc = new Scanner(System.in);
    //node head is null initially
    public static node create_node()
    {
        System.out.println("enter registration number");
        int reg = sc.nextInt();
        System.out.println("enter marks");
        float marks = sc.nextFloat();
        node n = new node(reg,marks);
        return n;
    }
    public static void create1(node head)
    {
        head = null;
        System.out.println("enter number of students");
        int n = sc.nextInt();
        node l[]=new node[n];
        for(int i =0;i<n;i++)
        {
            l[i]=create_node();
        }
        head=l[0];
        for(int i =0;i<n;i++)
            for(int j =0;j<=i;j++)
            {
                if(j==(i-1))
                {
                    l[j].next=l[i];
                }
            }
        display(head);
    }
    public static void createe(node head)
    {
        node n1 = create_node();
        head=n1;
        System.out.println("enter number of students");
        int n = sc.nextInt();
        while(n>0)
        {
            node n2 = create_node();
            n1.next=n2;
            n--;
        }
        display(head);
    }
    public static void display(node head)
    {
        node p = head;
        while(p!=null)
        {
            System.out.println(p.regd_no+" "+p.mark);
            p=p.next;
        }
    }
    public static int count(node head)
    {
        node p =head;
        int count=0;
        while(p.next!=null)
        {
            count++;
            p=p.next;
        }
        return count;
    }
    //insertion
    public static node InsBeg(node head)
    {
        node p= head;
        node n = create_node();
        n.next=p;
        p=n;
        display(head);
        return p;
    }
    public static node InsEnd(node head)
    {
        node p =head;
        node n = create_node();
        if(p==null)
        {
            p=n;
        }
        else{
        while(p.next!=null)
        {
            p=p.next;
        }
        p=p.next;
        p.next=n;
        display(head);
        }
        return p;
    }
    public static node IntAny(node head)
    {
        node p = head;
        node n =create_node();
        if(p==null)
        {
            p=n;
        } else if (p.next==null) {
            InsEnd(head);
        }
        else
        {
            System.out.println("enter the position");
            int pos = 3;
            while(pos>1)
            {
                pos--;
                p=p.next;
            }
            n.next=p.next;
            p.next=n;
            display(head);
        }
        return p;
    }
    public static node DelBeg(node head)
    {
        node p = head;
        if(p==null){
            System.out.println("empty");
        }else{
            p=p.next;
            p.next=null;
        }
        display(head);
        return p;
    }
    public static node DelEnd(node head)
    {
        if(head==null){
            System.out.println("empty");
        }
        else
        {
            node p = head;
            while(p.next.next!=null)
            {
                p=p.next;
            }
            p.next=null;
            display(head);
        }
        return head;
    }

   public static node DelAny(node head,int pos)
   {
       if(head==null||pos==0){DelBeg(head);}
       else if(pos>=count(head)){DelEnd(head);}
       else {
           node p = head;

           while (pos > 1) {
               pos--;
               p = p.next;
           }
           node q = p.next;
           p.next = q.next;
           q.next = null;
           System.out.println("want to see list(y/n)");
           char ch=sc.next().charAt(0);
           if(ch=='y'){display(head);}
       }return head;
   }

    public static void delete_conditioned(node head)
    {
        System.out.println("enter the specific registration number");
        int reg_no=sc.nextInt();
        node p = head;
        int count = count(head);
        int i =0;
        while(i<count)
        {
            if(p.regd_no==reg_no)
            {
                DelAny(head,i);
            }
            else{
                i++;
                p=p.next;
            }
        }
    }
    public static void search_position(node head)
    {
        System.out.println("enter the registration number");
        int r = sc.nextInt();
            node p = head;
            int pos=0;
            int c = count(head);
            while (c>0) {
                if(p.regd_no==r){
                    System.out.println("postion is "+pos);
                    System.out.println("update marks");
                    p.mark=sc.nextInt();
                }
                pos++;
                p=p.next;
                c--;
                }
        System.out.println("want to see list(y/n)");
        char ch=sc.next().charAt(0);
        if(ch=='y'){display(head);
            }
    }

    public static void main(String[] args) {
        node head = null;
        create1(head);
        InsEnd(head);


    }
}
