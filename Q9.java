import java.util.Scanner;

class Stud
{
    int rollno;
    String name,course;
     public void input_st()
    {

       Scanner sc = new Scanner(System.in);
        System.out.println("input personal data");
        System.out.println("input name");
        name = sc.next();
        System.out.println("input course");
        course = sc.next();
        System.out.println("input rollno");
        rollno = sc.nextInt();
    }
   public void display()
    {
        System.out.println("the personal data:"+name+" "+rollno+" "+course);
    }
}
class Exam extends Stud
{

    int mark1,mark2,mark3;

    void input_mark()
    {
        super.input_st();

        Scanner sc = new Scanner(System.in);
        System.out.println("input all three marks");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
    }
    void Display_result()
    {
        super.display();

        int result = mark1+mark2+mark3;
        System.out.println("the result is:"+result);
    }
}




public class Q9 {
    public static void main(String[] args) {
        Exam [] e = new Exam[5];
        for(int i=0;i<2;i++)
        {
            e[i]=new Exam();

        }
        for (int i = 0;i<5;i++)
        {
           e[i].input_mark();
           e[i].Display_result();
        }
    }
}
