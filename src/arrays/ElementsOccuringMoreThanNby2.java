package arrays;

import java.util.Arrays;

public class ElementsOccuringMoreThanNby2 {

	
	//optimal
	public static int[] elementsoccuringMoreThanNby2(int arr[])
	{
		int cnt1 = 0,e1 = Integer.MIN_VALUE;
		int cnt2 = 0,e2 = Integer.MIN_VALUE;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			if(cnt1 == 0 && (arr[i] != e2))
			{
				cnt1 = 1;
				e1 = arr[i];
			}
			else if(cnt2 == 0 && (arr[i] != e1))
			{
				cnt2 = 1;
				e2 = arr[i];	
			}
			else if(e1 == arr[i])
				cnt1++;
			else if(e2 == arr[i])
				cnt2++;
			else
			{
				cnt1--;
				cnt2--;
			}
		}
		
		int mini = (int)Math.floor(n/3);
		int[] ans = new int[mini];
		
		cnt1 = 0;
		cnt2 = 0;
		for(int i:arr)
		{
			if(i == e1)
				cnt1++;
			if(i == e2)
				cnt2++;
		}
		
		if(cnt1 >= mini)
			ans[0] = e1;
		if(cnt2 >= mini)
		ans[1] = e2;
		
		Arrays.sort(ans);
		
		return ans;
		
				
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3,3,3};
		int[] res = elementsoccuringMoreThanNby2(arr);
		for(int i:res)
		{
			System.out.print(i+" ");
		}
		
	}
	
}
