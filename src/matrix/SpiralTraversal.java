package matrix;

import java.util.ArrayList;

public class SpiralTraversal {

	public static ArrayList<Integer> spiralForm(int[][] arr)
	{
		int top = 0;
		int bottom = arr.length-1;
		int left = 0;
		int right = arr[0].length-1;
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while((left <= right) && (top <= bottom))
		{
		
			for(int i=left;i<=right;i++)
			{
				al.add(arr[top][i]);
			}
			top++;
			
			for(int i = top;i<=bottom;i++)
			{
				al.add(arr[i][right]);
			}
			right--;
			
			if(top <= bottom)
			{
				for(int i = right;i>=left;i--)
				{
					al.add(arr[bottom][i]);
				}
				bottom--;
				
			}
			
			
			if(left <= right)
			{
				for(int i = bottom;i>=top;i--)
				{
					al.add(arr[i][left]);
				}
				left++;
				
			}
	   }
		return al;
  }
	

	public static void printArray(int[][] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		ArrayList<Integer> spiralMatrix = spiralForm(arr);
		printArray(arr);
		System.out.println();
		for(int i : spiralMatrix)
		{
			System.out.print(i+" ");
		}
		
	}
	
	
	
	
	
}
