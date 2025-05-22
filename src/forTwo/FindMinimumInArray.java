package forTwo;

public class FindMinimumInArray {
	public static void main(String[] args) {
		int[]a= {100,21,31,30,51,20};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
