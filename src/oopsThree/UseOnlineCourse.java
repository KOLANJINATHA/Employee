package oopsThree;

public class UseOnlineCourse {
	public static void main(String[] args) {
		OnlineCourse o=new OnlineCourse();
		System.out.println(o.showUrl("gdug3655gdgsf"));
		o.showCourseFees("java");
		o.showCourseId(21);
		o.showCoursename("python");
		o.showTrainer("hariharan");
		o.showCourseFees(30000);
	}
                    
}
interface Course {
	public void showCourseId(int id);
	public void showCoursename(String a);
	public void showTrainer(String a);
	public void showCourseFees(int a);
}
class OnlineCourse implements Course {
	public String showUrl(String link) {
		return link;
	}
	public void showCourseFees(String courseName) {
		if(courseName.equals("java")) {
			System.out.println("Course fees is 20000 ");
		}
		else if(courseName.equals("Ethical Hacking")) {
			System.out.println("Course fees is 8000");
		}
		else if(courseName.equals("python")) {
			System.out.println("Course fees is 15000");
		}
		else if(courseName.equals("SQL")) {
			System.out.println("Course fees is 100000");
		}
		else {
			System.out.println("Invalid input");
		}
	}
	public void showCourseId(int a) {
		System.out.println(a);
	}
	public void showCoursename(String a) {
		System.out.println(a);
	}
	public void showCourseFees(int a) {
		System.out.println(a);
	}
	public void showTrainer(String a) {
		System.out.println(a);
	}
}