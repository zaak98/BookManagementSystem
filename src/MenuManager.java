import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println ("***Book Management System Menu***");
			System.out.println ("1. Add Book");
			System.out.println ("2. Delete Book");
			System.out.println ("3. Edit Book");
			System.out.println ("4. View Book");
			System.out.println ("5. Show a menu");
			System.out.println ("6. Exit");
			System.out.println ("Select one number between 1 - 6 :");
			num = input.nextInt();
			if (num == 1) {
				addBook();
			}
			if (num == 2) {
				deleteBook();
			}
			if (num == 3) {
				editBook();
			}
			if (num == 4) {
				viewBook();
			}
		}
	}
	public static void addBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book number : ");
		String bookNumber = input.next();
		System.out.print("Book name : ");
		String bookName = input.next();
		System.out.print("Book author : ");
		String bookAuther = input.next();
		System.out.print("Book publisher : ");
		String bookPublisher = input.next();
	}
	
	public static void deleteBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book number : ");
		String bookNumber = input.next();
	}
	
	public static void editBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book number : ");
		String bookNumber = input.next();
	}

	public static void viewBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book number : ");
		String bookNumber = input.next();
	}
}
