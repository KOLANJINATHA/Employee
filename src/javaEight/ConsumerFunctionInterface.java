package javaEight;

import java.util.function.Consumer;

public class ConsumerFunctionInterface {
	public static void main(String[] args) {
		String name="kolanji";
		Person p=new Person();
		p.setName("Adhrash");
		Consumer<Person> changeName =x->x.setName(name);
		changeName.accept(p);
		System.out.println(p.getName());
		
	
		
	}

}
class Person {
	private String name;
	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
}