package oopsThree;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t= new Teacher();
		System.out.println(t.showSalary(50000));
		System.out.println(t.showWork("teaching"));
		System.out.println(t.showWorkingSector("oneSoft"));
		Employee e= new Teacher();
		System.out.println(e.showSalary(50000));
		System.out.println(e.showWork("teachings"));
		System.out.println(e.showWorkingSector("oneSoft"));
	}

}
interface Employee {
	public int  showSalary(int a);
	public String showWork(String a);
	public String showWorkingSector(String a);
}
class Teacher implements Employee {
	public int showSalary(int a) {
		return a;
	}
	public String showWork(String a) {
		return a;
	}
	public String showWorkingSector(String a) {
		return a;
	}
}