package forTwo;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[]a= {"hi","hello","bye"};
		for(String x :a) {
		System.out.println(x);
	}
		for(String x:a) {
			if(x.length()>=3) {
				System.out.println(x);
			}
		}
	}

}
