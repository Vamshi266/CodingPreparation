package recursion;

import java.util.Scanner;

public class ClimbStairs {

	public static int countSteps(int n)
	{
		if(n < 0)
			return 0;
		
		if(n == 0)
			return 1;
		
		return countSteps(n-1) + countSteps(n-2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n:");
		int n = sc.nextInt();
		int res = countSteps(n);
		System.out.println("no of unique ways to climb stairs = "+res);
		
		
		
	}
	
	
}
