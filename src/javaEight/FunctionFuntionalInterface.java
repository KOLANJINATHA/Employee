package javaEight;

import java.util.function.Function;

public class FunctionFuntionalInterface {
	public static void main(String[] args) {
		Function<String,Integer> str=x->x.length();
		System.out.println(str.apply("kolanji"));
	}

}
