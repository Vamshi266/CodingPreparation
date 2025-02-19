package math.conversion;

public class BinaryToDecimal {

	
	//1e9 = 1 * 10^9
	public static int binToDec(String str)
	{
		int n = str.length();
		int val = 0;
		for(int i=0;i<n;i++)
		{
			val = val * 2 + Integer.parseInt(new String(str.charAt(i)+""));
		}
		
		return val;
	}
	
	
	public static void main(String[] args) {
		
		int n = 5;
		String str = Integer.toBinaryString(n);
		int ans = binToDec(str);
		System.out.println(ans);
		
	}
	
}
