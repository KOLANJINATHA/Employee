package oopsOne;

public class Cars {
	public static void main(String[]args) {
		Engine e=new Engine();
		e.brand="ford";
		e.price=20000;
		e.cc=2000;
		Car c=new Car();
		c.brand="audi";
		c.modelyear=2020;
		c.engine=e;
		System.out.println(c.brand+" "+c.engine.brand);
		System.out.println(e.brand);
	}
}	
	
class Car {
		String brand;
		int price;
		int modelyear;
		Engine engine;
		
	}
	
class Engine {
		String brand;
		int price;
		int cc;
		String prome;
		
	}
	


