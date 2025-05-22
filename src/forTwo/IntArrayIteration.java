package forTwo;

public class IntArrayIteration {
	public static void main(String[] args) {
		int[]num= {10,25,30,40,35};
		int sum=0;
		int sum1=0;
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println();
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		System.out.println();
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
				sum1=sum1+1;
			}
		}
		System.out.println(sum1);
	}
	

}
