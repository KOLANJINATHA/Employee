package dayThree;

public class TaskOne {
	public static void main(String[] args) {
		String[]a=args[0].split(",");
		String res1=a[0];
		int res2=Integer.parseInt(a[1]);
		float res3=Float.parseFloat(a[2]);
		String res4=a[3];
		boolean isMale=Boolean.parseBoolean(a[4]);
		long res5=Long.parseLong(a[5]);
		System.out.println(res1+" "+res2+" "+res3+" "+isMale+" "+res5+" "+res4);
	}

}
