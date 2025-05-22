package oopsTwo;

public class UseElectronics {
	public static void main(String[] args) {
		Fan f1=new Fan("fan","ceiling",5000,"black",4.2f,true);
		f1.setName("tablefan");
		f1.setModel("table");
		f1.setPrice(2500);
		f1.setColor("blue");
		f1.setRating(5.1f);
		f1.setIsWarrenty(true);
		System.out.println(f1);
	}

}
class Electronics {
	private String name;
	private String model;
	private int price;
	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
	public void setModel(String a) {
		model=a;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(int a) {
		price=a;
	}
	public int getPrice() {
		return price;
	}
	public Electronics (String a,String b,int c) {
		name=a;
		model=b;
		price=c;
	}
	public String toString() {
		return name+" "+model+" "+price;
	}
}
class Fan extends Electronics {
	private String color;
	private float rating;
	private boolean isWarrenty;
	public void setColor(String a) {
		color=a;
	}
	public String getColor() {
		return color;
	}
	public void setRating(float a) {
		rating=a;
	}
	public float getRating() {
		return rating;
	}
	public void setIsWarrenty(boolean a) {
		isWarrenty=a;
	}
	public boolean getIsWarrenty() {
		return isWarrenty;
	}
	public Fan(String name,String model,int price,String d,float e,boolean f) {
		super(name,model,price);
		color=d;
		rating=e;
		isWarrenty=f;
	}
	public String toString() {
		return super.toString()+" "+color+" "+rating+" "+isWarrenty;
	}
}