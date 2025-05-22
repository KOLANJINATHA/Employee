package javaEight;

public class MyClass {
	public int getMax(int[] n) {
		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= max) {
				max = n[i];
			}
		}
		return max;
	}

	public void getMax(String[] a) {
			String max=a[0];
			for(String x:a) {
				if(x.length()>max.length()) {
					max=x;
				}
			}
			System.out.println( max);
		}
}
