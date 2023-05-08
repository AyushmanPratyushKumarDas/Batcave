package Q7;
class animal
{
   void run() 
   {
	   System.out.println("run");
   }
   void sleep() 
   {
	   System.out.println("animal is sleeping");
   }
}
class ml extends animal
{
	void work() 
	{
		System.out.println("gives milk");
	}
}
class lion extends ml
{
	void sleep() 
	{
		System.out.println("lion is sleeping");
	}
	void roar() 
	{
		System.out.println("rour");
	}
}
public class object_casting {
	public static void main(String[] args) {
		animal a = new lion();
		a.sleep();
		a.run();
		((lion)a).roar();

	}

}
