class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



class employee extends person
    {
        int eid;int salary;
        employee(int eid,int salary,String name,int age){
            super(name, age);
            this.eid=eid;this.salary=salary;

        }
        void display()
        {
            System.out.println(name+" "+age+" "+eid+" "+salary);
        }
    }


public class Q7 {
    public static void main(String[] args) {
       employee e = new employee(10021,34000,"yash",23);
       e.display();
    }
}
