package recursion;

import java.util.Arrays;
import java.util.List;

public class ReverseString {
	
	
	public static String revStringUsingIteration(String str)
	{
		int i = 0;
		int j = str.length()-1;
		char[] c = str.toCharArray();
		
		while(i != j)
		{
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			
			i++;
			j--;
		}
		
		return Arrays.toString(c);
	}

	public static String reverseString(String str,int i)
	{
		if(i == -1)
			return "";
		
		return str.charAt(i) + reverseString(str,i-1);
	}

	
	public static void reverseString2(char[] str,int i,int j)
	{
		if(i>j)
			return;
		
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		i++;
		j--;
		
		reverseString2(str, i, j);
	}
	
	public static void revString(char[] str)
	{
		swap(str,str.length-1);
		System.out.println(new String(str));
	}
	
	public static void swap(char[] s,int i)
	{
		if(i < (s.length/2))
			return;	
		
		char temp = s[i];
		s[i] = s[s.length-i-1];
		s[s.length-i-1] = temp;
		swap(s,i-1);
	}
	
	public static boolean swap2(char[] s,int i)
	{
		if(i < (s.length/2))
			return true;;
		
		if(s[i] != s[s.length-i-1])
			return false;
		
		char temp = s[i];
		s[i] = s[s.length-i-1];
		s[s.length-i-1] = temp;
		return swap2(s,i-1);
	}
	
	
	
	public static boolean checkPalidrome(char[] str)
	{
		return swap2(str,str.length-1);
	}
	
	public static void main(String[] args) {
		
		String str = "SMS";
//		String res = reverseString(str,str.length()-1);
//		System.out.println(res);
		char[] charArray = str.toCharArray(); 
//		reverseString2(charArray, 0, str.length()-1);
//		revString(charArray);
//		for(int i=0;i<charArray.length;i++)
//		{
//			System.out.print(charArray[i]);
//		}
		boolean res = checkPalidrome(charArray);
		System.out.println(res);
		
	}
	
	
}
