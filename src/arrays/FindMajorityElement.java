package arrays;

public class FindMajorityElement {
	public static void main(String[] args)
	{
		int[] num = { 2,3,2,2,5};
		int result = findMajority(num);
		if(result != 0)
			System.out.println(" Majority is "+result);
		else
			System.out.println("No majority element");
	}

	public static int findMajority(int[] num) {
	    int count = 1,mi = 0;
        for(int i=1;i<num.length;i++)
        {
            if(num[mi] == num[i])
                count++;
            else
                count--;
            if(count == 0)
            {
                mi = i;
                count = 1;
            }
        }
        count = 0;
        for(int i=0;i<num.length;i++)
        {
            if(num[mi] == num[i])
                count++;
            else
                continue;
        }
        if( count >= num.length/2)
        return num[mi];
        return 0;
	}
}
