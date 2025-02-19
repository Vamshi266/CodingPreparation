package matrix;

public class RotateBy90 {

	public static int[][] rotateBy90(int[][] arr)
	{
		
		int n = arr.length;
		int[][] ans = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				ans[j][n-1-i] = arr[i][j];
			}
		}
		
		return ans;
	}
	
	
	
	
	
	//here in order to get 90 degree rotation
	//step 1 - transpose the matrix
	//step 2 - reverse every row in matrix
	public static void rotateBy90_2(int[][] arr)
	{
		//transpose
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr[0].length;j++)
			{
				int temp = 0;
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		int n = arr.length;
		
		//reverse every row
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				int temp = 0;
				temp = arr[i][j];
				arr[i][j] = arr[i][n-1-j];
				arr[i][n-1-j] = temp;
			}
		}
		
	}
	
	public static void printArray(int[][] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		printArray(arr);
		System.out.println();
//		int[][] res = rotateBy90(arr);
		rotateBy90_2(arr);
		printArray(arr);
		
	}
	
}
