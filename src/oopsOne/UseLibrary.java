package oopsOne;

public class UseLibrary {
	public static void main(String[] args) {
		Books b=new Books();
		b.name="Adventures of kolanji";
		b.price=10000;
		b.author="kolanji";
		b.genre="crime,thiller";
		Books1 b1 =new Books1();
		b1.name="nah";
		b1.price=2000;
		b1.author="ram";
		b1.genre="crime";
		
		
		Library l=new Library();
		l.name="oxford";
		l.membersAllowed=100;
		l.ispublic=true;
		l.location="england";
		l.books=b;
		l.book=b1;
		System.out.println(l.name+" "+l.books.name+" "+l.book.author);
		System.out.println(b.name);
	}

}


class Library {
	String name;
	int membersAllowed;
	boolean ispublic;
	String location;
	Books books;
	Books1 book;
}

class Books {
	String name;
	int price;
	String genre;
	String author;
	
}
	
class Books1 {
	String name;
	int price;
	String genre;
	String author;
}
