import java.util.Scanner;

public class BookManager {
	
	Book book;
	
	Scanner input;
	
	BookManager (Scanner input) {
		this.input = input;
	}
	
	public void addBook() {
		book = new Book();
		System.out.print("Book number : ");
		book.number = input.nextInt();
		System.out.print("Book name : ");
		book.name = input.next();
		System.out.print("Book author : ");
		book.auther = input.next();
		System.out.print("Book publisher : ");
		book.publisher = input.next();
	}
	
	public void deleteBook() {
		System.out.print("Book number : ");
		int bookNumber = input.nextInt();
		if (book == null) {
			System.out.println("the book has not been registered");
			return;
		}
		if (book.number == bookNumber) {
			book = null;
			System.out.println("the book is deleted");
		}
	}
	
	public void editBook() {
		System.out.print("Book number : ");
		int bookNumber = input.nextInt();
		if (book.number == bookNumber) {
			System.out.println("the book to be edited is : " + bookNumber);
		}
	}

	public void viewBook() {
		System.out.print("Book number : ");
		int bookNumber = input.nextInt();
		if (book.number == bookNumber) {
			book.printInfo();
		}
	}

}
