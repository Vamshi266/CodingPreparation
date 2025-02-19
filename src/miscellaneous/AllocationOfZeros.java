package miscellaneous;

public class AllocationOfZeros {

	public static void setZeros(int[][] arr)
	{
		int col0 = 1;
		int rows = arr.length;
		int cols = arr[0].length;
		
		for(int i=0;i<rows;i++)
		{
			if(arr[i][0] == 0)
				col0 = 0;
			for(int j=1;j<cols;j++)
			{
				if(arr[i][j] == 0)
					arr[i][0] = arr[0][j] = 0;
			}
		}
		
		for(int i=rows-1;i>=0;i--)
		{
			for(int j = cols-1;j>=1;j--)
			{
				if(arr[i][0] == 0 || arr[0][j] == 0)
					arr[i][j] = 0;
				
				if(col0 == 0)
					arr[i][0] = 0;
			}
		}
	}
	
	public static void printArray(int arr[][])
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
	
	
	//bruteforce
	public void setZeros2(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j] == 0)
				{
					markRow(arr,i,m);
					markCol(arr,j,n);
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j] == -1)
				{
					arr[i][j] = 0;
				}
			}
		}
		
		
	}
	
	public static void markRow(int arr[][],int i,int m)
	{
		for(int j=0;j<m;j++)
		{
			if(arr[i][j] != 0)
				arr[i][j] = -1;
		}
	}
	
	public static void markCol(int arr[][],int j,int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i][j] != 0)
				arr[i][j] = -1;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		printArray(arr);
		setZeros(arr);
		System.out.println("---------------------------");
		printArray(arr);
	}
	
	
}
