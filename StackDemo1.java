import java.util.Scanner;
//for an array
public class StackDemo1 {
    static Scanner sc = new Scanner(System.in);
    public static final int max =10;
    //top is a pointer that points to the top stack position
    public static int push(int s[],int top)
    {
        if(top==s.length-1)
        {
            System.out.println("stack is completed");
            System.exit(0);
        }
        else
        {
            System.out.println("enter the element");
            int x = sc.nextInt();
            s[++top]=x;
        }
        return top;
    }
    public static int pop(int[] s, int top)
    {
        if(top==-1){
            System.out.println("stack is empty");
            System.exit(0);
        }else{
           int el = s[top];
           top--;
        }
       return top;
    }
    public static void display(int s[],int top)
    {
        if(top==-1){
            System.out.println("empty");
        }else{
            for(int i =0;i<s.length;i++){
                System.out.print(s[i]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isempty(int top){
        if(top==-1){return true;}
        else
            return false;
    }
    public static boolean isfull(int top)
    {
        if(top==max-1){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stack[]=new int[max];
        int top=-1;
        while(true)
        {

            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0: System.exit(0);break;
                case 1:top=push(stack,top);break;
                case 2:top=pop(stack,top);break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}



