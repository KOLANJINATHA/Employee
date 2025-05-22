package logicFor;

public class AscendingOrder {
	public static void main(String[] args) {
		int[] num= {31,21,24,11,23,44,55};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			//System.out.println(num[i]);
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
