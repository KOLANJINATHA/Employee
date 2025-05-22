package oopsOne;

public class UseMobile {
	public static void main(String[] args) {
		Battery b=new Battery();
		b.setBrand("albino");
		b.setCapacity(50000);
		b.setIsTypeC(true);
		b.setDisplay("amoled");
		Mobile m=new Mobile();
		m.setBrand("vivo");
		m.setPrice(20000);
		m.setBattery(b);
		//System.out.println(m.getBrand()+" "+m.getPrice()+" "+m.getBattery().getBrand()+" "+m.getBattery().getIsTypeC());
		System.out.println(m.getBattery().getBrand()+" "+m.getBattery().getDisplay());
	}

}
class Mobile {
	private String brand;
	private int price;
	private Battery battery;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice () {
		return price;
	}
	public void setBattery(Battery battery ) {
		this.battery=battery;
	}
	public Battery getBattery() {
		return battery;
	}
}


class Battery {
	private String brand;
	private int capacity;
	private String display;
	private boolean isTypeC;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setIsTypeC(boolean a) {
		isTypeC=a;
	}
	public boolean getIsTypeC() {
		return isTypeC;
	}
	public void setDisplay(String a) {
		display=a;
	}
	public String getDisplay() {
		return display;
	}
	
}