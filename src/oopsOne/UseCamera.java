package oopsOne;

public class UseCamera {
	public static void main(String[] args) {
		Lens lens1=new Lens("sony",1200,20000,2.4f);
		
		Camera camera1=new Camera("sony",2500,10000,lens1);
		System.out.println(camera1);
	}

}
class Camera {
	private String brand;
	private int battery;
	private int price;
	private Lens lens;
	public Camera (String brand,int battery,int price,Lens lens) {
		this.brand=brand;
		this.battery=battery;
		this.price=price;
		this.lens=lens;
	}
	public String toString() {
		return brand+" "+battery+" "+price+" "+lens;
	}
}



class Lens {
	private String brand;
	private int pixels;
	private int price;
	private float apperture;
	public Lens (String brand,int pixels,int price,float apperture) {
		this.brand=brand;
		this.pixels=pixels;
		this.price=price;
		this.apperture=apperture;
	}
	public String toString() {
		return brand+" "+pixels+" "+price+" "+apperture;
	}
	
}