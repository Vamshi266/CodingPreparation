package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static int firstUniqueCharacter(String str)
	{
		if(str.length() == 1)
			return 0;
		
		int[] c = new int[26];
		Arrays.fill(c, 0);
		
		char ch = ' ';
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			c[97-i]++;
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i] == 1)
			{
				ch = (char)(97 + i);
				return str.indexOf(ch);
			}
		}
		
		return -1;
	}
	
	public static int firstUniqueCharacter2(String s)
	{
		 Map<Character,Integer> lhm = new LinkedHashMap<>();
	        char ch = ' ';
	        for(int i=0;i<s.length();i++)
	        {
	            ch = s.charAt(i);
	            lhm.put(ch,lhm.getOrDefault(ch,0)+1);
	        }

	        System.out.println(lhm);
	        boolean flag = false;

	            for(Map.Entry<Character,Integer> entry:lhm.entrySet())
	            {
	                if(entry.getValue() == 1)
	                {
	                    flag = true;
	                  ch = entry.getKey();
	                  break;
	                }
	            }

	            if(flag)
	             return s.indexOf(ch);

	        return -1;
	}
	
	public static int firstUniqueCharacter3(String str)
	{
		
		char ch = ' ';
		
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			
			if(str.indexOf(ch) == str.lastIndexOf(ch))
				 return i;
		}
		
		return -1;
	}
	
	public static int firstUniqueCharacter4(String s)
	{
		// Stores lowest index / first index
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
	}
	
	
}
