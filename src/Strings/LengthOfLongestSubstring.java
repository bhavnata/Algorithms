package Strings;
import java.util.HashSet;

class LengthOfLongestSubstring
{
	public static void main(String[] args)
	{
		int val = lengthOfLongestSubstring("abccd");
		System.out.println(+val);
	}
	    public static int lengthOfLongestSubstring(String s) {
	        if(s.length() == 0)
	            return 0;
	        if(s.length() == 1)
	            return 1;
	        int sublength = lengthOfLongestSubstring(s.substring(1));
	        HashSet<Character> charLetters = new HashSet<Character>();
	        charLetters.add(s.charAt(0));
	        for(int i=1;i<s.length()-1;i++)
	            {
	                char cur = s.charAt(i);
	                if(charLetters.contains(cur))
	                    break;
	                else
	                   charLetters.add(cur);
	            }
	        int withFirstCharLength = charLetters.size();
	        int val = sublength > withFirstCharLength ? sublength : withFirstCharLength;
	        
			return val;
	    }
	}

//	public static int lengthOfLongestSubstring(String s) {
////		if(s.length() == 0) {
////			return 0;
////		}
//		//BASE CASE: If the length of the string s is 1, then the length of the longest substring is 1
//		if(s.length() == 1){
//			System.out.println("returning base 1");
//			return 1;
//		}
//
//		//Else, can we find the length of the string s[1..]
//		System.out.println("substring value =   "+s.substring(1));
//		int subLength = lengthOfLongestSubstring(s.substring(1));
//		System.out.println("subLength =   "+subLength);
//		//Calculate the length of longest string without duplicates INCLUDING the first character
//		int firstCharSubstringMaxLength = 0;
//
//		//Some code to calculate firstCharSubstringMaxLength
//		HashSet<Character> letters = new HashSet<Character>();
//		System.out.println("entered 2nd half ");
//		letters.add(s.charAt(0));
//		System.out.println("charAt(0) now is "+s.charAt(0));
//		System.out.println("s.length value is  "+s.length());
//		for(int i=1;i<s.length();i++){
//			char cur = s.charAt(i);
//			System.out.println("cur =  "+cur);
//			if(letters.contains(cur)){
//				System.out.println("broke");
//				break;
//				
//			} else {
//				letters.add(cur);
//			}
//		}
//
//		firstCharSubstringMaxLength = letters.size();
//		int val = firstCharSubstringMaxLength > subLength ? firstCharSubstringMaxLength : subLength;
//		System.out.println("returning "+val);
//
//		return firstCharSubstringMaxLength > subLength ? firstCharSubstringMaxLength : subLength;
//	}
//}

