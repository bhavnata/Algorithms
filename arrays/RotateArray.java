package arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums={1,2,3};
		int k=1;	
		rotate(nums,k);
		for(int i:nums)
			System.out.print(i+" ");
	}
	public static void rotate(int[] nums, int k) {
		int i=0,j=0;
		if(nums.length == 1 || nums.length == 0)
			return;
		if(k > nums.length){
		    k = k % nums.length;
		}
		while(j++<k){
			int temp = nums[nums.length-1];
			for(i=nums.length-1;i>=1;i--){
				nums[i]=nums[i-1];
			}
			nums[0]=temp;
		}
	}
}


