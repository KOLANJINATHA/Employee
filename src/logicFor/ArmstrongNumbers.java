package logicFor;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		int num=153;
		int sum=0;
		while(num>0) {
			int a=num%10;
			sum=sum+(a*a*a);
			num=num/10;
		}
		System.out.println(sum);
	}

}
