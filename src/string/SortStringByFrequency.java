package string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortStringByFrequency {

	public static String sortByFreq(String s)
	{
		 Map<Character,Integer> hm = new HashMap<>();

	        char ch = ' ';
	        for(int i=0;i<s.length();i++)
	        {
	            ch = s.charAt(i);
	            hm.put(ch,hm.getOrDefault(ch,0)+1);
	        }

	        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> hm.get(b) - hm.get(a));
	        maxHeap.addAll(hm.keySet());

	        StringBuilder str = new StringBuilder();

	        while(!maxHeap.isEmpty())
	        {
	            ch = maxHeap.remove();
	            for(int i=0;i<hm.get(ch);i++)
	            {
	                     str.append(ch);
	            }
	        }

	        return str.toString();
	}
}
