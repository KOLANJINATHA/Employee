package oopsTwo;

public class UseCalci {
	public static void main(String[] args) {
		Calci c=new Calci();
		c.getAdd();
		System.out.println(c.getAdd(2,4));
	}

}
class Calci {
	public int getAdd(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public int getAdd(int a) {
		return a;
	}
	public void getAdd() {
		System.out.println("kolanji");
	}
	public String getAdd(int[] a) {
		int total=0;
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
		}
		return "total= "+total;
	}
}