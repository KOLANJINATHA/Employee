package collectionOne;
import java.util.ArrayList;
public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.id=7;
		c1.name="audi";
		c1.setPrice(100000);
		c1.color="red";
		c1.warrenty=false;
		c1.model="A5";
		Car c2=new Car();
		c2.id=2;
		c2.name="BMW";
		c2.setPrice(200000);
		c2.color="blue";
		c2.warrenty=true;
		c2.model="M2";
		Car c3=new Car();
		c3.id=9;
		c3.name="mustang";
		c3.setPrice(300000);
		c3.color="black";
		c3.warrenty=true;
		c3.model="S6";
		ArrayList<Car> cs=new ArrayList<>();
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		cs.forEach(x->
		{
			if(x.warrenty==true) {
				System.out.println(x);
			}
		});
		System.out.println(" ");
		for(Car x:cs) {
			if(x.warrenty==true) {
				System.out.println(x);
			}
		}
		System.out.println(" ");
		
		for(int i=0;i<cs.size();i++) {
			if(cs.get(i).warrenty==false) {
				System.out.println(cs.get(i));
			}
		}
		System.out.println("==================================");
		
		cs.forEach(x->
		{
			if(x.price>100000) {
				System.out.println(x);
			}
		});
		System.out.println(" ");
		
		for(Car x: cs) {
			if(x.price<=100000) {
				System.out.println(x);
			}
		}
		System.out.println(" ");
		
		for(int i=0;i<cs.size();i++) {
			if(cs.get(i).price>200000) {
				System.out.println(cs.get(i));
			}
				
		}
		System.out.println("======================================");
		Car maxPrice=cs.get(0);
		for(int i=0;i<cs.size();i++) {
			if(cs.get(i).price>=maxPrice.price) {
				maxPrice=cs.get(i);
			}
		}
		System.out.println(maxPrice);
		System.out.println("=======================================");
		
		String maxLength=cs.get(0).name;
		for(Car x:cs) {
			if(x.name.length()>=maxLength.length()) {
				maxLength=x.name;
			}
		}
		System.out.println(maxLength.charAt(maxLength.length()-1));
		System.out.println("========================================");
		
		for(int i=0;i<cs.size();i++) {
			if(cs.get(i).id>5) {
				cs.get(i).setPrice(cs.get(i).getPrice()+(cs.get(i).getPrice()*10/100));
				//System.out.println(cs.get(i));
			}
		}
		System.out.println(cs);
		System.out.println(" ");
		for(Car x:cs) {
			if(x.id>5) {
				x.setPrice(x.getPrice()+(x.getPrice()*10/100));
				System.out.println(x);
			}
		}
		//System.out.println(cs);
	}

}
class Car {
	int id;
	String name;
	int price;
	String color;
	boolean warrenty;
	String model;
	public void setPrice(int a) {
		price=a;
	}
	public int getPrice() {
		return price;
	}
//	public Car(int a,String b,int c,String d,boolean e,String f) {
//		id=a;
//		name=b;
//		price=c;
//		color=d;
//		warrenty=e;
//		model=f;
//	}
	public String toString () {
		return id+" "+name+" "+price+" "+color+" "+warrenty+" "+model;
	}
}