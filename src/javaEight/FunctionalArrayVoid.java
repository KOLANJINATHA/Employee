package javaEight;

public class FunctionalArrayVoid {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		Numbers max=(x)->{
			int max1=x[0];
			for(int i=0;i<x.length;i++) {
				if(x[i]>=max1) {
					max1=x[i];
				}
			}
			System.out.println(max1);
			
		};
		max.maximum(a);
	}

}
@FunctionalInterface
interface Numbers {
	public void maximum(int[] a);
}
