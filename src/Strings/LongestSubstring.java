package Strings;

import java.util.HashMap;



/* Driver program to test above function */
class LongestSubstring
{
	public static void main(String[] args)
	{
		String value = "abcabcdef";
		System.out.println("The input string is   "+ value);
		int len =  longestUniqueSubsttr(value);
		if(len == 0)
			System.out.println("Error");
		else
		System.out.println("The length of the longest non-repeating character substring is  "+len);

	}
	public static int longestUniqueSubsttr(String str) {

		{
			if (str.isEmpty())
				return 0;
			int n = str.length();
			int cur_len = 1;  // To store the length of current substring
			int max_len = 1;  // To store the result
			int prev_index;  // To store the previous index
			int i;
			HashMap<Character,Integer> letters = new HashMap<Character,Integer>();
			
			for(int k=0;k<n;k++)
				letters.put(str.charAt(k), -1);

			/* Mark first character as visited by storing the index of first 
       character in letters hash table. */
			
			letters.put(str.charAt(0), 0);
			
			 

			/* Start from the second character. First character is already processed
       (cur_len and max_len are initialized as 1, and letters[0] is set */
			for (i = 1; i < n; i++)
			{
				prev_index = letters.get(str.charAt(i));  
				
						
				/* If the current character is not present in the already processed
           substring or it is not part of the current NRCS, then do cur_len++ */
				if (prev_index == -1 || i - cur_len > prev_index)
					cur_len++;

				/* If the current character is present in currently considered NRCS,
           then update NRCS to start from the next character of previous instance. */
				else
				{
					/* Also, when we are changing the NRCS, we should also check whether 
              length of the previous NRCS was greater than max_len or not.*/
					if (cur_len > max_len)
						max_len = cur_len;

					cur_len = i - prev_index;
				}
				letters.put(str.charAt(i),i); // update the index of current character

				
			}

			// Compare the length of last NRCS with max_len and update max_len if needed
			if (cur_len > max_len)
				max_len = cur_len;

			return max_len;

		}
	}
}