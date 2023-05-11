package Minor_Project_1;
import java.util.ArrayList;
import java.util.Scanner;
class Date{
   int month,day,year;
   Date()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter date,month and year...");
       month=sc.nextInt();day= sc.nextInt();year=sc.nextInt();
   }
    String getdate()
    {
        System.out.println("Date="+day+"/"+month+"/"+year);
        return "Date="+day+"/"+month+"/"+year;
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
     String getadress()
     {
         System.out.println("the adress is="+streetname+","+
                 plot_no+","+pin);
         return "the adress is="+streetname+","+plot_no+","+pin;
     }
 }
class Employee
{
    String name,jobPosition,contactNumber;
   Date hireDate;Adress adress;
    int empId; double salary;
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

    @Override
    public String toString() {

        String s ="the name of the employee is "+name+"\n"+"the jobPosition of the employee is "+jobPosition
                +"\n"+"the contactNumber of the employee is "+contactNumber+"\n"+"the empId of the employee is "+empId
                +"\n"+"the salary of the employee is "+salary+"\n"+"the adress of the employee is "+adress.getadress()+
                "\n"+"the Date is "+ hireDate.getdate();
        return s;
    }
}
public class Test {
    static double[] d;static int n;

    public static void arrangeEmployeeBySalary(Employee e[])
    {
        //sorting...(bubble sort)
        ArrayList<Employee> e1 = new ArrayList<Employee>(n);
        for (int i =0;i<n-1;i++)//loop runs n-1 times
        {
            for(int j = 0;j<n-i-1;j++)//as outer loop runs i times then
            {                         // i elements ar sorted...so we need
                if(d[j]<d[j+1])       //to run the inner loop (n-1)-i times
                {
                     e1.add(e[j+1]);
                }
            }
        }
        for (int i =1;i<=n-1;i++)
        {
            System.out.println(e1.toString());
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employee....");
         n = sc.nextInt();
        Employee e[] = new Employee[n];
         d = new double[n];
        for (int i=1;i<=n-1;i++)
        {
            e[i]=new Employee();
            e[i].getJobPosition();e[i].getAdress();
            e[i].getHireDate();
            for(int j = i;j<i+1;j++)
            {
                d[j]=e[i].salary;
            }
        }
        //display the details..
        /*for (int i=1;i<e.length-1;i++)
        {
            System.out.println("Data of Employee No."+i);
            e[i].displayEmpInfo();
        }*/
        // let's Arrange the employee details in descending order by salary
        System.out.println("the details of employee by arranging according" +
                " to salary(Descending order)");
        Test.arrangeEmployeeBySalary(e);

    }
}
