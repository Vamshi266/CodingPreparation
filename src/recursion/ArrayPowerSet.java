package recursion;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayPowerSet {

	public static void powerSet(int arr[],Deque<Integer> res,int n)
	{
		//base case 
        //when we reach last level
        //print the element list
		if(n == 0)
		{
			for(Integer e:res)
			{
				System.out.print(e);
			}
			System.out.println();
			return;
		}

		
        //include element
		res.addLast(arr[n-1]);
		powerSet(arr, res, n-1);
		
		//not include element
		res.removeLast();
		powerSet(arr, res, n-1);
		
	}
	
	public static void main(String[] args) {
		
			int arr[] = {1,2,3};
			Deque<Integer> res = new ArrayDeque<>();
			int n = arr.length;
			powerSet(arr, res, n);
	}
	
}
