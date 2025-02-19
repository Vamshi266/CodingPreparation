package math.conversion;

public class DecimalToBinary {

	
	//Time Complexity = O(d) d - no of digits in binary value
	//Space Complexity = O(1)
	public static void decToBin(int n)
	{
		int binaryArr[] = new int[32];
		int pos = 0;
		
		while(n > 0)
		{
			binaryArr[pos++] = n%2;
			n /= 2;
		}
		
		for(int i=pos-1;i >= 0;i--)
		{
			System.out.print(binaryArr[i]+"");
		}
	}
	
	public static void decToBin2(int n)
	{
		System.out.println(Integer.toBinaryString(n));
	}
	
	
	public static void main(String[] args) {
		
		int n = 8;
		
		decToBin(n);
		
	}
	
}
