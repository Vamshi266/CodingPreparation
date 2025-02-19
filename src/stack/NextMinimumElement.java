package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextMinimumElement {

	
	
	//bruteforce
	//here we need to return first minimum element for current element
	//in the remaining right array
	public static List<Integer> nextMinElement(int arr[])
	{
		
		List<Integer> res = new ArrayList<>();
		
		if(arr.length == 0 || arr.length == 1)
			return Arrays.asList(-1);
		
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int min = arr[i];
			boolean flag = false;
			l: for(int j=i+1;j<n;j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					flag = true;
					break l;
				}
			}
			
			if(!flag)
				min = -1;
			res.add(min);
		}
		
		return res;
	}
	
	public static List<Integer> nextMin(int arr[])
	{
		int n = arr.length;
		
		Stack<Integer> s = new Stack<>();
		List<Integer> res = new ArrayList<>();
		
		for(int i=n-1;i>=0;i--)
		{
			int curr = arr[i];
			while(s.peek() >= curr)
				s.pop();
			res.add(s.peek());
			s.push(curr);
		}

		return res;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,1,4,3};
		
		List<Integer> ans = nextMinElement(arr);
		System.out.println(ans);
		
		
	}
	
}
