package exceptionHandling;

public class AgeEligibility {
	public static void main(String[] args)throws AgeException {
		System.out.println("Start");
		try {
		int age = 15;
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new AgeException("Not Eligible"); 
			
		}
		}
		catch(AgeException ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("End");
	}

}