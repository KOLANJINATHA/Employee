package exceptionHandling;

public class ThirdNumberFormatException {
	public static void main(String[] args) {
		System.out.println("Stard");
		try {
			String value="10a";
			int num=Integer.parseInt(value);
			System.out.println(num);
		}
		catch(NumberFormatException nf) {
			nf.printStackTrace();
		}
		finally {
			System.out.println("DB is closed");
		}
		System.out.println("End");
	}

}
