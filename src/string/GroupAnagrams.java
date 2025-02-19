package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	//youtube
	//anuj bhayya - https://bit.ly/47W81Me
	
	
	static HashMap<String,List<String>> groupAnagrams(String[] strArr)
	{
		HashMap<String,List<String>> hm = new HashMap<>();
		if(strArr.length == 0)
			return hm;
		
		
		for(String str:strArr)
		{
			char ch[] = str.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			if(!hm.containsKey(sorted))
				hm.put(sorted, new ArrayList<>());
			hm.get(sorted).add(str);
		}
		
		return hm;
	}
	
	public static void main(String[] args) {
		
		String[] strArr = {"ate","eat","dog","god"};
		HashMap<String,List<String>> al = groupAnagrams(strArr);
		System.out.println(al);
		
	}

}
