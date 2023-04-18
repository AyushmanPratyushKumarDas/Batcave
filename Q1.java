import java.util.Scanner;

class Phone
{
    int Area_code,exchange,number;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required numbers");
        Area_code = sc.nextInt();
        exchange = sc.nextInt();
        number = sc.nextInt();
    }
    void output()
    {
        System.out.println("("+Area_code+") "+exchange+"-"+number);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        p1.input();
        p2.input();
        System.out.print("my number is ");
        p1.output();
        System.out.println();
        System.out.print("your number is ");
        p2.output();
    }
}
