package arrays;

import java.util.ArrayList;
import java.util.List;

public class NextPerm {

	
	public static void main(String[] args) {
		int n = 54123;
		List<Integer> number = new ArrayList<Integer>();
		number = getNumber(number,n);
		int[] value = new int[number.size()];
		int l=value.length;
		for(int k : number)
			value[--l]=k;
		int[] valu = getNextperm(value);
		for(int i:valu)
			System.out.print(i);
}
	public static int[] getNextperm(int[] a) {
		int j=a.length-1,l=a.length-1,x = 0,y=0;
		//find max j such a[j]<a[j+1]
		while(a[j-1]<=a[j])
		{
			if(j==1){
				return null;
			}
			j--;
		}
		x=j-1;
	
		//find max l such that a[j]<a[l]
		while(a[x]<=a[l])
		{
			l--;
		}
		y=l;
		//exchange a[j] and a[l]
		swap(a,x,y);
		// reverse a[j+1]...a[n]
		reverse(a,x+1,a.length);
		return a;
	}
	public static void reverse(int[] a, int x, int length) {
		for(int i=x;i<length;i++)
			swap(a,i,--length);
		
	}
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] =a[j];
		a[j]=temp;
		
	}
	public static List<Integer> getNumber(List<Integer> number,int n) {
		while(n!=0)
		{
			number.add(n % 10);
			n=n/10;
		}	
		
		return number;
	}

}
