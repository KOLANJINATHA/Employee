package logicFor;

public class FirstRepeatedCharacter {
	public static void main(String[] args) {
		String word="mutiplication";
		char[] words=word.toCharArray();
		String s="";
		int count=0;
		for(int i=0;i<word.length();i++) {
			for(int j=i+1;j<word.length();j++) {
				if(words[i]==words[j]) {
					
					System.out.println(words[i]);
					count++;
					
				}
				if(count==1)
					break;
			}
		}
		System.out.println(s);
		
	}

}
