package conditions;

public class PositiveNegative {
	public static void main(String[]args) {
		int a=0;
		if(a<0) {
			System.out.println("negative");
		}
		else if(a>0) {
			System.out.println("positive");
		}
		else if(a==0) {
			System.out.println("neutral");
		}
	}

}
