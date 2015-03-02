package arrays;
public class PrintAsterixTriangle {

	public static void main(String[] args) {
		// Print right angled triangle left aligned
		for(int j=10;j>=1;j--)
		{
			for(int i=j;i>=1;i--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		//Print right angle triangle right aligned

		for(int j=10;j>=1;j--)
		{
			int k =0;
			for(int i=j;i>=1;i--)
			{

				while(k<(10-j))
				{
					System.out.print("  ");
					k++;
				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		//Print triangle starting from 1 3 5 7 9 aligned in the center
		for(int j=1;j<10;j=j+2)
		{
			int k =0;
			for(int i=0;i<j;i++)
			{
				while(k<((10-j)/2))
				{
					System.out.print("  ");
					k++;
				}
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
