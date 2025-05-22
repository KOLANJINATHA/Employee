package oopsOne;

public class UseFan {
	public static void main(String[] args) {
		Coil coil1=new Coil("kolanji",true,2000);
		coil1.setBrand("usha");
		coil1.setPrice(1000);
		coil1.setIsCopper(true);
	
		Fan fan1=new Fan("usha",5000,true,coil1);
		fan1.setBrand("raja");
		fan1.setIsCeilling(false);
		fan1.setPrice(20000);
		fan1.setCoil(coil1);
		System.out.println(fan1.getBrand()+" "+fan1.getCoil().getBrand()+" "+fan1.getCoil().getPrice());
		System.out.println(fan1);
	}

}
class Fan {
	private String brand;
	private int price;
	private boolean isCeilling;
	private Coil coil;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setIsCeilling(boolean a) {
		isCeilling=a;
	}
	public boolean getIsCeilling() {
		return isCeilling;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setCoil(Coil coil) {
		this.coil=coil;
	}
	public Coil getCoil() {
		return coil;
	}
	public Fan (String a,int b,boolean c,Coil coil) {
		brand=a;
		price=b;
		isCeilling=c;
		this.coil=coil;
	}
	public String toString() {
		return brand+" "+price+" "+isCeilling+" "+coil;
	}
}


class Coil {
	private String brand;
	private boolean isCopper;
	private int price;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setIsCopper(boolean iscopper) {
		isCopper=iscopper;
	}
	public boolean getIsCopper() {
		return isCopper;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public Coil(String brand,boolean isCopper,int price) {
		this.brand=brand;
		this.isCopper=isCopper;
		this.price=price;
	}
	public String toString() {
		return brand+" "+isCopper+" "+price;
	}
}
