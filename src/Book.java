public class Book {
	
	int number;
	String name;
	String auther;
	String publisher;
	
	public Book() {
		
	}
	
	public Book(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Book(int number, String name, String auther, String publisher) {
		this.number = number;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
	}
	
	public void printInfo() {
		System.out.println("number = " + number + " name = " + name + " auther = " + auther + " publisher = " + publisher);
	}

}
