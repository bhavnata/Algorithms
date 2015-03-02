package Strings;

public class ZigZag {

	public static void main(String[] args) {
		String original = "BhavyaAdityaDarlings";
		int nRows = 3;
		String result = convert(original,nRows);
		System.out.println(result);
	}
	public static String convert(String s, int nRows) {
		String result = "";
		String[] rows = new String[nRows];  
		for(int i=0;i<nRows;i++){
			rows[i]="";
		}
		if(nRows == 1){
			return s;
		}
		boolean increment=false;
		for(int i=0,j=0;i<s.length();i++){
			if(j == 0){
				increment = true;
			}
			else if(j == nRows-1){
				increment = false;
			}
			if(increment){
				rows[j]=rows[j]+s.charAt(i) ;
				j++;
			}
			else{
				rows[j]=rows[j]+s.charAt(i);
				j--;
			}
		}
		for(int i=0;i<nRows;i++){
			result = result + rows[i];
		}
		return result;

	}



}
