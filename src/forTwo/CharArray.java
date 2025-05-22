package forTwo;

public class CharArray {
	public static void main(String[] args) {
		String name="kolanji";
		char[]word=name.toCharArray();
		for(int i=word.length-1;i>=0;i--) {
			System.out.println(word[i]);
		}
	}

}
