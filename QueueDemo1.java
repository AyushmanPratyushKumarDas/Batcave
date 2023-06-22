import java.util.Scanner;

public class QueueDemo1 {
    static Scanner sc = new Scanner(System.in);
    public static final int MAX=5;
    public static int front=-1;
    public static int rear=-1;
    public static boolean is_empty()
    {
        if(front==-1 && rear==-1){return true;}
        return false;
    }
    public static boolean is_full()
    {
        if(rear==MAX-1){return true;}
        return false;
    }
    public static void insert(int Q[])
    {
        if(is_full()){
            System.out.println("overflow");
        }
        else{
            System.out.println("enter the element");
            int s = sc.nextInt();
            rear++;
            Q[rear]=s;
            if(rear==0){
                front=0;
            }
        }
    }
    public static void delete(int Q[])
    {
        if(is_empty()){
            System.out.println("underflow");
        }
        else
        {
            System.out.println("deleted element:"+Q[front]);
            front++;
        }
    }
    public static void display(int Q[])
    {
        if(is_empty()){
            System.out.println("empty!");
        }
        else
        {
            while(front<=rear)
            {
                System.out.println(Q[front]);
                front++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int queue[]=new int[MAX];

        while(true)
        {

            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    insert(queue);break;
                case 2:
                    delete(queue);break;
                case 3:
                    display(queue);break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}
