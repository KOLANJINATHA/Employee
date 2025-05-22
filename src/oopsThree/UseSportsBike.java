package oopsThree;

public class UseSportsBike {
	public static void main(String[] args) {
		SportsBike s = new SportsBike();
		System.out.println(s.getName("RX100"));
		System.out.println(s.getColor("black"));
		System.out.println(s.getPrice(100000));
	}

}
abstract class Bike {
	public String getName(String name) {
		return name;
	}
	public abstract String getColor(String color);
}
class SportsBike extends Bike {
	public String getColor(String a) {
		return a;
	}
	public int getPrice(int a) {
		return a;
	}
}
