package Strings;
import java.util.Scanner;
import java.util.Stack;

class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		Stack<Character> inputStack = new Stack<Character>();
		for(int i = 0;i<input.length();i++)
		inputStack.push(input.charAt(i));
		boolean result = false;
		for(int i=0;i<input.length();i++)
			if(inputStack.pop().equals(input.charAt(i)))
				result = true;
		if(result == true)
				System.out.println("It is a palindrome");
			else
				System.out.println("It is not a palindrome");
	}
}