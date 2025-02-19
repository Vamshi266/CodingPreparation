package math;

public class SieveOfArostenes {

	
	public static void seiveOfErostenes(int n)
	{
		boolean[] prime = new boolean[n+1];
		
		for(int i=2;i*i<=n;i++)
		{
			if(prime[i] == false)
			{
				for(int j=i*i;j<=n;j+=i)
				{
					prime[j] = true;
				}
			}
		}
		
		for(int i=2;i<=n;i++)
		{
			if(prime[i] == false)
				System.out.print(i+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		seiveOfErostenes(29);
		

	}

}
