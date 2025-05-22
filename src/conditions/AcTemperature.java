package conditions;

public class AcTemperature {
	public static void main(String[] args) {
		int a=25;
		if((a>=16)&&(a<=20)) {
			System.out.println("very cold weather");
		}
		else if((a>=20)&&(a<=25)) {
			System.out.println("cold weather");
		}
		else if((a>=25)&&(a<=30)) {
			System.out.println("normal weather");
		}
	}

}
