package exceptionHandling;

public class SixthMultiCatchProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String[] names= {"sun","star","earth"};
			System.out.println(names[2].charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException  ab) {
			ab.printStackTrace();
		}
		catch(IndexOutOfBoundsException ib) {
			ib.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("DB is closed");
		}
		System.out.println("End");
	}

}
