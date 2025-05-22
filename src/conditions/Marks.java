package conditions;

public class Marks {
	public static void main(String[] args) {
		int a=90;
		if((a>=90)&&(a<=100)){
			System.out.println("first mark");
		}
		else if((a<90)&&(a>75)) {
			System.out.println("second mark");
		}
		else if(a<50) {
			System.out.println("fail");
		}
		
	}

}
