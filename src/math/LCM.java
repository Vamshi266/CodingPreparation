package math;

public class LCM {
	
	
	
	/*
	 * time complexity = O(a*b-max(a,b))
	 * space complexity = O(1)
	 * 
	 * 
	 */
	public static int lcm(int a,int b)
	{
		
		int res = Math.max(a, b);
		
		while(true)
		{
			if(res%a == 0 && res%b == 0)
			{
				return res;
			}
			
			res++;
		}
		
		
	}
	
	public static int gcd(int a,int b)
	{
		if(b == 0)
			return a;
		
		return gcd(b,a%b);
	}
	
	
	/*
	 * 
	 * a * b = gcd(a,b) * lcm(a,b)
	 * 
	 * time complexity = O(log(min(a,b)))
	 * space complexity = O(1)
	 * 
	 */
	public static int lcm2(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}

	public static void main(String[] args) {
		
		
		int res = lcm2(30,12);
		
		System.out.println("LCM = "+res);

	}

}
