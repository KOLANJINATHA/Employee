package dayOne;

public class UsedCar {
	public static void main(String[]args) {
		Car car1 = new Car();
		car1.brand = "audi";
		car1.price = 200000;
		car1.isairbag = true;
		car1.taxpercent = 20;
		car1.taxprice = 200000*20/100;
		car1.netprice = car1.price+car1.taxprice;
		Car car2 = new Car();
		car2.brand = "swift";
		car2.price = 400000;
		car2.isairbag = false;
		car2.taxpercent = 30;
		car2.taxprice = car2.price*car2.taxpercent/100;
		car2.netprice = car2.price+car2.taxprice;
		System.out.println(car1.brand+" "+car1.taxprice+" "+car1.netprice);
		System.out.println(car2.brand+" "+car2.taxpercent+" "+car2.taxprice+" "+car2.taxprice);
		
	}

}
