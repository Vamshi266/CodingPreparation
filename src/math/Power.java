package math;

public class Power {

	
	/*
	 * 
	 * time complexity = O(n)
	 * space complexity = O(1)
	 * 
	 */
	
	public static int power(int n,int x)
	{
		int pow = 1;
		for(int i=1;i<=x;i++)
		{
			pow = pow * n;
		}
		
		return pow;
	}
	
	/*
	 * 
	 * time complexity = O(logn)
	 * space complexity = O(logn)
	 * 
	 */
	public static double power2(double x,int n)
	{
		if(n == -1)
		    return 1/x;
		if(n == 0)
			return 1;
		
		double temp = power2(x,n/2);
		temp = temp * temp;
		
		//if n is even
		//x^n = x^n/2 * x^n/2;
		//if odd
		//x^n = x^n/2 * x^n/2 * x;
		
		if(n > 0)
		{
			//for positive numbers
			if(n%2 == 0)
				return temp;
			else
				return temp * x;
		}
		else
		{
			//for negative numbers
			if(n%2 == 0)
				return temp;
			else
				return (temp) * (1/x);
		}
		
	}
	
	
	public static void main(String[] args) {

		double res = power2(2,-2);
		
		System.out.println("power = "+res);
		
	}

}
