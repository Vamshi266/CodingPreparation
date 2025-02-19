package math;

public class FibanocciSeries {

	
	public static int fib(int n)
	{
		
		if(n < 0)
		{
			System.out.println("number can't be negitive");
			return -1;
		}
		
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		
		
		return fib(n-1) + fib(n-2);
		
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(fib(3));
		

	}

}
