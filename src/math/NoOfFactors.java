package math;

public class NoOfFactors {

	
	
	/*
	 * time complexity = O(n)
	 * space complexity = O(1)
	 * 
	 */
	public static int noOfFactors(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n % i == 0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		
		
		return count;
	}
	
	/*
	 * time complexity = O(sqrt(n))
	 * space complexity = O(1)
	 * 
	 */
	public static int noOfFactors2(int n)
	{
		int count = 0;
		
		
		for(int i=1;i*i<n;i++)
		{
			if(n%i == 0)
			{
				count++;
				System.out.print(i+",");
				if(i != n/i)
				{
					count++;
					System.out.print(n/i + ",");
				}
			}
			
		}
	
		return count;
		
	}
	
	/*
	 * time complexity = O(sqrt(n))
	 * space complexity = O(1)
	 * 
	 */
	public static int noOfFactors3(int n)
	{
		
		int count = 0;
		int i;
		for(i=1;i*i<n;i++)
		{
			if(n%i == 0)
			{
				count++;
				System.out.print(" "+i+" ");
			}
		}
		
		for(;i>=1;i--)
		{
			if(n%i == 0)
			{
				count++;
			  System.out.print(" "+n/i+" ");
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int res = noOfFactors2(10);
		System.out.println("\nno of factors = "+res);

	}

}
