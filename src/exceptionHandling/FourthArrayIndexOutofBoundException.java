package exceptionHandling;

public class FourthArrayIndexOutofBoundException {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
		int[] nums= {1,2,3,4,5};
		int a=nums[5];
		System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException as) {
			System.out.println("Error Occured");
			as.printStackTrace();
		}
		finally {
			System.out.println("DB close");
		}
		System.out.println("End");
	}

}
