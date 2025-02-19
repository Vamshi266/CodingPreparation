package recursion;

public class Factorial {

	public static int fib(int n)
	{
		if(n == 0 || n == 1)
			return 1;
		
		return fib(n-1)*n;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(fib(5));
		
	}
	
	
}
