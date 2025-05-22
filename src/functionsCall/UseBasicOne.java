package functionsCall;

public class UseBasicOne {
	public static void main(String[] args) {
		BasicOne basic=new BasicOne();
		System.out.println(basic.add(10,15));
		System.out.println(basic.sub());
		basic.multi(10,20);
		basic.div();
	}

}
