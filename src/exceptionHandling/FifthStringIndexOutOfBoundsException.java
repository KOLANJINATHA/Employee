package exceptionHandling;

public class FifthStringIndexOutOfBoundsException {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String name="kolanji";
			char letter=name.charAt(9);
			System.out.println(letter);
		}
		catch(StringIndexOutOfBoundsException ab) {
			System.out.println("Error Occured");
			ab.printStackTrace();
		}
		finally {
			System.out.println("DB closed");
		}
		System.out.println();
	}

}
