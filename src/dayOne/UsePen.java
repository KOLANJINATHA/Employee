package dayOne;

public class UsePen {
	public static void main(String[]args) {
		Pen pen1 = new Pen();
		pen1.brand = "rorito";
		pen1.price = 10;
		pen1.isrefillable = false;
		Pen pen2 = new Pen();
		pen2.brand = "hero";
		pen2.price = 20;
		pen2.isrefillable = true;
		
	    System.out.println(pen1.brand);
	    System.out.println(pen2.brand+" "+pen1.isrefillable);
	
		
	}

}
