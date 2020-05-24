import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import book.Book;
import book.BookInput;
import book.BookKind;
import book.MagazineBook;
import book.MajorBook;
import book.NonfictionBook;

public class BookManager implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8867333931238636841L;
	
	ArrayList<BookInput> books = new ArrayList<BookInput>();
	transient Scanner input;
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addBook() {
		int kind = 0;
		BookInput bookInput;
		while (kind < 1 || kind > 2) {
			try {
				System.out.println("go into add books in while");
				System.out.println("1 for Nonfiction ");
				System.out.println("2 for Magazine ");
				System.out.println("3 for Major ");
				System.out.println("Select num 1 or 2 or 3 for Book Kind: ");
				kind = input.nextInt();
				if(kind == 1) {
					bookInput = new NonfictionBook(BookKind.Nonfiction);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if(kind == 2) {
					bookInput = new MagazineBook(BookKind.Magazine);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else if(kind == 3) {
					bookInput = new MajorBook(BookKind.Major);
					bookInput.getUserInput(input);
					books.add(bookInput);
					break;
				}
				else {
					System.out.print("Select num for Book Kind between 1, 2 and 3: ");
				}	
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}		
	}
	
	public void deleteBook() {
		System.out.print("Book number : ");
		int bookNumber = input.nextInt();
		int index = findIndex(bookNumber);
		removefromBooks(index, bookNumber);
	}
	
	public int findIndex(int bookNumber) {
		int index = -1;
		for (int i=0; i<books.size();i++) {
			if (books.get(i).getNumber() == bookNumber) {
				index = i;
				break;
			}
		}
	return index;
	}
	
	public int removefromBooks(int index, int bookNumber) {
		if (index >= 0) {
			books.remove(index);
			System.out.println("the book"  + bookNumber + "is deleted");
			return 1;
		}
		else {
			System.out.println("the book has not been registered");
			return -1;
		}
	}
	
	
	public void editBook() {
		System.out.print("Book number : ");
		int bookNumber = input.nextInt();
		for (int i=0; i<books.size();i++) {
			BookInput book = books.get(i);
			if (book.getNumber() == bookNumber) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1 :
						book.setBookNumber(input);
						break;
					case 2 :
						book.setBookName(input);
						break;
					case 3 : 
						book.setBookAuther(input);
						break;
					case 4 :
						book.setBookPublisher(input);
						break;
					default : 
						continue;
					}
				}	
				break;
			}
		}
	}

	public void viewBooks() {
		System.out.println("# of registered books: " + books.size());
		for (int i=0; i<books.size();i++) {
			books.get(i).printInfo();
		}
	}
	
	
	public void showEditMenu() {
		System.out.println ("**Book Info Edit Menu**");
		System.out.println ("1. Edit Number");
		System.out.println ("2. Edit Name");
		System.out.println ("3. Edit Auther");
		System.out.println ("4. Edit Publisher");
		System.out.println ("5. Exit");
		System.out.println ("Select one number between 1 - 5 :");
	}
	

}