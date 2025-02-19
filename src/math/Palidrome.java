package math;



/*
 * time complexity = O(d) d = no of digits in the number
 * space  complexity = O(1)
 * 
 */

public class Palidrome {

	
	public static void palidrome(int n)
	{
		int rev = 0;
		int dup = n;
		int x;
		while(n != 0)
		{
		  x = n % 10;
		  n = n / 10;
		  rev = rev * 10 + x;
		}
		
		if(dup == rev)
			System.out.println("palidrome");
		else
			System.out.println("not a palidrome");
	
		
	}
	
	public static void main(String[] args) {
		
		
		palidrome(372);
		
		
	}
	
}
