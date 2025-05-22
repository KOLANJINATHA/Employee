package functionsCall;

public class Colleage {
	String name;
	String location;
	char grade;
	int fees;
	public void loc(Colleage[]a ) {
		for(int i=0;i<a.length;i++) {
			if(a[i].location.equals("chennai")) {
				System.out.println(a[i].name+" "+a[i].location+" "+a[i].grade+" "+a[i].fees);
				
			}
		}
	}
	public String minPrice(Colleage[] a) {
		Colleage min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].fees<min.fees) {
				min=a[i];
			}
		}
		return min.name+" "+ min.location+" "+ min.grade+" "+min.fees;
	}
	public void discount(Colleage[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i].grade=='A') {
				int fee=a[i].fees*5/100;
				int newfees=a[i].fees-fee;
				
				System.out.println(a[i].name+" "+a[i].location+" "+newfees+" "+a[i].grade);
			}
		}
	}
	public void min(Colleage[]a) {
		Colleage min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].fees<min.fees) {
				min=a[i];
			System.out.println(min.name+" "+min.fees+" "+min.location);
			}
		}
		//return min.name+" "+min.location;
	}

}
