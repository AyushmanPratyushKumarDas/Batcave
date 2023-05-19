import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n!=34)
        {
            throw new NumberFormatException("negetive number");
        }
        else System.out.println("lucky");
    }
}
