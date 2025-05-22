package conditions;

public class FourMaximum {
	public static void main(String[] args) {
		int a=10;
		int b=11;
		int c=15;
		int d=20;
		if((a>b)&&(a>c)&&(a>d)) {
			System.out.println("a is maximum");
		}
		else if((b>a)&&(b>c)&&(b>d)) {
			System.out.println("b is maximum");
		}
		else if((c>a)&&(c>b)&&(c>d)) {
			System.out.println("c is maixmum");
		}
		else {
			System.out.println("d is maximum");
		}
			
	}

}
