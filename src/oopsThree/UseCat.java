package oopsThree;

public class UseCat {
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c.sleep(true));
		System.out.println(c.drinking("water"));
		System.out.println(c.sound("meow"));
	}

}
abstract class Animal {
	public boolean sleep(boolean a) {
		return a;
	}
	public String drinking(String a) {
		return a;
	}
	public abstract String sound(String a);
}
class Cat extends Animal {
	public String sound(String a) {
		return a;
	}
}