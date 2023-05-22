class Box<T>
{
    T Variable1;T Variable2;
    Box(T a,T b)
    {
        Variable1=a;
        Variable2=b;
    }
    void Display()
    {
        System.out.println("Variable1 is "+Variable1);
        System.out.println("Variable2 is "+Variable2);
    }

    @Override
    public String toString() {
        return Variable1+" "+Variable2;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Box<Integer> e1;
        e1=new Box<>(10,20);
        e1.Variable1=30;
        e1.Display();
        Box<String> e2;
        e2=new Box<>("omm","Das");
        e2.Variable2="patel";
        e2.Display();
        Box<Object> o = new Box<>(e1,e2);
        System.out.println(o); //due to overriden
    }

}
