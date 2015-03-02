package Sorting;

class MergeSort
{
	public static void main(String[] args)
	{
		int[] A={ 9,18,2,13,4,15,10,50,35,24};
		mSort(A,0,A.length-1);
//		for(int i:A)
//			System.out.print(i+" ");
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void mSort(int[] A,int p,int r)
	{

		if(p<r)
		{
			int q = (p+r)/2;
			
			System.out.print("BEFORE 1:_____(p="+p+",q="+q+",r="+r+"):");
			for(int i=p;i<=q;i++){
				System.out.print(A[i]+" ");
			}
			System.out.println();
			mSort(A,p,q);
			System.out.print("AFTER 1:_____(p="+p+",q="+q+",r="+r+"):");
			for(int i=p;i<=q;i++){
				System.out.print(A[i]+" ");
			}
			System.out.println();
			
			System.out.print("BEFORE 2:_____(p="+p+",q="+q+",r="+r+"):");
			for(int i=q+1;i<=r;i++){
				System.out.print(A[i]+" ");
			}
			System.out.println();
			mSort(A,q+1,r);
			System.out.print("AFTER 2:_____(p="+p+",q="+q+",r="+r+"):");
			for(int i=q+1;i<=r;i++){
				System.out.print(A[i]+" ");
			}
			System.out.println();
			
			merge(A,p,q,r);
		}
	}
	public static void merge(int[] A,int p,int q,int r)
	{
		int i,j,k;
		int ls = (q-p)+1;
		int rs = (r-q);
		
		int[] L = new int[ls];
		int[] R = new int[rs];
		
		for(i=p;i<=q;i++){
			L[i-p] = A[i];
		}
		System.out.print("L:");
		for(i=0;i<L.length;i++){
			System.out.print(L[i]+" ");
		}
		System.out.println();
			
		for(j=q+1;j<=r;j++){
			R[j-(q+1)]=A[j];
		}
		System.out.print("R:");
		for(i=0;i<R.length;i++){
			System.out.print(R[i]+" ");
		}
		System.out.println();
		System.out.println("Routine:(p="+p+",q="+q+",r="+r+"):");

		
		i=j=0;
		for(k=p;k<=r;k++) {
			if((i<ls) &&  (j<rs)){
				if(L[i]<=R[j])
				{
					A[k]=L[i++];
//					System.out.println("i "+i+"k "+k);
				} else {
					A[k]=R[j++];
//					System.out.println(" j"+j+" k"+k);
				}
			} else{ 
				break;
			}
		}
		while(j>=rs && i<ls) A[k++]=L[i++];
		while(i>=ls && j<rs) A[k++]=R[j++];
		
		//		for(k=p; k<=r; k++) {
		//			if ((j>=rs) || ((i<ls) && (L[i] <= R[j])))
		//				A[k] = L[i++];
		//			else
		//				A[k] = R[j++];
		//		}
	}
//
}
