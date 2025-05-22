package javaEight;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		System.out.println(ab.rateOfInterest(50));
		System.out.println(ab.accnum(123456768912l));
		System.out.println(ab.branch());
		System.out.println(Bank.ifsc("isis"));
		
	}

}
interface Bank {
	public int rateOfInterest(int amt);
	public long accnum(long a);
	public default String branch() {
		return "Peungudi";
	}
	public static String ifsc (String a) {
		return a;
	}
	
}
class AxisBank implements Bank {
	public int rateOfInterest(int x) {
		return x*5/100;
	}
	public long accnum (long a) {
		return a;
	}
	public String branch() {
		return "kandhanchavadi";
	}
}