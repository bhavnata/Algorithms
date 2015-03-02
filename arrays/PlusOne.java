package arrays;

public class PlusOne
{
	public static void main(String[] args){
		int[] result = plusOne();
		for(int i:result)
		System.out.println(i);
	}
	public static int[] plusOne(){

		// Array of numbers having most significant digit
		int[] arr = {9};    
		int carry = 1,sum=0;    
		for(int i=arr.length-1;i>=0;i--){
			sum = (arr[i] + carry) % 10;
			carry = (arr[i] + carry) / 10;
			arr[i] = sum;
		} 
		if(carry>0){
			int[] result = new int[arr.length+1];
			result[0]=carry;
			for(int i=1;i<=arr.length;i++)
				result[i]=arr[i];
			return result;
		}    
		return arr;

	}
}

