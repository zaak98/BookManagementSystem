import java.util.Scanner;

public class MenuManager {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookmanager = new BookManager(input);
		
		int num = -1;
		while (num != 5) {
			showMenu();
			num = input.nextInt();
			switch (num) {
			case 1 : 
				bookmanager.addBook();
				break;
			case 2 :
				bookmanager.deleteBook();
				break;
			case 3 : 
				bookmanager.editBook();
				break;
			case 4 : 
				bookmanager.viewBooks();
				break;
			default :
				continue;
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
	
}
