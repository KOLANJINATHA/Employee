package forOne;

public class Palindron {
	public static void main(String[]args) {
		String name="kolanjinathan";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equalsIgnoreCase(rev)) {
			System.out.println(name+" is a palindrom");
			}
		else {
			System.out.println(name+" is not a palindrom ");
		}
	}

}
