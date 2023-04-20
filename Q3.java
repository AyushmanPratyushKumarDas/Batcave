import java.util.Scanner;

class student
{
     int rollno,DSA_mark;
     String name ;
     void getdata()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the values: ");
         rollno=sc.nextInt();
         DSA_mark=sc.nextInt();
         name = sc.next();
     }
     void showdata()
     {
         System.out.println(rollno+" "+DSA_mark+" "+name);
     }

}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int n = sc.nextInt();
        student [] s = new student[n];
        for (int i = 0;i<s.length;i++)
        {
            s[i]=new student();
        }
        for (int i = 0;i<s.length;i++)
        {
            s[i].getdata();
            s[i].showdata();
        }
    }
}
