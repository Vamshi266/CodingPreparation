package stack;

import java.util.Stack;

public class ReverseString {

	
	// string  = "love"
	// | e |
	// | v |
	// | o | 
	// | l |
	// string when popped : "evol"
	public static String reverseString(String str)
	{
		if(str == "" || str.length() == 1)
			return str;
		
		Stack<Character> s = new Stack<>();
		for(char c:str.toCharArray())
		{
			s.push(c);
		}
		String res = "";
		while(!s.isEmpty())
		{
			res += s.pop();
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		String str = "hello world!";
		System.out.println(reverseString(str));
		
		
	}
	
	
}
