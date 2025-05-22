package functionsCall;

public class UseColleage {
	public static void main(String[] args) {
		Colleage col1=new Colleage();
		col1.name="gov1";
		col1.location="chennai";
		col1.grade='A';
		col1.fees=20000;
		Colleage col2=new Colleage();
		col2.name="anna";
		col2.location="chennai";
		col2.grade='S';
		col2.fees=30000;
		Colleage col3=new Colleage();
		col3.name="periyar";
		col3.location="cuddalore";
		col3.grade='B';
		col3.fees=50000;
		Colleage col4=new Colleage();
		col4.name="gov2";
		col4.location="trichy";
		col4.grade='A';
		col4.fees=40000;
		Colleage[] cols= {col1,col2,col3,col4};
		Colleage colleage = new Colleage();
		//colleage.loc(cols);
		//System.out.println(colleage.minPrice(cols));
		//colleage.discount(cols);
		colleage.min(cols);
		//System.out.println(colleage.min(cols));
	}

}
