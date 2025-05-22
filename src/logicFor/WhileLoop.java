package logicFor;

public class WhileLoop {
	public static void main(String[] args) {
		int num=761;
		int count=0;
		while(num>0) {
			count=count+1;
			num=num/10;
			
		}
		System.out.println(count);
	}

}
