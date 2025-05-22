package daytwo;

public class SampleProgramTwo {
	public static void main(String[]args) {
		String word = "kolanji";
		boolean res1=word.contains("kol");
		boolean res2=word.startsWith("ok");
		boolean res3=word.endsWith("ji");
		boolean res4=word.equals("kolanji");
		boolean res5=word.equalsIgnoreCase("Kolanji");
		System.out.println(res1+" "+res2+" "+res3+" "+res4+" "+res5);
	}

}
