package daytwo;

public class SampleProgramThree {
	public static void main(String[]args) {
		String word="welcome";
		char res1=word.charAt(4);
		char res2=word.charAt(0);
		char res3=word.charAt(word.length()-1);
		int res4=word.indexOf('o');
		String res6=word.substring(2,5);
		String res5=word.substring(0);
		//char res7= word.charAt(8);
		int res8=word.indexOf('p');
		//String res9=word.substring(0,9);
		System.out.println(res8);
		
		System.out.println(res1+" "+res2+" "+res3+" "+res4+" "+res5+" "+res6);
		
	}

}
