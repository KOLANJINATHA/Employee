package exceptionHandling;

public class FirstArithmaticException {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException as) {
			//System.out.println(as.getMessage());
			as.printStackTrace();
			
		}
		finally {
			System.out.println("DB is closed");
		}
		System.out.println("End");
		
	}

}
