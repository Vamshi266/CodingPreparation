package math;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		int temp = 0;
		int dup = n;
		while(n != 0)
		{
			temp = n%10;
			sum = sum + Factorial.factorial(temp);
			n = n/10;
		}
		
		if(dup == sum)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");
		
	}
	
	
	
}
