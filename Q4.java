import java.util.Scanner;

class product
{
    int pid,price;
    product(int pid,int price)
    {
        this.pid = pid;
        this.price = price;
    }

    void display()
    {
        System.out.println(pid+" "+price);
    }
     public static int tot_price(product p1)
    {
        product p = new product(0,0);
        p.price = p1.price;
        return p.price;

    }
}

public class Q4 {
    public static void main(String[] args) {

        product [] am = new product[10];
        for (int i = 0;i<5;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id and price");
            int id = sc.nextInt();
            int price = sc.nextInt();
            am[i] = new product(id, price);
        }
        int totalp=0;
        for (int i = 0;i<5;i++)
        {
            am[i].display();
            totalp=totalp+product.tot_price(am[i]);
        }
        System.out.println(totalp);

    }
}
