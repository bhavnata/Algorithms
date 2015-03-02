package arrays;

import java.util.Stack;

public class MatchParanthesis {

	public static void main(String[] args) {
		String s="(())";
		boolean result = isValid(s);
		if(result == true){
			System.out.println("Paranthesis Mached");
		}
		else
			System.out.println("error");

	}

	public static boolean isValid(String s) {
		if(s == null){
			return false;
		}
		if(s.length() == 1 && isOpen(s.charAt(0)))
			return false;
		if(s.length() == 1 && isClose(s.charAt(0)))
			return false;  
		Stack<Character> input = new Stack<Character>();
		char[] inputArray = s.toCharArray();
		for(char c:inputArray){
			if(isOpen(c)){
				input.push(c);
			}
			else if(isClose(c) && !input.isEmpty()){
				char onStack = input.pop();
				if(isMatch(onStack,c))
					continue;
				else if(!isMatch(onStack,c))
					return false;
			}
			else if(isClose(c) && input.isEmpty())
				return false;
		}
		if(input.isEmpty())
		return true;
		
		return false;
	}
	public static boolean isOpen(char c){
		if(c=='{'||c=='('||c=='['){
			return true;
		}
		else
			return false;
	}
	public static boolean isClose(char c){
		if(c=='}'||c==']'||c==')'){
			return true;
		}
		else 
			return false;
	}
	public static boolean isMatch(char c1,char c2){
		if(c1=='{' && c2 =='}')  return true;
		else if(c1 == '[' && c2 ==']') return true;
		else if(c1 == '(' && c2 == ')' ) return true;
		else
			return false;
	}
}


