package arrays;

public class MergeArray {
	public static void main(String[] args)
	{
		int[] A = {1,5,7,0,0,0};
		int[] B = {2,3,8};
		for(int i:A)
			System.out.print(i+"  ");
		System.out.println();
		for(int i:B)
			System.out.print(i+" ");
		merge(A,A.length,B,B.length);
		System.out.println(A);
	}

	public static void merge(int A[], int m, int B[], int n) {
		if((m == 0)&&(n == 1))
			A[0]=B[0];
		else if ((m == 1)&&(n==0))
			A[0]=A[0];
		else{
			int size = m+n;
			int tail = m+n;
			int j = m-1;
			while(j>=0){
				A[--tail] = A[j--];
			}
			int i=0,k=0;
			j=tail;
			while(k<size){
				//This assumes that 
				//1. j is within the size of A 
				//2. i is within the size of B
				if(j<size && i<n)
				{
					if(A[j]<=B[i]){
						A[k++] = A[j++];
					}
					else{
						A[k++] = B[i++];
					}
				}
				else{
				    break;
				}
			}
			while(j!=size) 
				A[k++] = A[j++];
			while(i!=n)
				A[k++] = B[i++];
		}
	}
}

