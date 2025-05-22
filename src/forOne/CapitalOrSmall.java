package forOne;

public class CapitalOrSmall {
	public static void main(String[] args) {
		String a="aPPlE";
		int count=0;
		for(int i=0;i<=a.length()-1;i++) {
			if(a.charAt(i)>='A'&&(a.charAt(i)<='Z')) {
				count=count+1;
				System.out.println(a.charAt(i));
			}
		}
		System.out.println(count);
	}

}
