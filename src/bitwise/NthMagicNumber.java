package bitwise;







/*
 * magic number concept

   ........5^3   5^2	  5^1
n =........1      0       0


ans = 5^3 * 1 + 5^2 * 0 + 5^1 * 0;

this is similar to binary to decimal conversion
but here we are given a base other than 2 
 
*/




public class NthMagicNumber {

	
	public static void main(String[] args) {
		
		
		int n = 4;
		int base = 5;
		int ans = 0;
		int last = 0;
		
		int ans2 = (int)(Math.log(n) / Math.log(base)) + 1;
		System.out.println(Math.pow(5, ans2));
		
		while(n>0)
		{
			last = n & 1;
			n = n >> 1;
			ans += last * base;
			base = base * 5;
		}
		
		System.out.println(ans);
		
		
		
		
		
		
	}
	
	
}
