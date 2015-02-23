package Stacks;
import java.util.HashSet;


public class GeneratePerm {

	public static void main(String[] args) {
		String name = "aac";
		HashSet<String> permutes = permuteString(name);
		for(String s:permutes)
			System.out.println(s);

	}

	public static HashSet<String> permuteString(String name) {
		HashSet<String> permHolder = new HashSet<String>();
		if(name == null)
			return null;
		else if (name.length() == 0)
		{
			String value ="";
			permHolder.add(value);
			return permHolder;
		}
		char initial = name.charAt(0);
		String remaining = name.substring(1);
		HashSet<String> store = permuteString(remaining);
		for(String s:store){
			for(int i=0;i<=s.length();i++){
				permHolder.add(insert(s,initial,i));
			}
		}

		return permHolder;

	}

	public static String insert(String s, char initial, int i) {
		String begin = s.substring(0, i);
		String end = s.substring(i);
		String result = begin+initial+end;
		return result;
	}

}
