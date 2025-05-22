package logicFor;

public class PalindronInWhileLoop {
	public static void main(String[] args) {
		int num=121;
		int f=num;
		int palindrome=0;
		while(num>0) {
			int a=num%10;
			palindrome=palindrome*10+a;
			num=num/10;
		}
		if(palindrome==f) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
			//System.out.println(palindrome);
	}

}
