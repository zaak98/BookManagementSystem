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
			int num = -1;
			while (num != 5) {
				System.out.println ("**Book Info Edit Menu**");
				System.out.println ("1. Edit Number");
				System.out.println ("2. Edit Name");
				System.out.println ("3. Edit Auther");
				System.out.println ("4. Edit Publisher");
				System.out.println ("5. Exit");
				System.out.println ("Select one number between 1 - 5 :");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Book number : ");
					book.number = input.nextInt();
				}
				if (num == 2) {
					System.out.print("Book name : ");
					book.name = input.next();
				}
				if (num == 3) {
					System.out.print("Book auther : ");
					book.auther = input.next();
				}
				if (num == 4) {
					System.out.print("Book publisher : ");
					book.publisher = input.next();
				}
				else {
					continue;
				}
			}
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
