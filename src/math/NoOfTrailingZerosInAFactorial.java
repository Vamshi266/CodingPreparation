package math;




 

public class NoOfTrailingZerosInAFactorial {

	
	 /*
	  * 
	  * time complexity = O(n)
	  * space complexity = O(1)
	  * 
	  */
	public static int noOfTrailingZeros(int n)
	{
		int fact = Factorial.factorial(n);
		int count = 0;
		while(fact % 10 == 0)
		{
			fact/=10;
			count++;
		}
		
		return count;
	}
	
	/*
	 *  time complexity = O(logn)
	 *  space complexity = O(1)
	 *  (x!)^y! = k * y!
	 *   x^y * k = n!
	 */
	public static int noOfTrailingZerosEfficientApproach(int n)
	{
		int count = 0;
		int rem = 0;
		//by computing no of 5's we can get no of zeros
		for(int i=5;i<=n;i*=5)
		{
			rem = n / i;
			count+=rem;
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		

		int res = noOfTrailingZerosEfficientApproach(10);
		System.out.println("no of trialing zeros = " + res);
		

	}

}
