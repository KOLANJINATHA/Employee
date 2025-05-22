package forTwo;

public class MaxInTheArray {
	public static void main(String[] args) {
		int[]a= {5,10,15,5,3};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
