package collectionOne;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("luffy",18,1,3,90000);
		Employee e2=new Employee("zoro",20,2,5,80000);
		Employee e3=new Employee("sanji",21,3,2,700000);
		Employee e4=new Employee("usopp",22,4,3,60000);
		Employee e5=new Employee("chopper",24,5,2,500000);
		
		ArrayList<Employee> es=new ArrayList<>();
		es.add(e1);
		es.add(e2);
		es.add(e3);
		es.add(e4);
		es.add(e5);
		System.out.println(es.get(0).getName());
		System.out.println(" ");
		System.out.println(es);
		System.out.println(" ");
		es.forEach(x->System.out.println(x));
		System.out.println(" ");
		
		
		Employee max=es.get(0);
		for(Employee x:es) {
			if(x.getAge()>=max.getAge()) {
				max=x;
			}
			
		}
		System.out.println(max);
		System.out.println(" ");
		
		
		Employee max1=es.get(0);
		for(int i=0;i<es.size();i++) {
			if(es.get(i).getName().length()>=max.getName().length()) {
				max1=es.get(i);
			}
		}
		System.out.println(max1);
		System.out.println(" ");
		
		es.forEach(x->
		{
			if(x.getExperience()>2) {
				x.setSalary(x.getSalary()+x.getSalary()*10/10);
				
			}
		});
		System.out.println(es);
		System.out.println(" ");
		
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Employee> objectDetials = new ArrayList<>();
		es.forEach(x->
		{
			if(x.getExperience()>2) {
				names.add(x.getName());
			}
		});
		System.out.println(names);
		System.out.println(" ");
		es.forEach(x->
		{
			if(x.getExperience()>2) {
				objectDetials.add(x);
			}
		});
		System.out.println(objectDetials);
		
		
	}

}
class Employee {
	private String name;
	private int age;
	private int id;
	private int experience;
	private int salary;
	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
	public void setId(int a) {
		id=a;
	}
	public int getId() {
		return id;
	}
	public void setExperience(int a) {
		experience=a;
	}
	public int getExperience() {
		return experience;
	}
	public void setSalary(int a) {
		salary=a;
	}
	public int getSalary() {
		return salary;
	}
	public Employee(String a,int b,int c,int d,int e) {
		name=a;
		age=b;
		id=c;
		experience=d;
		salary=e;
	}
	public String toString() {
		return name+" "+age+" "+id+" "+experience+" "+salary;
	}
}