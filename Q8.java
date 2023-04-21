import java.util.Scanner;

interface DetailInfo
{
    void display();
    void count();
}
class person implements DetailInfo
{
    static int maxcount=0;
    String name ;
    person(String name)
    {
        this.name=name;
    }
    @Override
    public void display() {
        System.out.println("the name is "+name);
        System.out.println("the no.of charcter in the name is "+maxcount);
    }

    @Override
    public void count() {
        for(int i = 0;i<name.length();i++)
        {
            maxcount++;
        }
    }
}



public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name->");
        String name = sc.next();
        person p = new person(name);
        p.count();
        p.display();
    }

}
