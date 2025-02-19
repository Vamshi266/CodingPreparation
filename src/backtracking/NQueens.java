package backtracking;

import java.util.*;

public class NQueens {
	public static List<List<String>> solveNQueens(int n)
    {
        
        char board[][] = new char[n][n];
        
        //fill the board with '.'s
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        
        dfs(0,board,res);
        return res;
        
    }
    
    public static boolean isSafe(char[][] board,int row,int col)
    {
        int dupRow = row;
        int dupCol = col;
        
        //upper diagonal
        //row and col both gets reduced
        while(row >= 0 && col >= 0)
        {
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
      
        row = dupRow;
        col = dupCol;
        //lower diagonal
        //the row values increases and column decreases
        while(row < board.length && col >= 0)
        {
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        
        row = dupRow;
        col = dupCol;
        //left of row
        //only column value decreases row stay's the same
        while(col >= 0)
        {
            if(board[row][col] == 'Q') return false;
            col--;
        }
        
        return true;
    }
    
    public static void dfs(int col,char[][] board,List<List<String>> res)
    {
    	//base case
    	//if we reach last column then we have 
    	//completed the task of putting n queens
        if(col == board.length)
         {
             res.add(construct(board));
             return;
         }
         
        
        //check for all rows
         for(int row=0;row<board.length;row++)
         {
        	 //check whether the cell is safe
             if(isSafe(board,row,col))
              {
                  board[row][col] = 'Q';//is safe put the queen
                  dfs(col+1,board,res);
                  board[row][col] = '.';//while coming back from recursive call 
                  //make the cell where you placed 'Q' as empty
              }
         }
    }
    
	    public static List<String> construct(char[][] board)
	    {
	        int n = board.length;
	        List<String> temp = new LinkedList<>();
	        for(int i=0;i<n;i++)
	        {
	           String str = new String(board[i]);
	           temp.add(str);
	        }
	        
	        return temp;
	    }
    
    
    
	public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        int i = 1;
        for(List<String> l:ans)
        {
            System.out.println("Arrangement " + i);
            for(String s:l)
            {
                System.out.println(s);
            }
            System.out.println();
            i++;
        }

	}

}
