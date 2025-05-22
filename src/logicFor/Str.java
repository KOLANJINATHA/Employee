package logicFor;

import java.util.Arrays;

public class Str {
	public static void main(String[] args) {
		String s = "amslm";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		for(char x: ch) {
			System.out.println(x);
		}
	}
}
