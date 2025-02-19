package math;

public class DigitsumUsingRecursion {

	public static int sum(int n)
	{
		return n == 0 ? 0 : n%10+sum(n/10);
	}
	
	
	public static void main(String[] args) {
		
		int n = 123434;
		
		System.out.println("sum of digits of "+n+" = "+sum(n));
		
	}
	
	
}
