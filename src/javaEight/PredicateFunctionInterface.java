package javaEight;

import java.util.function.Predicate;

public class PredicateFunctionInterface {
	public static void main(String[] args) {
		Predicate<Integer> checkLength=x->x>54;
		System.out.println(checkLength.test(4));
	}

}

