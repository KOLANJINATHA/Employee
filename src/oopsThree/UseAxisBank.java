package oopsThree;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.rateOfInterest(10);
	}

}

interface Bank {
	public void rateOfInterest (int a);
}
class AxisBank implements Bank {
	public void rateOfInterest(int a) {
		System.out.println(a);
	}
}