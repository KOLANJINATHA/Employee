package collectionThree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Kolanji", 24, true, 58.6f);
		Student s2 = new Student(2, "Adharsh", 22, false, 59.2f);
		Student s3 = new Student(3, "Karthi", 28, true, 61.6f);
		Student s4 = new Student(4, "Kesav", 70, true, 88.6f);
		Student s5 = new Student(5, "Sanjay", 99, false, 70.5f);
		Student s6 = new Student(6, "Vijay", 78, false, 80.5f);
		List<Student> stds = Arrays.asList(s1, s2, s3, s4, s5, s6);
		List<Student> above18 = stds.stream().filter(x -> x.getAge() > 50).collect(Collectors.toList());

		above18.forEach(x -> System.out.println(x));
		System.out.println(" ");
		List<String> names = stds.stream().map(x -> x.getName()).collect(Collectors.toList());
		names.forEach(x -> System.out.println(x));

		System.out.println(" ");
		List<String> above19 = stds.stream().filter(x -> x.getAge() > 18).map(x -> x.getName())
				.collect(Collectors.toList());
		System.out.println(above19);
		System.out.println(" ");

		Long isPrimary = stds.stream().filter(x -> x.getPrimary() == false).count();
		System.out.println(isPrimary);
		System.out.println(" ");

		List<String> names1 = stds.stream().map(x -> x.getName()).filter(x -> x.length() > 5)
				.collect(Collectors.toList());
		System.out.println(names1);
		System.out.println(" ");

		// using Set
		Set<Integer> age = stds.stream().map(x -> x.getAge()).collect(Collectors.toSet());
		age.forEach(x -> System.out.println(x));
		System.out.println(" ");

		// Using Map
		Map<Integer, Student> m = stds.stream().collect(Collectors.toMap(x -> x.getId(), y -> y));
		m.forEach((x, y) -> System.out.println(x + " " + y));
		System.out.println(" ");

		// maximum Age
		int maxAge = stds.stream().map(x -> x.getAge()).max(Comparable::compareTo).get();
		System.out.println(maxAge);
		System.out.println(" ");

		// minimum Age
		int minAge = stds.stream().map(x -> x.getAge()).min(Comparable::compareTo).get();
		System.out.println(minAge);
		System.out.println(" ");

		// maximum Object
		Student maxObject = stds.stream().max(Comparator.comparing(Student::getAge)).get();
		System.out.println(maxObject);
		System.out.println(" ");

		// minimum Object
		Student minObject = stds.stream().min(Comparator.comparing(Student::getAge)).get();
		System.out.println(minObject);
		System.out.println(" ");

		// Skip method
		List<Student> skipObject = stds.stream().skip(2).collect(Collectors.toList());
		System.out.println(skipObject);
		System.out.println(" ");

		// limit method
		List<Student> limitObject = stds.stream().limit(1).collect(Collectors.toList());
		System.out.println(limitObject);
		System.out.println(" ");

		// Ascending single field
		List<Integer> sortSingleField = stds.stream().map(x -> x.getAge()).sorted().collect(Collectors.toList());
		System.out.println(sortSingleField);
		System.out.println(" ");

		// Descending single field
		List<String> Descending = stds.stream().map(x -> x.getName()).sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());		
		System.out.println(Descending);
		System.out.println(" ");

		// Ascending Object
		List<Student> ObjectAscending = stds.stream().sorted(Comparator.comparing(Student::getId))
				.collect(Collectors.toList());
		System.out.println(ObjectAscending);
		System.out.println(" ");
		
		// Descending Object
		List<Student> ObjectDescending = stds.stream().sorted(Comparator.comparing(Student::getId).reversed())
				.collect(Collectors.toList());
		System.out.println(ObjectDescending);
		System.out.println(" ");
		
		// Find First
		Student findFirst = stds.stream().findFirst().get();
		System.out.println(findFirst);
		System.out.println(" ");
		
		// Any Match
		boolean anyMatch = stds.stream().anyMatch(x -> x.getId() == 2);
		System.out.println(anyMatch);
		System.out.println(" ");

		// finding unique value
		List<Integer> unique = stds.stream().map(x -> x.getAge()).distinct().collect(Collectors.toList());
		System.out.println(unique);
		System.out.println(" ");

		// summing Integer
		int totalAge = stds.stream().collect(Collectors.summingInt(x -> x.getAge()));
		System.out.println(totalAge);
		System.out.println(" ");

		// grouping By
		Map<String, Long> Group = stds.stream().collect(Collectors.groupingBy(x -> x.getName(), Collectors.counting()));
		System.out.println(Group);
		System.out.println(" ");

		// FlatMap
		Map<String, Long> a1 = stds.stream().map(x -> x.getName())
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(a1);

		// fibonacci series
		Stream.iterate(new int[] { 0, 1 }, x -> new int[] { x[1], x[0] + x[1] }).limit(10).map(x -> x[0])
				.forEach(System.out::println);
		
	}

}

class Student {
	private int id;
	private String name;
	private int age;
	private boolean isPrimary;
	private float weight;

	public Student(int id, String name, int age, boolean isPrimary, float weight) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.isPrimary = isPrimary;
		this.weight = weight;
	}

	public String toString() {
		return id + " " + name + " " + age + " " + isPrimary + " " + weight;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean getPrimary() {
		return isPrimary;
	}

	public float getWeight() {
		return weight;
	}
}