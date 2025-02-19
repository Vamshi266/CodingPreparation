package stack;

import java.util.Stack;


//redundant :- they are redundant if every pair of brackets doesn't have respective operator or operators
//brackets eg:- (),(abcg344), 
//((a+b)) -> (a+b) is fine but outer () is redundant
//not redundant :-  they are not redundant if every pair of brackets has an operator or operators
//eg:- (a+b),(a+(b+c))
public class RedundantBrackets {

	public static boolean redundantBrackets(String str)
	{
		Stack<Character> s = new Stack<>();
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(ch == '(' || ch == '+' || ch == '-' || ch == '/' || ch == '*')
                s.push(ch);
            else
            {  
                if(ch == ')')
                {
                    boolean flag = true;
                    while(s.peek() != '(')
                    {
                        char c = s.pop();
                        if(c == '+' || c == '-' || c == '/' || c == '*')
                            flag = false;
                    }
                    
                    if(flag)
                     return true;
                    
                    s.pop();
                }
            }
        }
        
        return false;
    }
}
	
