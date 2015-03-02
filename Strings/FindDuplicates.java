package Strings;

import java.util.HashMap;


public class FindDuplicates
{
	public static void main(String[] args)
	{
		String org = "test string";
		int count;
		HashMap<Character,Integer> letters = new HashMap<Character,Integer>();
		for(int i=0;i<org.length();i++)
		{
			char c = org.charAt(i);
			if(!letters.containsKey(c))
				letters.put(c,1);
			else if(letters.containsKey(c))
			{
				int storedCount = letters.get(c);
				storedCount++;
				letters.put(c,storedCount);         
			}
		}
		for(char s: letters.keySet())
			if(letters.get(s) > 1)
				System.out.println(s+" , count = "+letters.get(s));

	}
}
