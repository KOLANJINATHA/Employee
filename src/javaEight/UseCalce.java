package javaEight;

public class UseCalce {
	public static void main(String[] args) {
		Calculator add=(x,y)-> x+y;
		System.out.println(add.math(10, 5));
		
		Calculator sub=(x,y)->{
			if(x>y) {
				return x;
			}
			else {
				return y;
			}
		};
		System.out.println(sub.math(10,30));
		
	}

}

@FunctionalInterface
interface Calculator{
	public int math(int a,int b);
}