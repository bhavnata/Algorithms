package arrays;
public class AddTwoNumberstoSum {
	  public int[] twoSum(int[] numbers, int target) {
      int i=0,j=numbers.length-1;
		int[] returnArray = new int[2];
		while(i<=j)
		{
			int result = numbers[i]+numbers[j];

			if(result == target)
			{
				returnArray[0]=i+1;
				returnArray[1]=j+1;
				return returnArray;
			}
			if (result < target)
				i++;
			else
				j--;
		}
		return null;
	}  
    }