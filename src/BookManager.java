import java.util.ArrayList;
import java.util.Scanner;

import book.Book;
import book.MagazineBook;
import book.MajorBook;

public class BookManager {
	
	ArrayList<Book> books = new ArrayList<Book>();
	
	Scanner input;
	
	BookManager (Scanner input) {
		this.input = input;
	}
	
	public void addBook() {
		int kind = 0;
		Book book;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Nonfiction ");
			System.out.println("2 for Magazine ");
			System.out.println("3 for Major ");
			System.out.println("Select num 1 or 2 or 3 for Book Kind: ");
			kind = input.nextInt();
			if(kind == 1) {
				book = new Book();
				book.getUserInput(input);
				books.add(book);
				break;
			}
			else if(kind == 2) {
				book = new MagazineBook();
				book.getUserInput(input);
				books.add(book);
				break;
			}
			else if(kind == 3) {
				book = new MajorBook();
				book.getUserInput(input);
				books.add(book);
				break;
			}
			else {
				System.out.print("Select num for Book Kind between 1, 2 and 3: ");
			}		
		}		
	}
	
	public void deleteBook() {
		System.out.print("Book number : ");
		int bookNumber = input.nextInt();
		int index = -1;
		for (int i=0; i<books.size();i++) {
			if (books.get(i).getNumber() == bookNumber) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			books.remove(index);
			System.out.println("the book"  + bookNumber + "is deleted");
		}
		else {
			System.out.println("the book has not been registered");
			return;
		}
	}
	
	
	public void editBook() {
		System.out.print("Book number : ");
		int bookNumber = input.nextInt();
		for (int i=0; i<books.size();i++) {
			Book book = books.get(i);
			if (book.getNumber() == bookNumber) {
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
						int number = input.nextInt();
						book.setNumber(number);
					}
					if (num == 2) {
						System.out.print("Book name : ");
						String name = input.next();
						book.setName(name);
					}
					if (num == 3) {
						System.out.print("Book auther : ");
						String auther = input.next();
						book.setAuther(auther);
					}
					if (num == 4) {
						System.out.print("Book publisher : ");
						String publisher = input.next();
						book.setPublisher(publisher);
					}
					else {
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

}