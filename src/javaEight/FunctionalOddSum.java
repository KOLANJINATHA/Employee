package javaEight;

public class FunctionalOddSum {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		
		OddArray add=x->{
			int count=0;
			for(int i=0;i<x.length;i++) {
				
				if(x[i]%2!=0) {
					count=count+x[i];
				}
			}
			return count;
		};
		System.out.println(add.sum(a));
	}

}
@FunctionalInterface
interface OddArray {
	public int sum(int[] a);
}