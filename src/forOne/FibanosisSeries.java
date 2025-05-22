package forOne;

public class FibanosisSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int sum=0;
		for(int i=0;i<=10;i++) {
			c=a+b;
			System.out.println(a);
			sum=sum+a;
			a=b;
			b=c;
			//sum=sum+a;
		}
		System.out.println(sum);
	}

}
