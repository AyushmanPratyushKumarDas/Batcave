package Q10;
import java.util.*;
public class student_Q10_pkg1 {
    public String name;public int roll;
    static Scanner sc = new Scanner(System.in);
   public void input(){
       System.out.println("enter name and roll");
        name = sc.nextLine();
        roll = sc.nextInt();
    }
    void output()
    {
        System.out.println("the details are "+name+" "+roll);
    }
}
