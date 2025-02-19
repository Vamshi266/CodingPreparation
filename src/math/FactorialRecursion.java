package math;



/*
 * 
 * time complexity = O(n)
 * space complexity = O(n)
 * 
 * 
 */


public class FactorialRecursion {
	
	
	public static int factorialRecursion(int n)
	{
		if(n == 0)
			return 1;
		
		return factorialRecursion(n-1) * n;
			
			
		
	}

	public static void main(String[] args) {
		
		int res = factorialRecursion(5);
		System.out.println("factorial = "+res);

	}

}
