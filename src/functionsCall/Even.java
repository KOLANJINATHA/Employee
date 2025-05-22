package functionsCall;

public class Even {
	public String even(int a) {
		if (a % 2 == 0) {
			return "even";

		} else {
			return "odd";
		}
		
	}
	public void Square(int a) {
		System.out.println( a*a);
	}
	public void Cube(int a) {
		System.out.println(a*a*a);
		
	}
	public void table(int a) {
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
	}

}
