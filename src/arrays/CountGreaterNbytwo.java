package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountGreaterNbytwo {

	
	//bruteforce
	public static int countNumGreaterThanNby2_1(int arr[])
	{
		int n = arr.length;
		
		for(int i=0;i<n;i++)
		{
			int count = 0;
			for(int j=i;j<n;j++)
			{
				if(arr[i] == arr[j])
					count++;
			}
			if(count > (n/2))
				return arr[i];
		}
		
		return -1;
		
		
	}
	
	//better
	public static int countNumGreaterThanNby2_2(int arr[])
	{
		int n = arr.length;
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i:arr)
		{
			int temp = hm.getOrDefault(i,0);
			hm.put(i,temp+1);
		}
		
		
		for(Map.Entry<Integer,Integer> it:hm.entrySet())
		{
			if(it.getValue() > (n/2))
				return it.getKey();
		}
		
		
		return -1;
	}
	
	public static int countNumGreaterThanNby2_3(int arr[])
	{
		int cnt = 0;
		int el = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(cnt == 0)
			{
				cnt = 1;
				el = arr[i];
			}
			else if(arr[i] == el)
				cnt++;
			else
				cnt--;
		}
		
		int cnt1 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == el)
				cnt1++;
		}
		
		if(cnt1 > (arr.length/2))
			return el;
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,2,1,3,1,1,3,1,1};
		int res = countNumGreaterThanNby2_1(arr);
		System.out.println("the element whose count is greater than n/2 = "+res);
		
		
	}
	
}
