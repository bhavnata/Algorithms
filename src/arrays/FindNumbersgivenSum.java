package arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FindNumbersgivenSum {

	public static void main(String[] args) {

		// Array of sorted numbers
		int[] numArray = {1,4,3,0};
		int sum = 2;
		int[] result = twoSum(numArray,sum);
		if(result == null)
			System.out.println("result not found");
		else
			System.out.println(result[0]+ "   "+result[1]);


	}
	/**
	 * 
	 * @param numArray
	 * @param sum
	 */
	//		public static void findTwoNumbers(int[] numArray, int sum) {
	//			int i=0,j=numArray.length-1;
	//			while(i<j)
	//			{
	//				int result = numArray[i]+numArray[j];
	//				if(result == sum)
	//				{
	//					System.out.println("The numbers are  "+numArray[i]+"    "+numArray[j]);
	//					break;
	//				}
	//				if(result < sum)
	//					i++;
	//				else
	//					j--;
	//			}
	//			System.out.println("There are no such numbers");
	//		}
	//	}

	public static int[] twoSum(int[] numArray, int target) {
		int[] retArray = new int[2];
		boolean stored = false;
		HashMap<Integer,List<Integer>> numbers = new HashMap<Integer,List<Integer>>();
		for(int i=0;i<numArray.length;i++)
		{
			// Checking if the hash map contains the number already , add it to the list 
			// and insert it into the hash map
			if(!numbers.containsKey(numArray[i]))
			{
				List<Integer> sameNumber = new LinkedList<Integer>();
				sameNumber.add(i+1);
				numbers.put(numArray[i],sameNumber);
			}
			// If the hash map doesn't contain the number then add the number 
			else
			{
				List<Integer> sameNumber = numbers.get(numArray[i]);
				sameNumber.add(i+1);
				numbers.put(numArray[i],sameNumber);
			}
		}
		// Scan each input number 
		for(int j=0;j<numArray.length;j++)
		{			
			int val = target-numArray[j];
			// If the difference is already there in the Hash Map
			if(numbers.containsKey(val))
			{
				//Get the value from the hash map 
				List<Integer> value = numbers.get(val);
				//If that value is same as the scanned input
				if(val == numArray[j])
				{
					// Check if it has multiple indices - If it has then return the two indices
					if(value.size() > 1)
					{
						retArray[0]=value.get(0);
						retArray[1]=value.get(1);
						return retArray;
					}
					// If it does not have multiple indices - Record that the same number
					// can be added to itself to give the sum
					else
					{
						stored = true;
						List<Integer> value2 = numbers.get(numArray[j]);
						retArray[0]=value2.get(0);
						retArray[1]=value2.get(0);
						continue;
					}
				}
				//If there is a pair i,j such that i<j and i+j=target then return it
				List<Integer> value2 = numbers.get(numArray[j]);
				List<Integer> value3 = numbers.get(val);
				retArray[0]=value2.get(0);
				retArray[1]=value3.get(0);
				return retArray;
			}


		}
		// If the number added to itself yields the sum then return that otherwise return null
		if(!stored)
			return null;
		else
			return retArray;

	}
}

