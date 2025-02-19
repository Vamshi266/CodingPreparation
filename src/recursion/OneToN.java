package recursion;

public class OneToN {

	
	public static void printoneToN(int n)
	{
		if(n == 0)
			return;
		printoneToN(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		printoneToN(5);
		
	}
	
}
