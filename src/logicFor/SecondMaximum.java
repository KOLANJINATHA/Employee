package logicFor;

public class SecondMaximum {
	public static void main(String[] args) {
		int[] a= {1,4,23,45,44,45};
		int max1=a[0];
		int max2=a[1];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
				}
			if(a[i]!=max1) {
				max2=a[i];
			}
		}
		System.out.println(max2);
		System.out.println(max1);
	}

}

