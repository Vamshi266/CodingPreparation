package recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSubsequences {

	
	//no of subsequences possible for string = 2^n
	//eg :- for "abc" it's 2^3 = 8
	public static void gss(String s,String ans)
	{
		if(s.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		//include next char
		gss(s.substring(1),ans+s.charAt(0));
		
		//not include next char
		gss(s.substring(1),ans);
	}
	
	public static void gss1(String s,String str,int index)
	{
		if(index == s.length())
		{
			System.out.println(str);
			return;
		}
		
		gss1(s,str+s.charAt(index),index+1);
		gss1(s,str,index+1);
	}
	
	public static void generateSubSequences(String s,List<String> res,int index,String str)
	{
		if(index == s.length())
		{
			if(str.length() > 0)
			 res.add(str);
			return;
		}
		
		generateSubSequences(s, res, index+1, str+s.charAt(index));
		generateSubSequences(s, res, index+1, str);
		
		
	}
	
	public static void main(String[] args) {
		
		List<String> res = new ArrayList<String>();
		String s = "abc";
		String str = "";
		int index = 0;
//		generateSubSequences(s, res, 0, str);
		gss1(s,str,0);
	}
	
	
}
