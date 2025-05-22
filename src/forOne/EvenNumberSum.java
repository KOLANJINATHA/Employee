package forOne;

public class EvenNumberSum {
	public static void main(String[]args) {
		int total=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				total=total+i;
			}
			
		}
		System.out.println(total);
	}

}
