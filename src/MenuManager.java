import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookmanager = getObject("bookmanager.ser");
		if (bookmanager == null) {
			bookmanager = new BookManager(input);
		}
		else {
            bookmanager.setScanner(input);
        }
		
		selectMenu(input, bookmanager);
		putObject(bookmanager, "bookmanager.ser");
	}
	
	public static void selectMenu(Scanner input, BookManager bookmanager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch (num) {
				case 1 : 
					bookmanager.addBook();
					logger.log("add a book");
					break;
				case 2 :
					bookmanager.deleteBook();
					logger.log("delete a book");
					break;
				case 3 : 
					bookmanager.editBook();
					logger.log("edit a book");
					break;
				case 4 : 
					bookmanager.viewBooks();
					logger.log("edit a list of books");
					break;
				default :
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println ("***Book Management System Menu***");
		System.out.println ("1. Add Book");
		System.out.println ("2. Delete Book");
		System.out.println ("3. Edit Book");
		System.out.println ("4. View Book");
		System.out.println ("5. Exit");
		System.out.println ("Select one number between 1 - 5 :");
	}
	
	public static BookManager getObject(String filename) {
		BookManager bookmanager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			bookmanager = (BookManager) in.readObject();
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return bookmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookmanager;
	}
	
	public static void putObject(BookManager bookmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(bookmanager);
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
