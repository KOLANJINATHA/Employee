package oopsThree;

public class UseConstructorOverridding {

}
class ConstructorOverridding {
	String name;
	int num;
	public ConstructorOverridding(int a) {
		int interest=5;
		int netPrice=a*interest/100;
		num=netPrice;
		
	}
}    
//ConstructorOverridding is not possible in constructor