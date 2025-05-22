package logicFor;

public class CountForFloat {
	public static void main(String[] args) {
		float a=12.62f;
		int count=0;
		while(a>0) {
			count=count+1;
			a=a/10;
		}
		System.out.println(count);
	}

}
