package recursion;

import java.util.Scanner;

public class NumberToString {

	
	static String res = "";
	static String arr[] = {
		"one","two","three","four","five",
		"six","seven","eight","nine"
	};
	
	public static void numberToString2(int n)
	{
		if(n == 0)
			return;
		
		int k = n % 10;
		n = n/10;
		numberToString2(n);
		
		System.out.print(arr[k-1]+" ");
	}
	
	
	public static String numberToString(int n)
	{
		
		
		if(n == 0)
			return res;
		
		int k = n%10;
		
		
		switch(k)
		{
			case 0: res="zero"+res;
			break;
			case 1: res="one"+res;
			break;
			case 2: res="two"+res;
			break;
			case 3: res="three"+res;
			break;
			case 4: res="four"+res;
			break;
			case 5: res="five"+res;
			break;
			case 6: res="six"+res;
			break;
			case 7: res="seven"+res;
			break;
			case 8: res="eight"+res;
			break;
			case 9: res="nine"+res;
			break;
		}
		
		n = n/10;
		numberToString(n);
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n:");
		int n = sc.nextInt();
//		String res = numberToString(n);
//		System.out.println(res);
		numberToString2(n);
		
		
	}
	
}
