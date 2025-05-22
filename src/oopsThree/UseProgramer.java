package oopsThree;

public class UseProgramer {
	public static void main(String[] args) {
		Programer p=new Programer();
		p.salaryPerHour=1000;
		p.workingHour=8;
		System.out.println(p.salaryPerDay());
		System.out.println(p.getWork("Hacker"));
	}

}

abstract class Employee1 {
	String name;
	int id;
	int salaryPerHour;
	int workingHour;
	String job;
	public abstract String getWork(String job);
	
}
class Programer extends Employee1 {
	public int salaryPerDay() {
		int a=salaryPerHour;
		int b=workingHour;
		return a*b;
	}
	public String getWork(String a) {
		return a;
	}
}
