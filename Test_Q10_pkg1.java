package Q10;

public class Test_Q10_pkg1 extends student_Q10_pkg1{
    public int mark1,mark2;
     public void input_marks()
    {
        super.input();
        System.out.println("enter marks");
        mark1= sc.nextInt();
        mark2 = sc.nextInt();
    }
   public void output_marks()
    {
        super.output();
        System.out.println("marks of the student is "+mark1+" "+mark2);
    }
}
