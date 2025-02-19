package recursion;

public class PalidromeString {

	
	
	static StringBuffer sb = new StringBuffer("");
	
	static void palidromeString(String s,int i)
	{
		if(i == s.length())
			return;
		
		palidromeString(s,i+1);
		sb.append(s.charAt(i));
		
	}
	
	public static boolean isPalidrome(char[] charArray,int i,int j)
	{
		if(i > j)
			return true;
		
		if(charArray[i] != charArray[j])
			return false;
		else
			return isPalidrome(charArray,i+1,j-1);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		String s = "ccc";
//		palidromeString(s, 0);
//		if(sb.toString().equals(s))
//		{
//			System.out.println("palidrome");
//		}
//		else
//		{
//			System.out.println("not a palidrome");
//		}
		
		boolean res = isPalidrome(s.toCharArray(), 0, s.length()-1);
		System.out.println(res);
	}
	
}
