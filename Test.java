package Minor_Project_1;
import java.util.Scanner;
class Date{
   int month,day,year;
   Date()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter date,month and year...");
       month=sc.nextInt();day= sc.nextInt();year=sc.nextInt();
   }
    void getdate()
    {
        System.out.println("Date="+day+"/"+month+"/"+year);
    }
}
 class Adress
 {
     String streetname;int plot_no;int pin;
     Adress()
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the streetname,plotno and pin...");
         streetname=sc.nextLine();plot_no= sc.nextInt();pin=sc.nextInt();
     }
     void getadress()
     {
         System.out.println("the adress is="+streetname+","+
                 plot_no+","+pin);
     }
 }
class Employee
{
    String name,jobPosition,contactNumber;
   Date hireDate;Adress adress;
    int empId;double salary;
    public void getHireDate() {
        Date d = new Date();
        hireDate=d;
    }
    public void getAdress() {
        Adress a = new Adress();
        adress = a;
    }
    Employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name,contactNumber,empId"+
                ",salary and ......");
        name = sc.nextLine();
        contactNumber=sc.nextLine();
        empId=sc.nextInt();
        salary=sc.nextDouble();
    }
    void getJobPosition()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the jobposition...");
        jobPosition=sc.nextLine();
    }
    void displayEmpInfo()
    {
        System.out.println("the name of the employee is "+name);
        System.out.println("the jobPosition of the employee is "+jobPosition);
        System.out.println("the contactNumber of the employee is "+contactNumber);
        System.out.println("the empId of the employee is "+empId);
        System.out.println("the salary of the employee is "+salary);
        System.out.print("the adress of the employee is ");
        adress.getadress();
        System.out.println();
        System.out.print("the Date is ");
        System.out.println();
        hireDate.getdate();
    }
}
public class Test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employee....");
        int n = sc.nextInt();
        Employee e[]=new Employee[n];
        for (int i=1;i<e.length-1;i++)
        {
            e[i]=new Employee();
            e[i].getJobPosition();e[i].getAdress();
            e[i].getHireDate();
        }
        for (int i=1;i<e.length-1;i++)
        {
            System.out.println("Data of Employee No."+i);
            e[i].displayEmpInfo();
        }

    }
}
