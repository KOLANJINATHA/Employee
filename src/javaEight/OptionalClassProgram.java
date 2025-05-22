package javaEight;

import java.util.Optional;

public class OptionalClassProgram {
	public static void main(String[] args) {
		Optional <String> op=Optional.ofNullable("Hi");
		System.out.println(op.isPresent());
		
		if(op.isEmpty()) {
			System.out.println("Empty");
		}
		else {
			System.out.println(op);
		}
		
		if(op.isPresent()) {
			System.out.println(op);
		}
		else {
			System.out.println("Empty");
		}
		
		System.out.println(op.orElse("String Empty"));
	}

}
