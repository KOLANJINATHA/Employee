package exceptionHandling;

public class SecondNullPointerException {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
		String name=null;
		String capital=name.toUpperCase();
		System.out.println(capital);
		}
		catch(NullPointerException ne) {
			System.err.println("Error Occured");
			ne.printStackTrace();
		}
		finally {
			System.out.println("DB is colsed");
		}
		System.out.println("End");
		
	}

}
