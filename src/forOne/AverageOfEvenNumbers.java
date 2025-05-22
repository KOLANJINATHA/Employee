package forOne;

public class AverageOfEvenNumbers {
	public static void main(String[]args) {
		int sum=0;
		int count=0;
		for(int i=1;i<=5;i++) {
			if(i%2==0) {
				sum=sum+i;
				count=count+1;
			}
		}
		System.out.println(sum/count);
	}

}
