package oopsThree;

public class NumberPlate {
	public static void main(String[] args) {
		TamilNadu t=new TamilNadu();
		System.out.println(t.displayFrontStyle("italian")+" "+t.displayCount(24)+" "+t.displayNumberPlateColor("private")+" "+t.displayStateCode("TN"));
	}

}
 interface NumberPlateRules{
	public String displayForntStyle(String a);
	public int displayCount(int a);
	public String displayNumberPlateColor(String a);
	public String displayStateCode(String a);
}
abstract class CentralGovermentRules {
	public String displayFrontStyle(String a) {
		return a;
	}
	public int displayCount(int a) {
		return a;
	}
}
class TamilNadu extends CentralGovermentRules {
	public String displayNumberPlateColor(String a) {
		if(a.equals("Public Vehicle")){
			return "Black with yellow";
		}
		else {
			return "Green with White";
		}
		
	}
	public String displayStateCode(String a) {
		return a;
	}
}