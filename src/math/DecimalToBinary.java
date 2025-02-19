package math;

public class DecimalToBinary {

	public static void dectobin(int n)
	{
		
		if(n > 0)
		{
			dectobin(n/2);
			System.out.print(n%2);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int n = 12;
		System.out.print("binary value of "+n+" = ");
		dectobin(n);
		
		
	}
	
}
