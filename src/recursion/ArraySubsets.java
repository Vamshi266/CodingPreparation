package recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ArraySubsets {

	public static void powerSet(int arr[],List<List<Integer>> res,Deque<Integer> temp,int n)
	{
		if(n == 0)
		{
			res.add(new ArrayList<>(temp));
			return;
		}
		
		temp.addLast(arr[n-1]);
		powerSet(arr, res, temp, n-1);
		
		temp.removeLast();
		powerSet(arr,res,temp,n-1);
		
	}
	
	public static void main(String[] args) {
		
		List<List<Integer>> res = new ArrayList<>();
		int arr[] = {1,2,3};
		Deque<Integer> temp = new ArrayDeque<>();
		int n = arr.length;
		
		powerSet(arr, res,temp, n);
		System.out.println(res);
		
	}
	
	
}
