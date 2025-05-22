package daytwo;

public class TaskThree {
	public static void main(String[]args) {
		String word="welcome,to,my,little,world";
		String[] values=word.split(",");
		String word1=values[2].concat(values[4]).toUpperCase();
		System.out.println(word1);
	    System.out.println(values.length);
	    String res2 = values[4].substring(1, 4);
	    System.out.println(res2);
	    char lastLet=values[3].charAt(values[3].length()-1);
	    System.out.println(lastLet);
	    int len=values[2].length();
	    System.out.println(len);
	    
	    
	}

}
