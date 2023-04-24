
public class Q5 {
	public boolean isOdd(int n) //use bitwise operator
	{
		
		//return (n&1)==1; //we are using bit wise and(&) operator to compare.....
		//return(n|1)==1; //here we are using bit wise XOR.......
		return (n^1)==1;  //here we are using bit wise OR
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
