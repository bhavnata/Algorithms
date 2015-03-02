package arrays;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
//		List<List<Integer>> ret = generate(5);
		LinkedList<Integer> ret1 =  nextPascalRow(3);
		System.out.println(ret1);
	}

	public static LinkedList<Integer> nextPascalRow(int numRows) {
		LinkedList<Integer> ret = new LinkedList<Integer>();
        LinkedList<Integer> previous = new LinkedList<Integer>();
        if(numRows == 0){
			return ret;
		}
		if(numRows == 1){
			ret.add(1);
			return ret;
		}
		previous.add(1);
		previous.add(1);
		for(int i=2;i<=numRows;i++){
			LinkedList<Integer> current = new LinkedList<Integer>();
			for(int j=0;j<previous.size()-1;j++){
				int sum = previous.get(j) + previous.get(j+1);
				current.add(sum);
			}
			current.addFirst(Integer.valueOf(1));
			current.addLast(Integer.valueOf(1));
			previous = current;
			ret = current;
		}
	  return ret;
	}

	public static List<List<Integer>> generate(int numRows) {
		//numRows is the number of rows needed
		// Need to return a list of list 
		// Beginning and ending of list is 1 
		// retrieve the previous list add adjacent numbers and put it in the middle of next row
		List<List<Integer>> ret = new LinkedList<List<Integer>>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		if(numRows == 0){
			return ret;
		}
		if(numRows == 1){
			list1.add(1);
			ret.add(list1);
			return ret;
		}
		list1.add(1);
		ret.add(list1);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(1);
		ret.add(list2);
		for(int i=2;i<numRows;i++){
			LinkedList<Integer> list4 = new LinkedList<Integer>();
			List<Integer> list3 = ret.get(i-1);
			for(int j=0;j<list3.size()-1;j++){
				int sum = list3.get(j) + list3.get(j+1);
				list4.add(sum);
			}
			list4.addFirst(Integer.valueOf(1));
			list4.addLast(Integer.valueOf(1));
			ret.add(list4);
		}
		return ret;
	}
}

