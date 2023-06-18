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
    public  static node head=null;
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
        System.out.println("want to edit mark of a regno(y/n");
        char ch = sc.next().charAt(0);
        if(ch=='y'){search(head);}
        System.out.println();
    }
    public static void createe(node head)
    {
        node n1 = create_node();
        head=n1;
        System.out.println("want more(y/n)");
        char  cc= sc.next().charAt(0);
        while(cc!='n')
        {
            node n2 = create_node();
            n1.next=n2;
            n1=n2;//lint p to q
            System.out.println("want more(y/n)");
           cc= sc.next().charAt(0);
        }
       // display(head);
    }
    public static void display(node head)
    {
        node p = head;
        while(p!=null)
        {
            System.out.println("["+p.regd_no+" "+p.mark+"]");
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

        //System.out.println("want to see list(y/n)");
        //char ch=sc.next().charAt(0);
        //if(ch=='y'){display(head);}
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
           // System.out.println("want to see list(y/n)");
            //char ch=sc.next().charAt(0);
            //if(ch=='y'){display(head);}
        }
        return p;
    }
    public static node InsAny(node head)
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
            int pos = sc.nextInt();
            while(pos>1)
            {
                pos--;
                p=p.next;
            }
            n.next=p.next;
            p.next=n;

          //  System.out.println("want to see list(y/n)");
            //char ch=sc.next().charAt(0);
            //if(ch=='y'){display(head);}
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

       // System.out.println("want to see list(y/n)");
        //char ch=sc.next().charAt(0);
        //if(ch=='y'){display(head);}
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
           // System.out.println("want to see list(y/n)");
            //char ch=sc.next().charAt(0);
            //if(ch=='y'){display(head);}
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
           }
      // System.out.println("want to see list(y/n)");
       //char ch=sc.next().charAt(0);
       //if(ch=='y'){display(head);}
       return head;
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
        /*System.out.println("want to see list(y/n)");
        char ch=sc.next().charAt(0);
        if(ch=='y'){display(head);}*/
    }
    public static void search(node head)
    {
        System.out.println("enter the registration number");
        int r = sc.nextInt();
            node p = head;
            int pos=0;
            int c = count(head);
            while (p!=null) {
                if(p.regd_no==r){
                    System.out.println("postion is "+pos);
                    System.out.println("update marks");
                    p.mark=sc.nextInt();
                }
                pos++;
                p=p.next;
                }
        //System.out.println("want to see list(y/n)");
        //char ch=sc.next().charAt(0);
        //if(ch=='y'){display(head);
          //  }
    }
    public static node reversal(node head)
    {
        if(head==null||head.next==null){
          //  display(head);
            return head;}
        else{
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
        head=q;}
       // display(head);
        return head;
    }

    public static void sort(node head)
    {

        createe(head);
        node p = head,q=null;
        if(head==null||head.next==null)
        {
            return;
        }
        else
        {
            while (p != null) {
                q=p.next;
                while(q!=null){

                    if(p.mark<q.mark){
                       float temp1 = p.mark;
                       int temp2 = p.regd_no;
                        p.mark=q.mark;
                        p.regd_no=q.regd_no;
                        q.mark=temp1;
                        q.regd_no=temp2;
                    }
                    q=q.next;
                }
                p=p.next;
            }
        }

    }

    public static void main(String[] args) {

        //node head=null;
        //createe(head);
        //sort(head);
       // reversal(head);
        while(true)
        {
            System.out.println("*****menu*****");
            System.out.println("0:exit");
            System.out.println("1:create");
            System.out.println("2:display");
            System.out.println("3:count");
            System.out.println("4:delete start");
            System.out.println("5:delete end");
            System.out.println("6:delete any");
            System.out.println("7:insert start");
            System.out.println("8:insert end");
            System.out.println("9:insert any");
            System.out.println("10:sorting");
            System.out.println("11:delete according to a registration");
            System.out.println("12:reversal");
            System.out.println("13:searching");

            System.out.println("enter choice");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 0:System.exit(0);
                case 1:createe(head);break;
                case 2:display(head);break;
                case 3:count(head);break;
                case 4:DelBeg(head);break;
                case 5:DelEnd(head);break;
                case 6:
                    System.out.println("enter position");
                    int pos = sc.nextInt();
                    DelAny(head,pos);break;
                case 7:InsBeg(head);break;
                case 8:InsEnd(head);break;
                case 9:InsAny(head);break;
                case 10:sort(head);break;
                case 11:delete_conditioned(head);break;
                case 12:reversal(head);break;
                case 13:search(head);break;

                default:
                    System.out.println("wrong choice");
            }
        }

    }
}
