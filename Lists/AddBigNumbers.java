package Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class AddBigNumbers {
	static int carry=0;
	public static void main(String[] args) {
		LinkedList<Integer> number1 = new LinkedList<Integer>();
		LinkedList<Integer> number2 = new LinkedList<Integer>();
		LinkedList<Integer> number3 = new LinkedList<Integer>();
		System.out.println("Enter two Strings");
		Scanner in = new Scanner(System.in);
		String number1value = in.nextLine();
		String number2value = in.nextLine();
		char[] numberarray = number1value.toCharArray();
		for(int i=numberarray.length-1;i>=0;--i)
			number1.add(Character.digit(numberarray[i], 10));
		char[] numberarray2 = number2value.toCharArray();
		for(int j=numberarray2.length-1;j>=0;--j)
			number2.add(Character.digit(numberarray2[j], 10));
		number3 = addNumbers(number1,number2);
		for(int i=number3.size()-1;i>=0;--i)
			System.out.print(number3.get(i));
		in.close();
	}

	public static LinkedList<Integer> addNumbers(LinkedList<Integer> number1, LinkedList<Integer> number2) {
		LinkedList<Integer> number3 = new LinkedList<Integer>();
		int sum,result,i=0,j=0;
		while( i<number1.size() && j<number2.size())
		{
			result = number1.get(i) + number2.get(j) + carry;
			carry = result / 10;
			sum = result % 10;
			number3.add(sum);
			i++;
			j++;
		}
		if(i == number1.size() && j < number2.size())
		{
			while(j<number2.size())
			{
				result = number2.get(j)+carry;
				carry = result / 10;
				sum = result % 10;
				number3.add(sum);
				j++;
			}
			
		}
		if(j == number2.size() && i<number1.size())
		{
			while(i<number1.size())
			{
				result = number1.get(i) + carry;
				carry = result / 10;
				sum = result % 10;
				number3.add(sum);
				i++;
			}
			
		}
		if(i==number1.size() && j==number2.size() && carry!= 0)
			number3.add(carry);

		return number3;
	}

}
