package exceptionHandling;

public class PasswordException {
	public static void main(String[] args)throws Password  {
		System.out.println("Start");
		try {
			String pass="kolanjinathan";
			if(pass.length()==8) {
				System.out.println("Access Granted");
			}
			else {
				throw new Password("Access Denied");
			}
		}
		catch(Password p) {
			System.out.println("Entered Password is Less Than Or Greater Than 8");
		}
		System.out.println("End");
	}

}
class Password extends Exception{
	public Password (String pass) {
		super(pass);
	}
}
