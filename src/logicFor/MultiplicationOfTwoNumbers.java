package logicFor;

public class MultiplicationOfTwoNumbers {
	public static void main(String[] args) {
		int val1=2;
		int val2=6;
		int count=0;
		for(int i=1;i<=val2;i++) {
			for(int j=1;j<=val1;j++) {
				count++;
			}
		}
		System.out.println(count);
	}

}
