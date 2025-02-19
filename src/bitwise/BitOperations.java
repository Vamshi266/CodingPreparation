package bitwise;

public class BitOperations {

	/*
	 * following are bit operations
	 * 1. getBit - uses &
	 * 2. setBit - uses | 
	 * 3. clearBit - uses bit mask,&
	 */
	
	
	static boolean getBit(int n,int pos)
	{
		
		int res = n & (1 << pos);
		if(res != 0)
			return true;
		else
			return false;
	}
	
	static int setBit(int n,int pos)
	{
		return n | (1 << pos);
	}
	
	static int clearBit(int n,int pos)
	{
		int mask = ~(1 << pos);
		
		return n & mask;
	}
	
	public static void main(String[] args) {
		
		System.out.println(clearBit(4, 0));
		
	}
	
}
