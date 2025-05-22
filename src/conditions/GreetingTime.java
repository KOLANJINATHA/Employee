package conditions;

public class GreetingTime {
	public static void main(String[] args) {
		int a=18;
		if ((a>=6)&&(a<=11)) {
			System.out.println("good morning");
		}
		else if((a>=12)&&(a<=17)) {
			System.out.println("good afternoon");
		}
		else if((a>=18)&&(a<=20)) {
			System.out.println("good evening");
		}
		else if((a>=21)&&(a<=24)) {
			System.out.println("good night");
		}
	}

}
