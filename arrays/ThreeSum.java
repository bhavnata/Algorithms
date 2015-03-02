package arrays;
class indices 
{
	int i;
	int j;
	int k;
	public indices(int low, int mid, int high) {
		this.i = low;
		this.j = mid;
		this.k = high;
	}

}
class ThreeSum
{
	public static void main(String[] args)
	{
		int[] numArray ={2,4,5,6,10,11,34,37};
		int sum = 20;
		int low = 0,high=numArray.length-1;
		indices result = findThreeSum(numArray,sum,low,high);
		if(result!=null)
			System.out.println("i="+result.i+"  j=  "+result.j+"   k=   "+result.k);
		else
			System.out.println("No such indices.");
	}
	public static indices findThreeSum(int[] numArray,int sum,int low,int high)
	{
		while(low<high)
		{
			int result = sum-numArray[low]-numArray[high];
			int mid = binarySearch(numArray,low+1,high-1,result);
			if(mid != -1)
			{
				return new indices(low,high,mid);
			}
			if (mid == -1)
			{
				indices r,s,t;
				r = findThreeSum(numArray,sum,low+1,high);
				if(r == null)
					s = findThreeSum(numArray,sum,low,high-1);
				else
					return r;
				if(s == null)
					t = findThreeSum(numArray,sum,++low,--high);
				else
					return s;
				if(t == null)
					return null;
				else
					return t;

			}
		}
		return null;
	}
	public static int binarySearch(int[] numArray,int low , int high,int key)
	{
		if(low<=high)
		{
			int mid = (low+high)/2;
			if(numArray[mid] == key)
				return mid;
			else if(key > numArray[mid])
				return binarySearch(numArray,mid+1,high,key);
			else 
				return binarySearch(numArray,low,mid-1,key);
		}
		return -1;
	}
}
