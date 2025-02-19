package math;

public class GCD {

	
	public static int gcd1(int a,int b)
	{
		int min = Math.min(a, b);
		
		while(min > 0)
		{
			if(a%min == 0 && b%min == 0)
				break;
			
			
			min--;
		}
		
		return min;
	}
	
	
	public static int gcd2(int a,int b)
	{
		if(b == 0)
			return a;
		else
			return gcd2(b,a%b);
		
		
		
	}
	
	
	
	/*
	 * 
	 * time complexity = O(min(a,b))
	 * space complexity = O(1)
	 * 
	 */
	public static void main(String[] args) {
		
		int res = gcd2(100, 200);
		System.out.println("GCD = "+res);
		

	}

}
