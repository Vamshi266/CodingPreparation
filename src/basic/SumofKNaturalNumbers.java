package basic;

public class SumofKNaturalNumbers {

	
	//time complexity = O(1)
	public static int sumOfKnaturalNumbers(int n)
	{
		return (n*(n+1))/2;
	}
	
	//time complexity = O(n)
	public static int sumOfKnaturalNumbers1(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		
		return sum;
	}
	
	//time complexity = O(n^2)
	public static int sumOfKnaturalNumbers2(int n)
	{
		int sum = 0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum++;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
			
		
		System.out.println(sumOfKnaturalNumbers(5));
		System.out.println(sumOfKnaturalNumbers1(5));
		System.out.println(sumOfKnaturalNumbers2(5));
		
		
		

	}

}
