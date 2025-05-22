package dayThree;

public class CommaSeparated {
	public static void main(String[] args) {
		String []a=args[0].split(",");
		int b=Integer.parseInt(a[0]);
		int c=Integer.parseInt(a[1]);
		int d=Integer.parseInt(a[2]);
		int e=b+c+d;
		System.out.println(e);
	}

}
