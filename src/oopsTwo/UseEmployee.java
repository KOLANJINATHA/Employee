package oopsTwo;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.age=25;
		e1.degree="BE";
		e1.experience=3;
		
		Engineer a1= new Engineer();
		a1.age=25;
		a1.degree="BE";
		a1.experience=3;
		a1.spceality="software";
		a1.from="chennai";
		
		
		SoftwareEngineer sf1=new SoftwareEngineer();
		sf1.age=25;
		sf1.degree="BE";
		sf1.experience=3;
		sf1.spceality="software";
		sf1.from="chennai";
		sf1.salary=45000;
		sf1.isgoodcommunicator=true;
		System.out.println(sf1.age+" "+sf1.degree+" "+sf1.experience+" "+sf1.spceality+" "+sf1.from+" "+sf1.salary+" "+sf1.isgoodcommunicator);
	}

}
class Employee {
	int age;
	String degree;
	int experience;
}
class Engineer extends Employee {
	String spceality;
	String from;
}
class SoftwareEngineer extends Engineer {
	int salary;
	boolean isgoodcommunicator;

	
}
