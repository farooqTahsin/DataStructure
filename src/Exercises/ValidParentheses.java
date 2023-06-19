package Exercises;

import java.util.Stack;

/*
	Given a string s containing just the characters 
	'(', ')', '{', '}', '[' and ']', 
	determine if the input string is valid.
	
	An input string is valid if:	
		Open brackets must be closed by the same type of brackets.
		Open brackets must be closed in the correct order.
		Every close bracket has a corresponding open bracket of the same type.
*/

public class ValidParentheses {

	public static boolean isValid(String s) {
		if(s.length()%2!=0)return false;
		Stack<Character> st =new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if( s.charAt(i)=='('||
				s.charAt(i)=='['||
				s.charAt(i)=='{'	)
				st.push(s.charAt(i));
			else {
				if(st.isEmpty())return false;
				else {
					char t=st.pop();
					if(t=='{' && !(s.charAt(i)=='}'))
						return false;
					if(t=='[' && !(s.charAt(i)==']'))
						return false;
					if(t=='(' && !(s.charAt(i)==')'))
						return false;							
				}
			}
				
		}
		if(!st.isEmpty()) return false;
		return true;
    }
	
}
