package oopsThree;

public class UseConstructorOverloading {
	public static void main(String[] args) {
		ConstructorOverloading c=new ConstructorOverloading(10,"kolanji");
		System.out.println(c.name+" "+c.num);
		ConstructorOverloading d=new ConstructorOverloading(20);
		System.out.println(d.num);
		ConstructorOverloading e=new ConstructorOverloading("luffy");
		System.out.println(e.name);
		ConstructorOverloading f=new ConstructorOverloading();
		System.out.println(f.name);
	}

}
class ConstructorOverloading {
	int num;
	String name;
	public ConstructorOverloading(int a,String b) {
		num=a;
		name=b;
	}
	public ConstructorOverloading(int a) {
		int b=20;
		int c=a*b;
		num=c;
	}
	public ConstructorOverloading(String a) {
		name=a;
		
	}
	public ConstructorOverloading() {
		name="zoro";
	}
}