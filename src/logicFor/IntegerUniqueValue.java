package logicFor;

public class IntegerUniqueValue {
	public static void main(String[] args) {
		int[] a= {10,20,15,10,15,33,16};
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='#';
				}
			}
			if(count>=1&&a[i]!='#') {
				System.out.println(a[i]+" "+count);
			}
		}
	}

}
