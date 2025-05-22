package conditions;

public class Age {
	public static void main(String[] args) {
		int age=20;
		if((age>0)&&(age<=10)) {
			System.out.println("Kid");
		}
		else if((age>13)&&(age<=20)){
			System.out.println("Adult");
		}
	}

}
