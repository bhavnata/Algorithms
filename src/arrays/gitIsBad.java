package arrays;

public class gitIsBad {

	static int firstBadSeen = 100;
	public static void main(String[] args) {
		// Call a function which tells which version went bad first
		checkVersion(6,90);

	}

	public static void checkVersion(int good, int bad) {
		int[] versionNumber = new int[bad-good+1];
		int i = good;
		int j = 0;
		while(j< versionNumber.length)
		{
			versionNumber[j++] = i++;
		}
		int result = binarySearch(versionNumber,0,versionNumber.length-1);
		System.out.println("The first bad version seen is  "+result);
	}
	public static int binarySearch(int[] vN, int i, int j) {
		int mid;
		if(i>j)
			return 0;
		mid = (i+j)/2;

		if(isBad(vN[mid]))
		{
			if(vN[mid]<firstBadSeen)
			{
				firstBadSeen = vN[mid];
			}
			binarySearch(vN,i,mid-1);
		}
		else if(!isBad(vN[mid]))
		{
			binarySearch(vN,mid+1,j);
		}
		return firstBadSeen ;

	}

	public static boolean isBad(int number)
	{
		if(number< 28)
			return false;
		else if ((number >=28) && (number<=99))
			return true;
		else 
			return true;
	}

}
