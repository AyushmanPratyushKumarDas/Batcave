package Minor_Project_1;
//import java.util.ArrayList;
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
   public String name,jobPosition,contactNumber;
    public Date hireDate; public Adress adress;
   public  int empId;public double salary;
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

   /* @Override
     public String toString() {

        String s ="the name of the employee is "+name+"\n"+"the jobPosition of the employee is "+jobPosition
                +"\n"+"the contactNumber of the employee is "+contactNumber+"\n"+"the empId of the employee is "+empId
                +"\n"+"the salary of the employee is "+salary+"\n"+"the adress of the employee is "+adress.getadress()+
                "\n"+"the Date is "+ hireDate.getdate();
        return s;
    }*/
}
public class Test {
    static double[] d;static int n;

    public static void arrangeEmployeeBySalary(Employee e[])
    {
        Employee temp = null;
      //ArrayList<Employee> e1 = new ArrayList<>(); (can use but not required)
        for (int i =0;i<n;i++)//loop runs n times
        {
           for(int j = 1;j<n-i;j++)//as outer loop runs i times then
            {                         // i elements ar sorted...so we need
                if(e[j-1].salary>e[j].salary)       //to run the inner loop (n-1)-i times
                {
                     temp = e[j-1];
                     e[j-1]=e[j];
                     e[j]=temp;

                }
            }
        }
        for (int i =1;i<=n-1;i++)
        {
          e[i].displayEmpInfo();
        }

    }

    public static void getEmployeesByJobPosition(Employee e[], String jp)
    {
        for (int i = 0;i<e.length;i++) {
            if (e[i].jobPosition == jp) {
                e[i].displayEmpInfo();
            }
        }
    }

    public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2)
    {
        for (int i = 0;i<e.length;i++)
        {
            Date d = e[i].hireDate;
            if( d.month <= d1.month&& d.month>=d2.month && d.day<=d1.day && d.day>=d2.day
             && d.year<= d1.year&& d.year>= d2.year )
            {
                e[i].displayEmpInfo();
            }
        }
    }

    public static int foreignEmployeeCount(Employee e[])
    {
        int count = 0;
        for(int i = 0;i<e.length;i++)
        {
            String s = e[i].contactNumber;
            if(s.charAt(0)!='9'&& s.charAt(1)!='1')
            {
                count++;
            }
        }
        return count;
    }

    public static void getEmployeesBySalary(Employee e[], double s1, double s2)
    {
        for(int i = 0;i<e.length;i++)
        {
            if(e[i].salary <= s1 && e[i].salary >= s2)
            {
                e[i].displayEmpInfo();
            }
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
            /*for(int j = i;j<i+1;j++)
            {
                d[j]=e[i].salary;
            }*/
        }
        //display the details..
        for (int i=1;i<e.length-1;i++)
        {
            System.out.println("Data of Employee No."+i);
            e[i].displayEmpInfo();
        }


        System.out.println("the details of employee by arranging according" +
                " to salary(Descending order)");
        Test.arrangeEmployeeBySalary(e);


        System.out.println("Enter the required job position");
        String jp = sc.nextLine();//manager
        System.out.println("the details of all the "+jp+" are...");
        Test.getEmployeesByJobPosition(e,jp);


        System.out.println("Display the details of employees whose " +
                "hireDate is between 01-04-2022 to 31-03-2023:");
        Date d1,d2;
        d1 = new Date();
        d1.day=01;d1.month=04;d1.year=2022;
        d2 = new Date();
        d2.day=31;d2.month=03;d2.year=2023;
        Test.getEmployeesByHireDate(e,d1,d2);

        System.out.println("Display the details of employees" +
                " whose salary is in a range 150000 INR to 300000 INR:");
        double s1 = 150000.0;double s2 = 300000.0;
        Test.getEmployeesBySalary(e,s1,s2);


        System.out.println("Find the number of foreign employees:");
        Test.foreignEmployeeCount(e);
    }
}
