package oopsThree;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.getName("AUDI"));
		System.out.println(c.getcc(1200));
		System.out.println(c.getcolor("black"));
		Vehicle v=new Car();
		System.out.println(v.getName("BMW"));
		System.out.println(v.getcc(13000));
	}

}
interface Vehicle {
	public String getName(String name);
	public int getcc (int cc);
}
class Car implements Vehicle {
	public String getName(String name) {
		return name;
	}
	public int getcc(int cc) {
		return cc;
	}
	public String getcolor(String color) {
		return color;
	}
}
