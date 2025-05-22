package conditions;

public class Directions {
	public static void main(String[] args) {
		char dir='W';
		switch(dir) {
		case'N':
			System.out.println("North");
			
		case 'W':
			System.out.println("West");
			
		case'S':
			System.out.println("South");
			break;
		case'E':
			System.out.println("East");
		default:
			System.out.println("Invalid Data");
			break;
		}
	}
		

}
