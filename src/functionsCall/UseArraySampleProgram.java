package functionsCall;

public class UseArraySampleProgram {
	public static void main(String[] args) {
//		String[] a= {"luffy","zoro","akjd"};
//		int[]nums= {10,20,30,40,50};
		int[] b= {1,-1,2,-2,3,-3,4,-4};
		ArraySampleProgram arr=new ArraySampleProgram();
//		System.out.println(arr.findMax(nums));
//		System.out.println(arr.findMin(a));
		arr.negativeNumbers(b);
	}

}
