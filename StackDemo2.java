import java.util.Scanner;

class node
{
    int info;
    node next;
    node(int info){
        this.info = info;
        this.next= null;
    }
}
public class StackDemo2 {
    static Scanner sc = new Scanner(System.in);
    public static node push(node top)
    {
        System.out.println("enter info");
        int s = sc.nextInt();
        node n = new node(s);
        n.next=top;
        top=n;

        return top;
    }
    public static node pop(node top)
    {
        if(top==null){
            System.out.println("empty list");
        }
        else
        {
            System.out.println("the poped element "+top.info);
            node n = top;
            top=top.next;
            n.next=null;n=null;
        }
        return top;
    }
    public static void display(node top)
    {
        if(top==null){
            System.out.println("empty");
        }else
        {
            node n = top;
            while(n!=null)
            {
                System.out.println(n.info);
                n=n.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node top;
        top=null;
        while(true)
        {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    top=push(top);break;
                case 2 :
                    top=pop(top);break;
                case 3 :
                    display(top);break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

}

