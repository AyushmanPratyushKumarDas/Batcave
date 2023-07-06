import org.w3c.dom.Node;

import java.util.Scanner;
class NOde{
    int info;NOde link;
    NOde(int info){
        this.info=info;
        this.link=null;
    }
}
public class queuell {
    static NOde front;
    static  NOde rear;
    public static void enqueue(int i){
        NOde n = new NOde(i);
        if(n==null){
            System.out.println("out of memory");
        }else{
            if(rear!=null){
                rear.link=n;
                rear=n;
            }
            else{
                rear=n;
                front=rear;
            }
        }
    }
    public static void dequeue(){
        if (front == null) {
            System.out.println("empty");
        }else{
            NOde n = front;
            System.out.println(n.info+" will be deleted");
            front=n.link;
            n.link=null;n=null;
        }
    }
    public static void display(){
        if(front == null) {
            System.out.println("empty");
        }else{
            NOde n = front;
            while(n!=null){
                System.out.println(n.info);
                n=n.link;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Insert");
            System.out.println("2:Delete");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);

                case 1:
                    System.out.println("enter element");
                    int i = sc.nextInt();
                    enqueue(i);
                    break;

                case 2:
                  dequeue();
                    break;

                case 3:display();break;

                default:
                    System.out.println("Wrong choice");


            }
        }
    }
}
