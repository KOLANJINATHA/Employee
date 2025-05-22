package javaEight;

public class StaticProgram {
	static int a=10;
	public StaticProgram() {
		a++;
	}
	public static String msg() {
		return "Hi";
	}
	public static void main(String [] args) {
		StaticProgram s1=new StaticProgram();
		StaticProgram s2=new StaticProgram();
		StaticProgram s3=new StaticProgram();
		System.out.println(StaticProgram.msg());
				
	}
	static {
		System.out.println("This is Static Block");
	}

}
