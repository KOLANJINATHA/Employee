package javaEight;

public class FunctionalArrayReturn {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		Number max=(x)->{
			int max1=x[0];
			for(int i=0;i<x.length;i++) {
				if(x[i]>=max1) {
					max1=x[i];
				}
			}
			return max1;
			
		};
		System.out.println(max.maximum(a));
	}

}

@FunctionalInterface
interface Number {
	public int maximum(int[] b);
}
