package Strings;

public class atoIconversion {

	public static void main(String[] args) {
		String str = "+1";
		int result = atoi(str);
		System.out.println(result);

	}

	public static int atoi(String str) {
		int signBit = 1;
		int startIndex=0,endIndex=0;
		long result=0;
		int curPower = 1;
		//If String is empty, return 0
		if(str.isEmpty())
			return 0;

		for(int i=0;i<str.length()-1;i++){
			if(Character.isWhitespace(str.charAt(i)))
				continue;
			else if(str.charAt(i) == '-'){
				signBit = -1;
				if(i+1 < str.length() - 1){
					 if(Character.isDigit(str.charAt(i+1))){
						startIndex = i+1;
						break;
					}
					 else 
						 return 0;
				}  
			}
			else if(str.charAt(i) == '+'){
				signBit = -1;
				if(i+1 < str.length() - 1){
					 if(Character.isDigit(str.charAt(i+1))){
						startIndex = i+1;
						break;
					}
					 else 
						 return 0;
				}  
			}
			else if(Character.isDigit(str.charAt(i))){
				startIndex = i;
				break;

			}
		}

		for(int i=startIndex;i<str.length()-1;i++){
			if(Character.isDigit(str.charAt(i))){
				endIndex = i;
				continue;
			}
			else
				break;


		}
		for(int j = endIndex; j>=startIndex;j--){
			System.out.println(str.charAt(j));
			long curChar = str.charAt(j) - '0';
			result += curChar * curPower;
			curPower *= 10;
		}
	    if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
	    	return 0;
	   
		return (int)result*signBit;

	}
}
