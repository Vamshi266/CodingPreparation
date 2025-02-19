package math;

public class PrimeFactor {

	
	
	/*
	 * time complexity = O(nlogn)
	 * space complexity = O(1)
	 * 
	 */
	public static void primeFactor1(int n)
	{
		
		for(int i=2;i<=n;i++)
		{
			int x = i;
			if(Prime.checkPrime3(i)) {
				while(n%x == 0)
				{
					System.out.println(i+" ");
					x*=i;
				}
				
			}
			
		}
		
		
	}
	
	/*
	 * time complexity = O(sqrt(n)logn)
	 * space complexity = O(1)
	 * 
	 */
	
	public static void primeFactor2(int n)
	{
		if(n <= 1) return;
		
		for(int i=2;i*i<=n;i++)
		{
			while(n%i == 0)
			{
				System.out.println(i);
				n/=i;
			}
		}
		
		if(n > 1) System.out.println(n);
		
	}
	
	
	/*
	 * time complexity = O(sqrt(n)logn)
	 * space complexity = O(1)
	 * 
	 */
	public static void primeFactor3(int n)
	{
		if(n <= 1) return;
		
		while(n%2 == 0)
		{
			System.out.println(2+" ");
			n/=2;
		}
		
		while(n%3 == 0)
		{
			System.out.println(3+" ");
			n/=3;
		}
		
		for(int i=5;i*i<=n;i+=6)
		{
			while(n%i == 0)
			{
				System.out.println(i);
				n/=i;
			}
			
			while(n%(i+2) == 0)
			{
				System.out.println(i);
				n/=(i+2);
			}
		}
		
		if(n > 3) // if we have prime factor 
			      //other than 2,3 and have power of 1
			System.out.println(n);
		
	}
	
	public static void main(String[] args) {
		
		primeFactor1(12);
		
		
	}
	
	
}
