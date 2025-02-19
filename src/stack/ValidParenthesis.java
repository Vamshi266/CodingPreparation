package stack;

import java.util.Stack;

public class ValidParenthesis {

	
	public static boolean checkParanthesis(String str)
	{
		Stack<Character> s = new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			//if opening bracket push it on to stack
			if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[')
			{
				s.push(str.charAt(i));
			}
			else
			{
				//check first whether stack is not empty 
				if(!s.isEmpty())
				{
					//match for closing bracket
					char temp = s.peek();
					if((str.charAt(i) == '}' && temp == '{') ||
					   (str.charAt(i) == ')' && temp == '(') || 
					   (str.charAt(i) == ']' && temp == '['))
					{
						//if matched pop the element
						s.pop();
					}
					else
					{
						//if there is a closing bracket and no matching open bracket
						//then stack will not be empty. hence return false
						return false;
					}
				}
				else
				{
					//if all are open paranthesis and there is no closed ones
					return false;
				}
			}
		}
		
		//if stack is empty that means paranthesis are balanced return true else return false
		if(s.isEmpty())
			return true;
		else
			return false;
	
	}
	
	public static void main(String[] args) {
		
		String str = "{[()]";
		boolean res = checkParanthesis(str);
		System.out.println("valid parenthesis : "+res);
		
		
	}
	
}
