package oopsTwo;

public class UseHuman {
	public static void main(String[] args) {
		Human h1=new Human();
		h1.name="jiraya";
		h1.age=45;
		h1.gender="male";
		h1.color="color";
		Teacher t1=new Teacher();
		t1.name="jiraya";
		t1.age=45;
		t1.gender="male";
		t1.color="white";
		t1.id=7;
		t1.experience=20;
		t1.salary=2000000;
		t1.subject="ninja";
		System.out.println(t1.name);
	}

}
class Human {
	String name;
	int age;
	String gender;
	String color;
}
class Teacher extends Human {
	int id;
	float experience;
	int salary;
	String subject;
	
}