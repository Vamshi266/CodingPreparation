package bitwise;

public class BinaryToGrayCode {

	
	public static char xor(char a,char b)
	{
		return (a == b)? '0' : '1';
	}
	
	public static char flip(char c)
	{
		return (c == '0')? '1':'0';
	}
	
	public static String binaryToGray(String bin)
	{
		String gray = "";
		
		gray += bin.charAt(0);
		
		for(int i=1;i<bin.length();i++)
		{
			gray += xor(bin.charAt(i-1),bin.charAt(i));
		}
		
		return gray;
		
	}
	 	
	public static void main(String[] args) {
		
		
		String binary = "100110";
		String res = binaryToGray(binary);
//		System.out.println("binary = "+binary+"\ngray code = "+res);
		System.out.println(Integer.toBinaryString(12));
		Integer n = new Integer(binary);
		System.out.println(n);
	}
	
}
