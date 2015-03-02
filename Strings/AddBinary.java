package Strings;

public class AddBinary
{
	public static void main(String[] args)
	{
		String string1 = "11";
		String string2 = "1";
		String result = findSum(string1,string2);
		System.out.println(result);

	}
	public static String findSum(String str1,String str2)
	{
		int carry = '0' - '0';
		int i;
		int len1 = str1.length();
		int len2 = str2.length();
		String result="";
		String newstr1="",newstr2="";
		// Append 0’s in the shorter string
		int diff;
		if (len1 > len2) 
		{ 
			diff = len1 - len2;
			for(i=0;i<diff;i++)
				newstr2+= "0";
			newstr2 += str2;
			str2 = newstr2;
		}	
		if(len2 > len1)
		{
			diff = len2 - len1;
			for(i=0;i<diff;i++)
				newstr1 += "0";
			newstr1 += str1;
			str1 = newstr1;
		}


		System.out.println(str1+"   "+str2);
		int n = str1.length();
		for(i=n-1;i>=0;i--)
		{
			int a = str1.charAt(i) - '0';
			int b = str2.charAt(i) - '0';
			int sum = a ^ b ^ carry;
			carry = (a & b) | (b & carry) | (carry & a);
			result = sum + result;
		
		}
		if(carry == 1)
			result = "1"+result;
		return result;
	}
}


