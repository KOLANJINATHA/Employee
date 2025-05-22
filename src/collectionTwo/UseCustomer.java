package collectionTwo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class UseCustomer {
	public static void main(String[] args) {
		Customer c1=new Customer(21,"ambani",'M',50,90000,true);
		Customer c2=new Customer(22,"adhani",'M',45,80000,true);
		Customer c3=new Customer(23,"murmu",'F',53,70000,true);
		Customer c4=new Customer(24,"mallaiya",'M',50,60000,false);
		Customer c5=new Customer(25,"mamtha",'f',50,50000,false);
		Customer c6=new Customer(26,"mukesh",'M',50,40000,false);
		HashMap<Integer,Customer> cs=new HashMap<>();
		cs.put(c1.getId(), c1);
		cs.put(c2.getId(), c2);
		cs.put(c3.getId(), c3);
		cs.put(c4.getId(), c4);
		cs.put(c5.getId(), c5);
		cs.put(c6.getId(), c6);
		for(Customer x:cs.values()) {
			if(x.getPurchasedAmount()>40000 && x.getPurchasedAmount()<80000) {
				System.out.println(x);
			}
		}
		System.out.println(" ");
				
		Customer min=c1;
		for(Customer x:cs.values()) {
			if(x.getAge()<min.getAge()) {
				min=x;
			}
		}
		System.out.println(min);
		System.out.println(" ");
		
		cs.forEach((x,y)->
		{
			if(cs.get(x).getIsRegularCustomer()==true) {
				System.out.println(cs.get(x));
			}
		});
		System.out.println(" ");
		//System.out.println(cs.get(c1.getId()));
		Iterator<Customer> itr=cs.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getIsRegularCustomer()!=true) {
				itr.remove();
			}
		}
		cs.forEach((x,y)->System.out.println(x+" "+y));
		List<Customer> cus = Arrays.asList(c1,c2,c3,c4,c5,c6);
		
		List<Customer> bon = cus.stream().filter(x->x.getPurchasedAmount()<50000).map(y->{
			y.setPurchasedAmount(y.getPurchasedAmount()+(y.getPurchasedAmount()*5)/100);
			return y;
		}).collect(Collectors.toList());
		
		bon.forEach(x->System.out.println(x));
	
		
		
		
	}

}
class Customer{
	private int id;
	private String name;
	private char gender;
	private int age;
	private int purchasedAmount;
	private boolean isRegularCustomer;
	public void setId(int a) {
		id=a;
	}
	public int getId() {
		return id;
	}
	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
	public void setGender(char a) {
		gender=a;
	}
	public char getGender() {
		return gender;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
	public void setPurchasedAmount(int a) {
		purchasedAmount=a;
	}
	public int getPurchasedAmount() {
		return purchasedAmount;
	}
	public void setIsRegularCustomer(boolean a) {
		isRegularCustomer=a;
	}
	public boolean getIsRegularCustomer() {
		return isRegularCustomer;
	}
	public Customer(int a,String b,char c,int d,int e,boolean f) {
		id=a;
		name=b;
		gender=c;
		age=d;
		purchasedAmount=e;
		isRegularCustomer=f;
	}
	public String toString() {
		return id+" "+name+" "+gender+" "+age+" "+purchasedAmount+" "+isRegularCustomer;
	}
}