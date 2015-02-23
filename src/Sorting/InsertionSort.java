package Sorting;

class InsertionSort
{
	//Insertion sort 
	public static void main(String[] args)
	{
		int[] A = {10,12,3,8,7,19,9};
		insertSort(A);
		for(int i:A)
		System.out.print(i+" ");
	}
	public static void insertSort(int[] a)
	{
		int i,j,val;
		for(j=1;j<a.length;j++)
		{
			i=j-1;
			val = a[j];
			while(i>=0 && val < a[i]) 
			{
				a[i+1]=a[i];
				i--;
			}
			a[i+1] = val;
		}
	}
}