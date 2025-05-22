package forTwo;

public class StringArray {
	public static void main(String[] args) {
		String[] name= {"aaa","ff","jjjjjj","iiii"};
		String max=name[0];
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>=max.length()) {
				max=name[i];
			}
		}
		System.out.println(max);
	}

}
