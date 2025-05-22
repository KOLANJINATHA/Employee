package conditions;

public class ArithmaticOperations {
	public static void main(String[] args) {
		int a=10;
		int b=15;
		String c="subraction";
		switch(c) {
		case "addition":
			System.out.println(a+b);
			break;
		case"subraction":
			System.out.println(a-b);
			break;
		case"multiplication":
			System.out.println(a*b);
			break;
		case"division":
			System.out.println(a/b);
			break;
		case"remainder":
			System.out.println(a%b);
		}
	}

}
