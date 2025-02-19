package string;

import java.util.HashMap;

public class Panagram {
	
	public static boolean checkPanagram(String str)
	{
		if(str == null)
			 return false;
		
		if(str.length() < 26)
		 return false;
		
		str = str.toLowerCase();
		
		 HashMap<Character,Integer> hm = new HashMap<>();
		 
		 for(char ch:str.toCharArray())
		 {
			 if(ch >='a' && ch <= 'z')
			 {
				 hm.put(ch, hm.getOrDefault(ch,0)+1);
			 }
		 }
		 
		 if(hm.size() < 26)
			 return false;
		 
		 for(int val:hm.values())
		 {
			 if(val == 0)
				 return false;
		 }
		 
		 return true;
	}
	
	public static boolean checkPanagram2(String str)
	{
		char ch = 'a';
		
		for(int i=1;i<=26;i++)
		{
			if(str.contains(String.valueOf(ch)))
				ch++;
			else
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		boolean res = checkPanagram2(str);
		System.out.println(res);
		
	}

}
