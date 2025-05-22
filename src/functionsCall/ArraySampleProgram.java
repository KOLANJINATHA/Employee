package functionsCall;

public class ArraySampleProgram {
	public void findMax(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	public String findMin(String a[]) {
		String min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<min.length()) {
				min=a[i];
			}
		}
		return min;
	}
	public void negativeNumbers(int b[]) {
		for(int i=0;i<b.length;i++) {
			if(b[i]<0) {
				System.out.println(b[i]);
			}
		}
	}

}
