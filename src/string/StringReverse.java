package string;

public class StringReverse {

	public static String reverseString(String str) {

		char[] c = str.toCharArray();
		
		int i = 0;
		int j = str.length()-1;
		
		while(i < j)
		{
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			
			i++;
			j--;
		}
		
		
		return new String(c);


	}
	
	public static String reverseString2(String str) {
			
		StringBuilder s = new StringBuilder(str);
		s.reverse();
		return new String(s);
	}
	
	public static void main(String[] args) {
		
		String str = "hello";
		String rev = reverseString(str);
		System.out.println(rev);
		
	}
	
}
