package stack;

import java.util.Stack;

//celebrity problem

//a person is celebrity
 //1)everyone knows him
//2)he knows no one
//  | 0 1 2
// -|------  
//0 | 0 1 0
//1 | 0 0 0
//2 | 0 1 0
// here if we see arr[2][1] = 1 that means person 2 knows person 1
//the diagonal elements will all be zeros as a person doesn't considered to know himself

//conditions for celebrity
//1)the person row will all be zeros
//2)the person column will all be 1's except his particualr cell
//eg:- take 1 his row is all zeros and his column is all 1's except himself

//youtube
//babbar - https://rb.gy/48v5wl  


public class CelebrityProblem {
	
	public static boolean knows(int arr[][],int a,int b)
	{
		if(arr[a][b] == 1)
			return true;
		else
			return false;
	}

	public static int checkCelebrity(int[][] arr)
	{
		Stack<Integer> s = new Stack<>();
		int n = arr.length;
		
		
		//step-1
		//push every person on to the stack
		for(int i=0;i<n;i++)
		{
			s.push(i);
		}
		
		//step-2
		//this will remove all people who know some other person in the list
		//we are doing this because we are removing people who are not celebrities
		//as a celebrity knows no one.
		while(s.size() != 1)
		{
			int a = s.pop();
			int b = s.pop();
			
			if(knows(arr,a,b))
				s.push(b);
			else
				s.push(a);
		}
		
		//step-3
		//single element present in the stack is a potential celebrity
		//check for conditions
		
		int person = s.peek();
		
		boolean rowCheck = false;
		int zeroCount = 0;
		
		//check wheather all row elements are zeros
		for(int i=0;i<n;i++)
		{
			if(arr[person][i] == 0)
				zeroCount++;
		}

		//there will be n zeros in person's row
		if(zeroCount == n)
			rowCheck = true;
		
		boolean colCheck = false;
		int colCount = 0;
		
		
		//check whether all col elements of the person are 1's except himself
		for(int i=0;i<n;i++)
		{
			if(arr[i][person] == 1)
				colCount++;
		}
		
		//there will be n-1 1's in persons col
		if(colCount == n-1)
			colCheck = true;
		
		//if both conditions are true then return the person
		if(rowCheck && colCheck)
			return person;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
