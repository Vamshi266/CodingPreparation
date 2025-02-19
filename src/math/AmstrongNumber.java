package math;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number: ");
		int n = sc.nextInt();
		int dup = n;
		int temp = 0;
		int sum = 0;
		while(n!=0)
		{
			temp = n%10;
			sum = sum+(temp*temp*temp);
			n = n/10;
		}
		
		if( sum == dup)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not an amstrong number");
		}
				
		
		
	}
	
	
}
