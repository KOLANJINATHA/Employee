package javaEight;

import java.util.Optional;

public class OptionalException {
	public static void main(String[] args) {
		User user1= new User("john",null,"doe");
		
		User user2 = new User("jane","smith","Mary");
		System.out.println(User.getFullName(user1));
		System.out.println(User.getFullName(user2));
	}

}
class User {
	private String firstName;
	private String middleName;
	private String lastName;
	public String getFirstName() {
		return  firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public User(String a,String b,String c) {
		firstName=a;
		middleName=b;
		lastName=c;
	}
	public Optional<String> getMiddleName(){
		return Optional.ofNullable(middleName);
	}
	public static String getFullName(User user) {
		return user.getFirstName()+" "+user.getMiddleName().orElse("No Middle Name")+" "+user.getLastName();
	}
}