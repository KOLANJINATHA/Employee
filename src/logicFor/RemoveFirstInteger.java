package logicFor;

public class RemoveFirstInteger {
	public static void main(String[] args) {
		String words="gdshy123gsh";
		String rev="";
		boolean isDigit=true;
		for(int i=0;i<words.length();i++) {
			char letter=words.charAt(i);
			if(letter>='0'&&letter<='9'&&isDigit) {
				isDigit=false;
				continue;
			}
			rev=letter+rev;
		}
		System.out.println(rev);
	}
}

			