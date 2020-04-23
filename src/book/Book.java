package book;
import java.util.Scanner;

public class Book {
	
	protected BookKind kind = BookKind.Nonfiction;
	protected int number;
	protected String name;
	protected String auther;
	protected String publisher;
	
	public Book() {
		
	}
	
	public Book(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Book(BookKind kind, int number, String name, String auther, String publisher) {
		this.kind = kind;
		this.number = number;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
	}
	
	public Book(int number, String name, String auther, String publisher) {
		this.number = number;
		this.name = name;
		this.auther = auther;
		this.publisher = publisher;
	}
	
	public BookKind getKind() {
		return kind;
	}

	public void setKind(BookKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Nonfiction:
			skind = "Nonfiction";
			break;
		case Magazine:
			skind = "Magazine";
			break;
		case Major:
			skind = "Major";
			break;
		default:
		}
		System.out.println("kind = " + skind + " number = " + number + " name = " + name + " auther = " + auther + " publisher = " + publisher);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Book number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Book name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Book author : ");
		String auther = input.next();
		this.setAuther(auther);
		
		System.out.print("Book publisher : ");
		String publisher = input.next();
		this.setPublisher(publisher);
	}

}