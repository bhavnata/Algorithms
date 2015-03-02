package arrays;


public class threeSumPointer {
	public static void main(String[] args)
	{
		
		int[] numArray ={2,4,5,6,10,11};
		int sum = 23;
		indices result = findThreeSum(numArray,sum);
		if (result != null)
			System.out.println(" i=  "+result.i+"  j= "+result.j+" k= "+result.k);
		else
			System.out.println(" No such indices");
		
	}

	public static indices findThreeSum(int[] numArray, int sum) {
		for(int i=0; i < numArray.length-2;i++)
		{
			int start = i+1;
			int end = numArray.length-1;
			while(start < end)
			{
				int result = numArray[i]+numArray[start]+numArray[end];
				if(result == sum)
				{
					return new indices(i,start,end);
				}
				if(result < sum)
					start++;
				else 
					end--;
			}
		}
		return null;
		
	}
}
