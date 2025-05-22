package javaEight;

import java.util.function.Supplier;

public class SupplierFuntionalInterface {
	public static void main(String[] args) {
		Supplier<Integer> randomValue=()->(int)(Math.random()*100);
		System.out.println(randomValue.get());
		
		Supplier<Double> randomValue1 = () -> Math.random();
		System.out.println(randomValue1.get());
	}

}
