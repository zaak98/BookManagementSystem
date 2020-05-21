package book;
import java.util.Scanner;
import exception.AutherFormatException;
import java.io.Serializable;

public abstract class Book implements BookInput, Serializable {
	
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
	
	public Book(BookKind kind) {
		this.kind = kind;
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

	public void setAuther(String auther) throws AutherFormatException {
		if(!auther.contains("@") && !auther.equals("")) {
			throw new AutherFormatException();
		}
		this.auther = auther;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setBookNumber(Scanner input) {
		System.out.print("Book number : ");
		int number = input.nextInt();
		this.setNumber(number);
	}
	
	public void setBookName(Scanner input) {
		System.out.print("Book name : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setBookAuther(Scanner input) {
		String auther = "";
		while(!auther.contains("@")) {
			System.out.print("Book auther : ");
			auther = input.next();
			try {
				this.setAuther(auther);
			} catch(AutherFormatException e) {
				System.out.println("Incorrect Auther Format. Put the Auther without mark character");
			}
		}
		
	}
	
	public void setBookPublisher(Scanner input) {
		System.out.print("Book publisher : ");
		String publisher = input.next();
		this.setPublisher(publisher);
	}
	
	public String getKindString() {
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
		return skind;
	}


	public abstract void printInfo();

}