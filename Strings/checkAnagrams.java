package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class checkAnagrams {

	public static void main(String[] args) {
		String str1 = "bhavya";
		String str2 = "havbys";
		if(str1.length() != str2.length())
			System.out.println("Strings are not anagrams");
		else
		{
//		useArrays(str1,str2);
		boolean result = useHashMap(str1,str2);	
		if(result == true)
			System.out.println("Strings are anagrams");
		else
			System.out.println("Strings are not anagrams");
	}
	}
	public static boolean useHashMap(String str1, String str2) {
		// Get a character array , insert every character from first string into hash map and 
		// for the second string decrement the count of the same character
		// if there is any additional character not in hashmap immediately return false
		HashMap<Character,Integer> charAnagrams = new HashMap<Character,Integer>();
		char[] charArray = str1.toCharArray();
		boolean result = false;
		for(char c: charArray)
		{
			
			if(charAnagrams.containsKey(c))
			{
				int count = charAnagrams.get(c);
				charAnagrams.put(c, ++count);
			}
			else
			{
				int count = 0;
				charAnagrams.put(c, ++count);
			}
		}
		charArray = str2.toCharArray();
		for(char c:charArray)
		{
			
			if(charAnagrams.containsKey(c))
			{
				int count = charAnagrams.get(c);
				if(--count == 0)
				{
					charAnagrams.remove(c);
				}
				else
				{
				charAnagrams.put(c, count);
				}
			}
			else
			{
				result = false;
			}
		}
//		int i = 0;
		for(int s : charAnagrams.values())
		{
			System.out.println(s);
		}
//				if(s!=0)
//					break;
//				else
//					result = true;
//		}
		if(charAnagrams.isEmpty())
			result = true;
							
		return result;
		
	}
	public static void useArrays(String str1, String str2) {
		String s1 = sortChars(str1);
		String s2 = sortChars(str2);
		if(s1.equals(s2))
			System.out.println("Strings are anagrams");
		else
			System.out.println("Strings are not anagrams");
		
	}
	public static String sortChars(String str1) {
		char[] charArray = str1.toCharArray();
	 Arrays.sort(charArray);
	 return String.valueOf(charArray);
	}

}
