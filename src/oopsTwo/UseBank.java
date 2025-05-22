package oopsTwo;

public class UseBank {
	public static void main(String[] args) {
		AxisBank as=new AxisBank();
		System.out.println(as.getInt(10000));
	}

}
class Bank {
	public int getInt (int amount) {
		int rateOfInterest=amount*10/100;
		int netAmount=amount+rateOfInterest;
		return netAmount;
	}
}
class AxisBank extends Bank {
	public int getInt(int a) {
		int rint=a*15/100;
		int neta=a+rint;
		return neta;
	}
}