package math;



/*
 * time complexity = O(n)
 * space complexity = O(1)
 * 
 */
public class Factorial {
	
	
	
	public static int factorial(int n)
	{
		int fact = 1;
		for(int i=2;i<=n;i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		int res = factorial(10);
		System.out.println("factorial = " + res);
	}

}
