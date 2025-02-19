package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrangeBySign2 {

	public static void arrangeBySign2(int arr[])
	{
		int n = arr.length;
		
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] > 0)
				pos.add(arr[i]);
			else
				neg.add(arr[i]);
		}
		
		// If positives are lesser than the negatives.
		if(pos.size() < neg.size())
		{
			// First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
			for(int i=0;i<pos.size();i++)
			{
				arr[2*i] = pos.get(i);
				arr[(2*i)+1] = neg.get(i);
			}
			
			int index = pos.size() * 2;
			
			 // Fill the remaining negatives at the end of the array.
			for(int k=pos.size();k<neg.size();k++)
			{
				arr[index] = neg.get(k);
				index++;
			}
		}
		//If negatives are lesser than the positives.
		else
		{
			
			// First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
			for(int i=0;i<neg.size();i++)
			{
				arr[2*i] = pos.get(i);
				arr[(2*i)+1] = neg.get(i);
			}
			
			int index = neg.size() * 2;
			
			// Fill the remaining positives at the end of the array.
			for(int i=neg.size();i<pos.size();i++)
			{
				arr[index] = pos.get(i);
				index++;
			}	
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,-1,-2,-3,5};
		arrangeBySign2(arr);
		
		
	}
	
	
}
