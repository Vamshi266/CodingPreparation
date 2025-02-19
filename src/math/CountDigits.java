package math;


/*
 * time complexity = O(d) d = no of digits in the number
 * space complexity = O(1)
 * 
 */

public class CountDigits {

	
	public static int countDigits(int n)
	{
		int count = 0;
		
		while(n > 0)
		{
			n = n/10;
			count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int res = countDigits(2334);
		System.out.println("no of digits = "+res);
	}

}
