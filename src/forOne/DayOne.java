package forOne;

public class DayOne {
	public static void main(String[]args) {
//		for(int i=1; i<=5;i++) {
//			System.out.println(i);
//		}
		
//		for(int i=0;i<=50;i=i+2) {
//			System.out.println(i);
//		}
		
		
//		for(int i=5;i>=1;i--) {
//			System.out.println(i);
//		}
		
		String name="varun";
		
//		for(int i=0;i<=name.length()-1;i++) {
//			System.out.println(name);
//		}
		
//		for(int i=0;i<=name.length()-1;i++) {
//			System.out.println(name.charAt(i));
//			
//		}
//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
// 		    for(int i=name.length()-1;i>=0;i--) {
// 		    	System.out.println(name.charAt(i));
//		}
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			

		}
		System.out.println(rev);
		
		if(name.equalsIgnoreCase(rev)) {
			System.out.println(name+" is a palindrom");
		}
		else {
			System.out.println(name+" is not a palindrom");
		}
	}

}
