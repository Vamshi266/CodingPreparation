package bitwise;

public class SwapUsingXor {

	
	
	/* swap can be performed using xor
	 * and it's the fastest way of swapping */
	
	static void swap(int a,int b)
	{
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("after swap\na = "+a+"\nb = "+b);
	}
	
	public static void main(String[] args) {
		
		
		int a = 23;
		int b = 45;
		System.out.println("before swap\na = "+a+"\nb = "+b);
		swap(a,b);
		
		
	}
	
	
}
