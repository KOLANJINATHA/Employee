package javaEight;

public class UseClass {
	public static void main(String[] args) {
		int[] nums= {5,10,12};
		String[] names= {"kolanji","aadharsh"};
		
		MyClass mc=new MyClass();
		calculator c1=mc::getMax;
		System.out.println(c1.arrMath(nums));
		
		Hightest c2=mc::getMax;
		c2.arrMax(names);
	}

}
@FunctionalInterface
interface calculator {
	public int arrMath(int[] a);
}
@FunctionalInterface
interface Hightest {
	public void arrMax(String[] a);
}
