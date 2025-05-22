package oopsTwo;

public class UseFruit {
	public static void main(String[] args) {
		Apple a1=new Apple();
		a1.name="apple";
		a1.taste="sweet";
		a1.isHybrid=false;
		a1.color="red";
		a1.perkg=100;
		a1.isFreash=true;
		
		Orange o1=new Orange();
		o1.name="orange";
		o1.taste="sour";
		o1.isHybrid=true;
		o1.color="orange";
		o1.perkg=60;
		o1.isFreash=true;
		
		Mango m1=new Mango();
		m1.name="mango";
		m1.taste="sweet";
		m1.isHybrid=false;
		m1.color="yellow";
		m1.perkg=80;
		m1.isFreash=true;
		System.out.println(m1.name+" "+o1.isFreash);
	}

}
class Fruit {
	String name;
	String taste;
	boolean isHybrid;
}
class Apple extends Fruit {
	String color;
	int perkg;
	boolean isFreash;
}
class Orange extends Fruit {
	String color;
	int perkg;
	boolean isFreash;
}
class Mango extends Fruit {
	String color;
	int perkg;
	boolean isFreash;

}