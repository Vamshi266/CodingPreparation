package bitwise;

public class NoOfSetBits {

	public static int countBits(int n)
	{
		int count = 0;
		while(n > 0)
		{
			count++;
			n -= (n & -n);
		}			
		return count;
	}
	
	public static void main(String[] args) {
		
	}
	
}
